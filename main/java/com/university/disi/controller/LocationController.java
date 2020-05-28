package com.university.disi.controller;

import com.university.disi.dto.LocationDTO;
import com.university.disi.entity.Location;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/location")
public class LocationController {
    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        locationService.deleteLocation(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Location deleted successfully.", null);
    }

    @GetMapping
    public ApiResponse<List<Location>> listLocations() {
        return new ApiResponse<>(HttpStatus.OK.value(), "Locations list fetched successfully.",
                locationService.showLocations());
    }

    @GetMapping("/{id}")
    public ApiResponse<Location> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Patient fetched successfully.",locationService.findById(id));
    }
    @PostMapping
    public ApiResponse<Location> saveLocation(@RequestBody LocationDTO locationDTO) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Location saved successfully.",
                locationService.createLocation(locationDTO));
    }

    @PutMapping("/{id}")
    public ApiResponse<LocationDTO> update(@PathVariable int id, @RequestBody LocationDTO locationDto) {
        locationService.updateLocation(id, locationDto);
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin updated successfully.", null
        );
    }
}
