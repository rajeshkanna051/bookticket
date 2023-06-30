package com.booking.ticket.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusOptions {

    private int bus_id;
    private int location_id;
    private String bus_name;
    private Date arrival;
    private Date departure;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusOptions that = (BusOptions) o;
        return bus_id == that.bus_id && location_id == that.location_id && Objects.equals(bus_name, that.bus_name) && Objects.equals(arrival, that.arrival) && Objects.equals(departure, that.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bus_id, location_id, bus_name, arrival, departure);
    }

    @Override
    public String toString() {
        return "BusOptions{" +
                "bus_id=" + bus_id +
                ", location_id=" + location_id +
                ", bus_name='" + bus_name + '\'' +
                ", arrival=" + arrival +
                ", departure=" + departure +
                '}';
    }
}
