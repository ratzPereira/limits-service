package ratz.microservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ratz.microservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {


    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){

        return new LimitsConfiguration(1000,1);
    }
}
