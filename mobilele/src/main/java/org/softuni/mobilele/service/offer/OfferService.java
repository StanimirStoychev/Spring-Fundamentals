package org.softuni.mobilele.service.offer;

import org.softuni.mobilele.model.dto.offer.CreateOfferDTO;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDTO createOfferDTO);
}
