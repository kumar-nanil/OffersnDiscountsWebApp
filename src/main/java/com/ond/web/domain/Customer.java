package com.ond.web.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Created by vdraj on 9/13/2016.
 */

@Entity
public class Customer {
    @Id Long id;
    @Index String emailId;
    String firstName;
    String lastName;

    public Customer(String emailId) {
        this.emailId = emailId;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", emailId='" + emailId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
