package com.apparelshop.databaseservice.controller;

import com.apparelshop.databaseservice.entity.Offer;
import com.apparelshop.databaseservice.entity.OfferDto;
import com.apparelshop.databaseservice.service.IOfferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IOfferService service;


    @PutMapping(path = "/save")
    public void saveData(@RequestBody List<Offer> offers)
    {
        service.saveAllOffers(offers);
    }

    @GetMapping(path = "/retrieve")
    public List<OfferDto> getAllData()
    {
        logger.info("Retrieving all offers...");
        return service.getAllOffers();
    }

}
