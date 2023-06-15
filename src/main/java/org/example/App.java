package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PagoFactory factory = new EfectivoPagoFactory();
        Pago pago = factory.crearPago();
        pago.realizarPago();
        pago.devolverPago();
        pago.generarRecibo();

        factory = new BitCoinPagoFactory();
        pago = factory.crearPago();
        pago.realizarPago();
        pago.devolverPago();
        pago.generarRecibo();

        factory = new PayPalPagoFactory();
        pago = factory.crearPago();
        pago.realizarPago();
        pago.devolverPago();
        pago.generarRecibo();

        factory = new TarjetaPagoFactory();
        pago = factory.crearPago();
        pago.realizarPago();
        pago.devolverPago();
        pago.generarRecibo();



    }
}
