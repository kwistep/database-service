package com.apparelshop.databaseservice.service;

import com.apparelshop.databaseservice.entity.Offer;
import com.apparelshop.databaseservice.entity.OfferDto;

import java.util.List;

public interface IOfferService {

    void saveAllOffers(List<Offer> offers);

    List<OfferDto> getAllOffers();

}
