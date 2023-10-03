package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.offer.CreateOfferDTO;
import org.softuni.mobilele.model.entity.enums.Engine;
import org.softuni.mobilele.model.entity.enums.Transmission;
import org.softuni.mobilele.service.offer.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @ModelAttribute("engines")
    public Engine[] engines() {
        return Engine.values();
    }

    @ModelAttribute("transmissions")
    public Transmission[] transmissions() {
        return Transmission.values();
    }

    @GetMapping("/all")
    public String all() {
        return "offers";
    }

    @GetMapping("/add")
    public String add() {
        return "offer-add";
    }

    @PostMapping
    public String add(CreateOfferDTO createOfferDTO) {
        offerService.createOffer(createOfferDTO);
        return "index";
    }

    @GetMapping("/{uuid}/details")
    public String details(@PathVariable("uuid")UUID uuid) {
        return "details";
    }
}
