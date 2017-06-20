package rtms.locationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rtms.locationService.model.Location;
import rtms.locationService.model.LocationRepository;

import java.util.List;

/**
 * Created by lujianyu on 6/18/17.
 */
@RestController
public class BulkUploadController {
    private LocationRepository locationRepository;

    @Autowired
    public BulkUploadController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @RequestMapping(value = "/fleet", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<Location> trucks) throws Exception {
        this.locationRepository.save(trucks);
    }

    @RequestMapping(value = "/purge", method = RequestMethod.POST)
    public void purge() {
        this.locationRepository.deleteAll();
    }
}
