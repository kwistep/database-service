package com.apparelshop.databaseservice.repository;

import com.apparelshop.databaseservice.entity.Offer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOfferRepository extends ElasticsearchRepository<Offer, Integer> {


}
