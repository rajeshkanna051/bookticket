package com.booking.ticket.service.impl;

import com.booking.ticket.Model.BusFilter;
import com.booking.ticket.Model.BusOptions;
import com.booking.ticket.service.BusesAvailableService;
import org.springframework.stereotype.Repository;

public class BusesAvailableServiceImpl implements BusesAvailableService {

    @Override
    public BusOptions getAllbuses(BusFilter filter) {
        return new BusOptions();
    }
}
