package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class numeroParController {

    @Autowired
    private NumeroParService service;

    @RequestMapping("/numeropar/{num}")
    public @ResponseBody String numeroPar(@PathVariable(value="num") int num) { return service.esPar(num); }
}
