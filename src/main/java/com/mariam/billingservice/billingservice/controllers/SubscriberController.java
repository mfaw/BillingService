package com.mariam.billingservice.billingservice.controllers;

import com.mariam.BillingService.api.VoisApi;
import com.mariam.BillingService.models.Subscriber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SubscriberController implements VoisApi {

    @Override
    public ResponseEntity<Void> createSubscriber(Subscriber body) {
        System.out.println(body.getSubscribed());
        return null;
    }

    @Override
    public ResponseEntity<List<Subscriber>> getAllSubscribersByBan(String ban) {
        List<Subscriber> subscribers = new ArrayList<>();
        Subscriber s1 = new Subscriber();
        s1.setSubscribed("1");
        s1.setBan(ban);
        s1.setAmountDue("500");
        s1.setBalanceAmount("1000");
        s1.setBalanceType("credit");

        Subscriber s2 = new Subscriber();
        s2.setSubscribed("2");
        s2.setBan(ban);
        s2.setAmountDue("0");
        s2.setBalanceAmount("653");
        s2.setBalanceType("credit");

        subscribers.add(s1);
        subscribers.add(s2);

        return new ResponseEntity<>(subscribers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Subscriber>> getSubscriber(String ban, String subscriber) {
        List<Subscriber> subscribers = new ArrayList<>();
        Subscriber s1 = new Subscriber();
        s1.setSubscribed(subscriber);
        s1.setBan(ban);
        s1.setAmountDue("500");
        s1.setBalanceAmount("1000");
        s1.setBalanceType("credit");

        subscribers.add(s1);

        return new ResponseEntity<>(subscribers, HttpStatus.OK);
    }
}
