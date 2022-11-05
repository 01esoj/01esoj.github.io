package pruebaJunit;

public class CocheTest {
    public static void main(String[] args) throws Exception{//como esto podía lanzar excepción, se la hemos puesto
        Coche p = new Coche("Audi A3",10000);
        Coche.impuesto=20f;
        System.out.println("Precio final: " + p.precioFinal(10f));//llamamos al precio final con un dscto del 10%   
    }
}
