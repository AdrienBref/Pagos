package org.example;

public class PagoEfectivo implements Pago{

    public void realizarPago() {
        System.out.println("Realizado Pago en Efectivo");
    }

    public void generarRecibo() {
        System.out.println("Aquí su recibo en Efectivo");
    }

    public void devolverPago() {
        System.out.println("Devolución hecho En Efectivo");
    }
}
