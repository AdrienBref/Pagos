package org.example;

public class BitCoinPagoFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoBitCoin();
    }
}
