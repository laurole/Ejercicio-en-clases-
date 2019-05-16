package clases.inmuebles.superficies;

import clases.ZonaSolar;
import clases.inmuebles.Superficie;

public class Solar extends Superficie {

    private ZonaSolar zona;

    public Solar(String ubicacion, int metrosCuadrados, ZonaSolar zona) {
        super(ubicacion, metrosCuadrados);
        this.zona = zona;
    }

    // GET Y SET ZONA
    public ZonaSolar getZona() {
        return zona;
    }

    public void setZona(ZonaSolar zona) {
        this.zona = zona;
    }
    
    //METODO MUESTRA
    @Override
    public void muestra() {
        System.out.println(" Solar ");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (mtsCuadrados): " + mtrCuadrados);
        System.out.println("Zona: " + zona.name());
        System.out.println("Precio: $" + super.precio());
    }
}
