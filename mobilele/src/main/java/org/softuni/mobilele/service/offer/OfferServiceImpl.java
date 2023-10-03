package org.softuni.mobilele.service.offer;

import org.softuni.mobilele.model.dto.offer.CreateOfferDTO;
import org.softuni.mobilele.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDTO createOfferDTO) {
        //todo - create offer
        throw new UnsupportedOperationException("Coming soon!");
    }
}
