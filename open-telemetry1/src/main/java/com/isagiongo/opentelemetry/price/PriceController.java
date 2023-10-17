package com.isagiongo.opentelemetry.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/com/isagiongo/opentelemetry/price")
public class PriceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PriceController.class);

    @Autowired
    private PriceRepository priceRepository;

    @GetMapping(path = "/{id}")
    public Price getPrice(@PathVariable("id") long productId) {
        LOGGER.info("Getting Price details for Product Id {}", productId);
        return priceRepository.getPrice(productId);
    }
}

