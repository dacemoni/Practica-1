package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroParService {
    public String par(int num) {
        if (num % 2 == 0) {
            return "El número es par";
        } else {
            return "El número es impar";
        }
    }
}
