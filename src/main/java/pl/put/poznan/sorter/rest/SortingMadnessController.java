package pl.put.poznan.sorter.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.sorter.service.SortService;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    private final SortService sortService;

    @Autowired
    public SortingMadnessController(SortService sortService) {
        this.sortService = sortService;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@RequestBody String request) {
        logger.debug("Received sort request: {}", request);

        return "";
    }
}


