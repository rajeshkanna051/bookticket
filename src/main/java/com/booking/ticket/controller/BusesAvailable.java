package com.booking.ticket.controller;

import com.booking.ticket.Model.BusFilter;
import com.booking.ticket.Model.BusOptions;
import com.booking.ticket.service.BusesAvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusesAvailable {

    @Autowired
    private BusesAvailableService service;

    @PostMapping(path = "/buses/options")
    public BusOptions getAllBuses(@RequestBody BusFilter filter){

        BusOptions options = service.getAllbuses(filter);

        return options;

    }
}
