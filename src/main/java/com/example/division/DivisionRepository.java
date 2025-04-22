package com.example.division;

import org.springframework.stereotype.Repository;

@Repository
public class DivisionRepository {

    // Simula base de datos
    public int dividir(int a, int b) {
        return a / b;
    }
}
