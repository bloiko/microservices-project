package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    @GetMapping("/home-one")
    public String getPropertyValue() {
        return "home-one";
    }
}
