package pruebaJunit;

public class Coche {
    public String modelo;
    public float precioBase;
    public static float impuesto; //porcentaje entre 0 y 100 y ESTÁTICO pq es común para todas las instancias

    //constructor
    public Coche(String modelo, float precioBase) {
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    //MÉTODO que es precísamente el que queremos probar    
    
    public float precioFinal(float descuento) throws Exception {//1-Devuelve un float que es el precio final del coche.
        float precioConDescuento = this.precioBase;//INICIALMENTE EL PRECIO ES PRECIO BASE QUE TENGA
        if (descuento < 0 || descuento > 100)//PORCENTAJE QUE SE LE APLICA AL PRECIO FINAL
            throw new RuntimeException("Descuento erróneo");
        if (precioBase >= 5000) {//SI EL PRECIO ES MAYOR O IGUAL DE 5000 SE LE HACE EL DESCUENTO
            precioConDescuento = this.precioBase - (this.precioBase * descuento / 100f);
        }
        return precioConDescuento + precioConDescuento * this.impuesto / 100f;
    }
}
