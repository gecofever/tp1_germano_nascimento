package br.edu.infnet.dolar;

import lombok.Data;

@Data
public class Dolar {
    private Double valor;

    public Dolar(Double valor) {
        this.valor = valor;
    }
}
