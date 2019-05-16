package clases.inmuebles;

import clases.Inmueble;

public abstract class Superficie extends Inmueble {

    protected Superficie(String ubicacion, int mtrCuadrados) {
        super(ubicacion, mtrCuadrados);
    }

    
    public int precio() {
        return (1000 * this.mtrCuadrados);
    }
}
