package com.booking.ticket.service;


import com.booking.ticket.Model.BusFilter;
import com.booking.ticket.Model.BusOptions;
import org.springframework.stereotype.Service;

@Service
public interface BusesAvailableService {
   public BusOptions getAllbuses(BusFilter filter);
}
