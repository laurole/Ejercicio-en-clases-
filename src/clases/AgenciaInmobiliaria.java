package clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import clases.inmuebles.construcciones.LocalComercial;
import clases.inmuebles.construcciones.Vivienda;
import clases.inmuebles.superficies.PlazaGaraje;
import clases.inmuebles.superficies.Solar;


public class AgenciaInmobiliaria implements Agencia {

    private final ArrayList<Inmueble> ventas;
    private final ArrayList<Inmueble> alquileres;
    private final String nombre;

    public AgenciaInmobiliaria(String nombre) {
        this.nombre = nombre;
        this.ventas = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }


    @Override
    public boolean añadeAlquilerInmueble(Inmueble inmueble){
        if (!alquileres.contains(inmueble)) {
            if ((inmueble instanceof PlazaGaraje) || (inmueble instanceof LocalComercial)) {
                alquileres.add(inmueble);
                return true;
            } else {
                System.out.println("El Inmueble NO se puede alquilar ");
            }
        }

        return false;
    }

      @Override
    public boolean añadeVentaInmueble(Inmueble inmueble) {
        if (!ventas.contains(inmueble)) {
            if ((inmueble instanceof Solar) || (inmueble instanceof Vivienda)) {
                ventas.add(inmueble);
                return true;
            } else {
                System.out.println("El Inmueble NO se puede Vender ");
            }
        }

        return false;
    }
    
    @Override
    public List<Inmueble> inmueblesVenta(int precio) {
        LinkedList<Inmueble> ListaInmuebles = new LinkedList<>();
        for (int i = 0; i < ventas.size(); i++) {
            Inmueble inmueble = ventas.get(i);
            if (inmueble instanceof Solar) {
                if (((Solar) inmueble).precio() < precio) {
                    ListaInmuebles.add(inmueble);
                }
            } else if (inmueble instanceof Vivienda) {
                if (((Vivienda) inmueble).getPrecio() < precio) {
                    ListaInmuebles.add(inmueble);
                }
            }
        }

        return ListaInmuebles;
    }

    @Override
    public int solaresRusticos() {
        int contador = 0;
        for (int i = 0; i < ventas.size(); i++) {
            Inmueble inmueble = ventas.get(i);
            if (inmueble instanceof Solar) {
                ZonaSolar var = ((Solar) inmueble).getZona();
                if (var.equals(ZonaSolar.RUSTICO)) {
                    contador = contador + 1;
                }
            }
        }

        return contador;
    }
    
    @Override
    public List<LocalComercial> localesSegundaMano(int area) {
        LinkedList<LocalComercial> listaLocales = new LinkedList<>();
        for (int i = 0; i < alquileres.size(); i++) {
            Inmueble inmueble = alquileres.get(i);
            if (inmueble instanceof LocalComercial) {
                LocalComercial local = (LocalComercial) inmueble;
                int areaLocal = local.mtrCuadrados;
                if (areaLocal > area) {
                    listaLocales.add(local);
                }
            }
        }

        return listaLocales;
    }
}
