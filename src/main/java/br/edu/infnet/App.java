package br.edu.infnet;

import br.edu.infnet.conversor.ConversorMoeda;
import br.edu.infnet.dolar.Dolar;
import br.edu.infnet.dolar.DolarService;
import br.edu.infnet.euro.Euro;
import br.edu.infnet.euro.EuroService;

public class App 
{
    public static void main( String[] args ) {
        DolarService dolarService = new DolarService();
        EuroService euroService = new EuroService();
        ConversorMoeda conversorMoeda = new ConversorMoeda(dolarService, euroService);


        Dolar dolar = new Dolar(100.0);
        Euro euro = new Euro (120.0);

        double valorEmRealDolar = conversorMoeda.converterDolarParaReal(dolar);
        double valorEmRealEuro = conversorMoeda.converterEuroParaReal(euro);

        System.out.println("Valor em reais (Dólar): R$ " + valorEmRealDolar);
        System.out.println("Valor em reais (Euro): R$ " + valorEmRealEuro);

    }
}
