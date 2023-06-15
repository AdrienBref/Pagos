package org.example;

public class PayPalPagoFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoPayPal();
    }
}
