package org.example;

public class PagoTarjeta implements Pago{
    public void realizarPago() {
        System.out.println("Realizado Pago con Tarjeta");
    }

    public void generarRecibo() {
        System.out.println("Aquí su recibo con Tarjeta");
    }

    public void devolverPago() {
        System.out.println("Devolución hecho con Tarjeta");
    }
}
