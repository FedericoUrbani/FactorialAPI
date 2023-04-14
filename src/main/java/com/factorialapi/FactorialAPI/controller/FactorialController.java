package com.factorialapi.FactorialAPI.controller;

import com.factorialapi.FactorialAPI.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
    @Autowired
    FactorialService factorialService;
    @GetMapping("/{numb}")
        public Integer factorialOutput(@PathVariable(required = true, value = "numb") Integer numb){
        return factorialService.factorialService(numb);
    }

}
