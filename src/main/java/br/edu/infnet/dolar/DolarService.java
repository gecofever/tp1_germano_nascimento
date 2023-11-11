package br.edu.infnet.dolar;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DolarService {
    private static final double TAXA_CAMBIO = 5.30;

    public double converterParaReal(Dolar dolar) {
        if (dolar != null && dolar.getValor() != null) {
            return dolar.getValor() * TAXA_CAMBIO;
        } else {
            return 0;
        }
    }
}









/*package br.edu.infnet.dolar;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DolarService {
    private static final double TAXA_CAMBIO = 5.40;

    public double converterParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_CAMBIO;
    }
}*/
