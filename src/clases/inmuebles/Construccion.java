package clases.inmuebles;

import clases.Inmueble;
import clases.TipoConstruccion;

public abstract class Construccion extends Inmueble {

    protected TipoConstruccion tipo;

    protected Construccion(String ubicacion, int mtrCuadrados, TipoConstruccion tipo) {
        super(ubicacion, mtrCuadrados);
        this.tipo = tipo;
    }
    
    //GET Y SET DE TIPO
    public TipoConstruccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoConstruccion tipo) {
        this.tipo= tipo;
    }
}
