package com.booking.ticket.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
public class BusFilter {

    private Date start_time;
    private Location Source;
    private Location destination;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusFilter busFilter = (BusFilter) o;
        return Objects.equals(start_time, busFilter.start_time) && Objects.equals(Source, busFilter.Source) && Objects.equals(destination, busFilter.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start_time, Source, destination);
    }

    @Override
    public String toString() {
        return "BusFilter{" +
                "start_time=" + start_time +
                ", Source=" + Source +
                ", destination=" + destination +
                '}';
    }
}
