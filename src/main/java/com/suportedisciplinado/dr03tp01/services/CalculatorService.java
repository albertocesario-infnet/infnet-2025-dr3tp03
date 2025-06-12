package com.suportedisciplinado.dr03tp01.services;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalculatorService {

    @PostMapping("/add")
    public Double add(@RequestParam Double a, @RequestParam Double b) {
        Double result = a + b;
        return result;
    }

    @PostMapping("/subtract")
    public Double subtract(@RequestParam Double a, @RequestParam Double b) {
        Double result = a - b;
        return result;
    }

    @PostMapping("/multiply")
    public Double multiply(@RequestParam Double a, @RequestParam Double b) {
        Double result = a * b;
        return result;
    }

    @PostMapping("/divide")
    public Double divide(@RequestParam Double a, @RequestParam Double b) {
        Double result = a / b;
        return result;
    }
}
