package main;

import clases.AgenciaInmobiliaria;
import clases.Inmueble;
import clases.TipoConstruccion;
import clases.TipoGaraje;
import clases.ZonaSolar;
import clases.inmuebles.construcciones.LocalComercial;
import clases.inmuebles.construcciones.Vivienda;
import clases.inmuebles.superficies.PlazaGaraje;
import clases.inmuebles.superficies.Solar;
import java.util.LinkedList;

public class App {

    public static void main(String... args){
        AgenciaInmobiliaria agencia = new AgenciaInmobiliaria("Agencia Pizarro");
        
        Vivienda v1, v2, v3;
        v1 = new Vivienda("Villa Alexandra", 500, TipoConstruccion.NUEVA, 50000, 2, 4);
        v2 = new Vivienda("Rodadero", 900, TipoConstruccion.NUEVA, 100000, 3, 1);
        v3 = new Vivienda("Centro", 760, TipoConstruccion.SEGUNDAMANO, 560000, 2, 1);
        
        LocalComercial l1, l2, l3;
        l1 = new LocalComercial("Ocean Mall Local 34", 600, TipoConstruccion.SEGUNDAMANO);
        l2 = new LocalComercial("Buena Vista Local 104", 800, TipoConstruccion.SEGUNDAMANO);
        l3 = new LocalComercial("Buena Vista local 5", 500, TipoConstruccion.NUEVA);
        
        Solar s1, s2, s3;
        s1 = new Solar("Bonda", 400, ZonaSolar.RUSTICO);
        s2 = new Solar("Los Olivos", 810, ZonaSolar.URBANO);
        s3 = new Solar("Tigrera", 650, ZonaSolar.RUSTICO);
        
        PlazaGaraje pz1, pz2, pz3;
        pz1 = new PlazaGaraje("The Picni", 800, TipoGaraje.PUBLICO);
        pz2 = new PlazaGaraje("El Patio", 400, TipoGaraje.PRIVADO);
        pz3 = new PlazaGaraje("Mexicano", 500, TipoGaraje.PUBLICO);
        
     

        //VENTA DE SOLARES Y VIVIENDAS
        agencia.añadeVentaInmueble(v1);
        agencia.añadeVentaInmueble(v2);
        agencia.añadeVentaInmueble(v3);
        agencia.añadeVentaInmueble(s1);
        agencia.añadeVentaInmueble(s2);
        agencia.añadeVentaInmueble(s3);
      

        //ALQUILER DE LOCALES Y PLAZAS GARAJES
        agencia.añadeAlquilerInmueble(l1);
        agencia.añadeAlquilerInmueble(l2);
        agencia.añadeAlquilerInmueble(l3);
        agencia.añadeAlquilerInmueble(pz1);
        agencia.añadeAlquilerInmueble(pz2);
        agencia.añadeAlquilerInmueble(pz3);

        
        LinkedList<Inmueble> inmuebles = (LinkedList<Inmueble>) agencia.inmueblesVenta(800000);
        System.out.println(" Inmuebles en venta que cuestan menos de  800.000 ");
        for (Inmueble inmueble : inmuebles) {
            inmueble.muestra();
            System.out.println("\n************************\n");
        }

       
        LinkedList<LocalComercial> locales = (LinkedList<LocalComercial>) agencia.localesSegundaMano(600);
        System.out.println(" Locales comerciales con un area MAYOR a 600 METROS CUADRADOS ");
        for (LocalComercial local : locales) {
            local.muestra();
            System.out.println("\n***************************\n");
        }

        
        int numSolares = agencia.solaresRusticos();
        System.out.println("Numero de solares rusticos en VENTA: " + numSolares);
    }
}
