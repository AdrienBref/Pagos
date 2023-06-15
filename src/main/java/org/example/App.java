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

    }
}
