package clases.inmuebles.construcciones;

import clases.TipoConstruccion;
import clases.inmuebles.Construccion;

public class Vivienda extends Construccion {

    private int precio;
    private int numHabitaciones;
    private int piso;

    public Vivienda(String ubicacion, int metrosCuadrados, TipoConstruccion tipo, int precio, int numHabitaciones, int piso) {
        super(ubicacion, metrosCuadrados, tipo);
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
    }

    //GET Y SET PRECIO 
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //GET Y SET NUMHABITACIONES
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    // GET Y SET PISO
    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    //METODO MUESTRA
    @Override
    public void muestra() {
        System.out.println(" Vivienda ");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (metros Cuadrados): " + mtrCuadrados);
        System.out.println("Tipo de construccion: " + tipo.name());
        System.out.println("Numero de habitaciones: " + numHabitaciones);
        System.out.println("Piso: " + piso);
        System.out.println("Precio: $" + precio);

    }
}
