package org.example;

public class EfectivoPagoFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoEfectivo();
    }
}
