package com.university.disi.service.impl;

import com.university.disi.dto.LocationDTO;
import com.university.disi.entity.Location;
import com.university.disi.repository.LocationRepository;
import com.university.disi.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {
    private LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void deleteLocation(int id) {
        Optional<Location> locationToBeDeleted = locationRepository.findById(id);
        locationRepository.delete(locationToBeDeleted.get());
    }

    public Location createLocation(LocationDTO locationDTO) {
        Location locationToBeSaved = new Location();
        locationToBeSaved.setName(locationDTO.getName());
        return locationRepository.save(locationToBeSaved);
    }

    public List<Location> showLocations() {
        return locationRepository.findAll();
    }

    public void updateLocation(int id, LocationDTO locationDTO) {
        Optional<Location> locationToBeUpdated = locationRepository.findById(id);
        locationToBeUpdated.get().setName(locationDTO.getName());
        locationRepository.save(locationToBeUpdated.get());
    }

    @Override
    public Location findById(int id) {
        Optional<Location> optionalLocation= locationRepository.findById(id);
        return optionalLocation.isPresent() ? optionalLocation.get() : null;

    }



}
