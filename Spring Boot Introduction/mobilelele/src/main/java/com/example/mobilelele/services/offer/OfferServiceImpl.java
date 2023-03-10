package com.example.mobilelele.services.offer;

import com.example.mobilelele.repositories.OfferRepository;
import com.example.mobilelele.services.init.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DataBaseInitService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.offerRepository.count() > 0;
    }
}
