package br.edu.infnet;

import br.edu.infnet.exception.ValorInvalidoException;

public class Conversor {
    public double conversao(double a, double b){
        return a * b;
    }

    public double conversaoPositivo(double a, double b){
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            throw new ValorInvalidoException("Os números devem ser positivos");
        }
    }
}
