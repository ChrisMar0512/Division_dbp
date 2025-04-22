package com.example.division;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("'b' no puede ser cero");
        }
        if (a == b) {
            throw new IllegalArgumentException("'a' no puede ser igual a 'b'");
        }
        if (a < b) {
            throw new IllegalArgumentException("'a' no puede ser menor que 'b'");
        }

        return divisionRepository.dividir(a, b);
    }
}