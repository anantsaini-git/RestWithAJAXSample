package com.example.restsample.services;

import com.example.restsample.resource.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceControlller {

    @RequestMapping(method = RequestMethod.GET, path = "/getResource")
    public String getResource() {
        return "Sample Data";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getJSONResource")
    public Resource getJSONResource() {
        return new Resource("ID 1", "Data 1");
    }
}
