package clases.inmuebles.superficies;

import clases.TipoGaraje;
import clases.inmuebles.Superficie;

public class PlazaGaraje extends Superficie {

    private TipoGaraje tipo;

    public PlazaGaraje(String ubicacion, int metrosCuadrados, TipoGaraje tipo) {
        super(ubicacion, metrosCuadrados);
        this.tipo = tipo;
    }

    //GET Y SET TIPO
    public TipoGaraje getTipo() {
        return tipo;
    }

    public void setTipo(TipoGaraje tipo) {
        this.tipo = tipo;
    }
    
    //METODO MUESTRA
    @Override
    public void muestra() {
        System.out.println(" Plaza Garaje ");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (mtsCuadrados): " + mtrCuadrados);
        System.out.println("Tipo de Garaje: " + tipo.name());
        System.out.println("Precio: $" + super.precio());
        
    }
}
