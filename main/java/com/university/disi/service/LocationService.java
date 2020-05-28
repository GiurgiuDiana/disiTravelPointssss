package com.university.disi.service;

import com.university.disi.dto.LocationDTO;
import com.university.disi.entity.Location;

import java.util.List;

public interface LocationService {
    public void deleteLocation(int id);

    public Location createLocation(LocationDTO locationDTO);

    public List<Location> showLocations();

    public void updateLocation(int id, LocationDTO locationDTO);


    Location findById(int id);
}
