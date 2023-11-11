package br.edu.infnet.euro;

import lombok.Data;

@Data

public class Euro {
    private Double valor;

    public Euro(Double valor) {
        this.valor = valor;
    }
}
