package org.example;

public class PagoPayPal implements Pago{
    public void realizarPago() {
        System.out.println("Realizado Pago con Paypal");
    }

    public void generarRecibo() {
        System.out.println("Aquí su recibo con Paypal");
    }

    public void devolverPago() {
        System.out.println("Devolución hecho con Paypal");
    }
}
