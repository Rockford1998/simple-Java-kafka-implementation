package com.cab_booking_driver.cab_booking_driver.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public  boolean updateCabLocation(String cabLocation) {
        kafkaTemplate.send("cab-location", cabLocation);
        return true;
    }
}
