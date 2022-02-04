package com.example.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class locationController {


    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }


    @RequestMapping(method=RequestMethod.POST, value = "/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }
}
