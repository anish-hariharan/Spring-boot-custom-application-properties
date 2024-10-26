package com.spidey.custom_application_properties_practice.router;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CustomRouters {
    @Value("${router.greet}")
    private String greetMsg;

    @Value("${router.home}")
    private String homeMsg;

    @Value("${router.dreamCompany}")
    private String dreamCompany;

    @GetMapping("/")
    public String home(){
        return this.homeMsg;
    }

    @GetMapping("/greet")
    public String gret(){
        return this.greetMsg;
    }

    @GetMapping("/showDreamCompany")
    public String getDreamCompany(){
        return this.dreamCompany;
    }
}
