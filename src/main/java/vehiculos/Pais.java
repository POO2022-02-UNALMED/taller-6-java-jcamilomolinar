package vehiculos;

import java.util.HashMap;

public class Pais {
    private String nombre;
    private static HashMap<String, Integer> paises_ventas = new HashMap<>();

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public static void agregarVenta(String nombrePais){
        if (paises_ventas.containsKey(nombrePais)) {
            paises_ventas.put(nombrePais, paises_ventas.get(nombrePais) + 1);
        } else {
            paises_ventas.put(nombrePais, 1);
        }
    }

    public static Pais paisMasVendedor(){
        String maxKey = null;
        int maxValue = 0;
        for(String i : paises_ventas.keySet()) {
            if(paises_ventas.get(i) > maxValue) {
                maxKey = i;
                maxValue = paises_ventas.get(i);
            }
        }
        return new Pais(maxKey);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
