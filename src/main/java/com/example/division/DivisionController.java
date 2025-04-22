package com.example.division;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/division")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    @GetMapping("/{a}/{b}")
    public ResponseEntity<?> dividir(@PathVariable int a, @PathVariable int b) {
        try {
            int resultado = divisionService.dividir(a, b);
            return ResponseEntity.ok(resultado);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body("Error 400: " + ex.getMessage());
        }
    }
}