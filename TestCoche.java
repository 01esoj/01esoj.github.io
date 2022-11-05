package pruebaJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCoche {

    @Test
    public void testPrecioFinal() throws Exception {
        
        System.out.println("precioFinal");
        float descuento = 10.0f;
        Coche instance = new Coche("Audi A3", 10000);
        Coche.impuesto = 20f;
        float expResult = 10800;// si cambiamos el precio da error
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);// delta=diferencia máx. permitida

    }

}
