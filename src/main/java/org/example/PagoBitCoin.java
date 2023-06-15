package org.example;

public class PagoBitCoin implements Pago{

    public void realizarPago() {
        System.out.println("Realizado Pago con BitCoin");
    }

    public void generarRecibo() {
        System.out.println("Aquí su recibo con BitCoin");
    }

    public void devolverPago() {
        System.out.println("Devolución hecho con BitCoin");
    }
}
