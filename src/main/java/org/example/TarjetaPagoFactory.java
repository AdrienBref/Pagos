package org.example;

public class TarjetaPagoFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoTarjeta();
    }
}
