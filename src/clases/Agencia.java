package clases;

import clases.inmuebles.construcciones.LocalComercial;
import java.util.List;

public interface Agencia {
    boolean añadeVentaInmueble(Inmueble inmueble);
    boolean añadeAlquilerInmueble(Inmueble inmueble);
    int solaresRusticos();
    List<Inmueble> inmueblesVenta(int precio);
    List<LocalComercial> localesSegundaMano(int area);
}
