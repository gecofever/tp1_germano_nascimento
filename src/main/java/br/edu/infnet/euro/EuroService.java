package br.edu.infnet.euro;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EuroService {
    private static final double TAXA_CAMBIO = 6.10;

    public double converterParaReal(Euro euro) {
        if (euro != null && euro.getValor() != null) {
            return euro.getValor() * TAXA_CAMBIO;
        } else {
            return 0;
        }
    }
}
