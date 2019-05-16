package clases;

public abstract class Inmueble {
    
    protected int mtrCuadrados; 
    protected String ubicacion;
   

    protected Inmueble(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.mtrCuadrados = metrosCuadrados;
    }

    // GET Y SET METRO CUADRADO
    public int getMetrosCuadrados() {
        return mtrCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.mtrCuadrados = metrosCuadrados;
    }
    
    // GET Y SET UBICACION
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
   
    public abstract void muestra(); 
}
