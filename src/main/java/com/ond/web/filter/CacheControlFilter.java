package com.ond.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class CacheControlFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        httpServletResponse.setHeader("Expires", "Tue, 03 Jul 2001 06:00:00 GMT");
        httpServletResponse.setDateHeader("Last-Modified", new Date().getTime());
        httpServletResponse.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0, post-check=0, pre-check=0");
        httpServletResponse.setHeader("Pragma", "no-cache");

        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

}