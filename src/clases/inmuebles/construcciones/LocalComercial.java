package clases.inmuebles.construcciones;

import clases.TipoConstruccion;
import clases.inmuebles.Construccion;

public class LocalComercial extends Construccion {

    public LocalComercial(String ubicacion, int mtrCuadrados, TipoConstruccion tipo) {
        super(ubicacion, mtrCuadrados, tipo);
    }

    //Propiedad calculada
    public int precio() {
        return (1000 * this.mtrCuadrados);
    }
    
    //METODO MUESTRA UMPLEMENTADO 
    @Override
    public void muestra() {
        System.out.println(" Local Comercial ");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (metros cuadradoa): " + mtrCuadrados);
        System.out.println("Tipo de construccion: " + tipo.name());
        System.out.println("Precio del local: " + precio());
    }
}
