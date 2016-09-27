package com.ond.web.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ond.web.OnDConstants;
import com.ond.web.domain.FlipkartOffer;
import com.ond.web.repository.FlipkartRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdraj on 9/13/2016.
 */
@Service
public class FlipkartServiceImpl implements FlipkartService {

    private final static Logger LOGGER = Logger.getLogger(FlipkartServiceImpl.class);
    public static final String FLIPKART_ALL_OFFERS_LIST = "allOffersList";

    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    @Value("${property.flipkart.offers.url}")
    private String flipkartAllOffers;
    @Value("${property.flipkart.dealsoftheday.url}")
    private String flipkartDealsOfTheDay;
    @Value("${property.flipkart.affiliateid}")
    private String flipkartAffiliateId;
    @Value("${property.flipkart.token}")
    private String flipkartToken;
    @Autowired
    private ObjectMapper jsonMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HttpHeaders httpHeaders;
    @Autowired
    private FlipkartRepository flipkartRepository;

    public void saveAllOffersFlipkart() {
        HttpEntity<String> entity = setFlipkartHeaders();
        LOGGER.info("Request sent to Flipkart " + flipkartAllOffers);
        ResponseEntity<String> result = restTemplate.exchange(flipkartAllOffers, HttpMethod.GET, entity, String.class);
        if (result.getStatusCode().value() == 200) {
            LOGGER.info("Parsing result from Flipkart " + flipkartAllOffers);
            JsonParser jsonParser = new JsonParser();
            JsonObject jo = (JsonObject) jsonParser.parse(result.getBody());
            JsonArray jsonArr = jo.getAsJsonArray(FLIPKART_ALL_OFFERS_LIST);
            Gson googleJson = new Gson();
            List<FlipkartOffer> jsonObjList = googleJson.fromJson(jsonArr, new TypeToken<List<FlipkartOffer>>() {
            }.getType());
            long i = 0;
            List<FlipkartOffer> dataToSave = new ArrayList<FlipkartOffer>();
            for(FlipkartOffer flipkartOffer : jsonObjList) {
                flipkartOffer.setId(++i);
                dataToSave.add(flipkartOffer);
//                flipkartRepository.create(flipkartOffer);
            }
            flipkartRepository.createAll(dataToSave);
            System.out.println("List size is : " + jsonObjList.size());
            System.out.println("List Elements are  : " + jsonObjList.toString());
        }

        System.out.println("Offers loaded into DB");
    }

    public void saveFlipkartDealOfTheDay() {
        HttpEntity<String> entity = setFlipkartHeaders();
        LOGGER.info("Request sent to Flipkart " + flipkartDealsOfTheDay);
        ResponseEntity<String> result = restTemplate.exchange(flipkartDealsOfTheDay, HttpMethod.GET, entity, String.class);
        if (result.getStatusCode().value() == 200) {
            LOGGER.info("Parsing result from Flipkart " + flipkartDealsOfTheDay);
            JsonParser jsonParser = new JsonParser();
            JsonObject jo = (JsonObject) jsonParser.parse(result.getBody());
            JsonArray jsonArr = jo.getAsJsonArray(FLIPKART_ALL_OFFERS_LIST);
            Gson googleJson = new Gson();
            List<FlipkartOffer> jsonObjList = googleJson.fromJson(jsonArr, new TypeToken<List<FlipkartOffer>>() {
            }.getType());
            long i = 0;
            List<FlipkartOffer> dataToSave = new ArrayList<FlipkartOffer>();
            for(FlipkartOffer flipkartOffer : jsonObjList) {
                flipkartOffer.setId(++i);
                dataToSave.add(flipkartOffer);
//                flipkartRepository.create(flipkartOffer);
            }
            flipkartRepository.createAll(dataToSave);
            System.out.println("List size is : " + jsonObjList.size());
            System.out.println("List Elements are  : " + jsonObjList.toString());
        }

        System.out.println("Offers loaded into DB");
    }

    @Override
    public List<FlipkartOffer> allFlipkartOffers() {
        return flipkartRepository.getAll();
    }

    private HttpEntity<String> setFlipkartHeaders() {
        httpHeaders.set(OnDConstants.FK_AFFILIATE_ID, flipkartAffiliateId);
        httpHeaders.set(OnDConstants.FK_AFFILIATE_TOKEN, flipkartToken);
        return new HttpEntity<String>("parameters", httpHeaders);
    }
}
