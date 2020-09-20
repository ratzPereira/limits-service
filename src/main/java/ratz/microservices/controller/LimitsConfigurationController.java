package ratz.microservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ratz.microservices.Configuration;
import ratz.microservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {


    private Configuration configuration;


    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }



    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){

        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
