package com.mdr.dottorebarista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/impressum")
    public String impressum() {
        return "impressum";
    }

    @GetMapping("/datenschutz")
    public String datenschutz() {
        return "datenschutz";
    }

    @GetMapping("/beratung")
    public String beratung() {
        return "beratung";
    }

    @GetMapping("/workshop")
    public String workshop() {
        return "workshop";
    }

    @GetMapping("/mentoring")
    public String mentoring() {
        return "mentoring";
    }
}
