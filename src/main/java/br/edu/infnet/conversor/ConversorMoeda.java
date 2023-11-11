package br.edu.infnet.conversor;

import br.edu.infnet.dolar.Dolar;
import br.edu.infnet.dolar.DolarService;
import br.edu.infnet.euro.Euro;
import br.edu.infnet.euro.EuroService;

public class ConversorMoeda {
    private final DolarService dolarService;
    private final EuroService euroService;

    public ConversorMoeda(DolarService dolarService, EuroService euroService) {
        this.dolarService = dolarService;
        this.euroService = euroService;
    }

    public double converterDolarParaReal(Dolar dolar) {
        return dolarService.converterParaReal(dolar);
    }

    public double converterEuroParaReal(Euro euro) {
        return euroService.converterParaReal(euro);
    }
}
