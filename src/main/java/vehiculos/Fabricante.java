package vehiculos;

import java.util.HashMap;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static HashMap<String, Integer> fabricantes_ventas = new HashMap<>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public static void agregarFabricante(String nombreFabricante){
        if (fabricantes_ventas.containsKey(nombreFabricante)) {
            fabricantes_ventas.put(nombreFabricante, fabricantes_ventas.get(nombreFabricante) + 1);
        } else {
            fabricantes_ventas.put(nombreFabricante, 1);
        }
    }

    public static Fabricante fabricaMayorVentas(){
        String maxKey = null;
        int maxValue = 0;
        for(String i : fabricantes_ventas.keySet()) {
            if(fabricantes_ventas.get(i) > maxValue) {
                maxKey = i;
                maxValue = fabricantes_ventas.get(i);
            }
        }
        return new Fabricante(maxKey, new Pais("DEFAULT"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
