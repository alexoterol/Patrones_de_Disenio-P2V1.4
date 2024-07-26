/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.diseniop2v14;

import ec.edu.espol.diseniop2v14.Parrafo2.ContextoTransporte;
import ec.edu.espol.diseniop2v14.Parrafo2.Strategy;
import ec.edu.espol.diseniop2v14.Parrafo2.TransporteAereo;
import ec.edu.espol.diseniop2v14.Parrafo2.TransporteBici;
import ec.edu.espol.diseniop2v14.Parrafo2.TransporteCarro;
import Parrafo1.ColeccionProductos;
import Parrafo1.Producto;
import ec.edu.espol.diseniop2v14.Parrafo2.TransporteFluvial;
import ec.edu.espol.diseniop2v14.Parrafo3.AprobacionGerente;
import ec.edu.espol.diseniop2v14.Parrafo3.CertificarExistencia;
import ec.edu.espol.diseniop2v14.Parrafo3.FalloCubierto;
import ec.edu.espol.diseniop2v14.Parrafo3.Handler;
import ec.edu.espol.diseniop2v14.Parrafo3.SolicitarCambio;
import ec.edu.espol.diseniop2v14.Parrafo3.VerificarGarantia;
import java.util.ArrayList;

/**
 *
 * @author alexo
 */
public class DisenioP2V14 {

    public static void main(String[] args) {
        User user = new User();
        //Primer Párrafo
        
        Producto p1 = new Producto("Lapiz", "Papeleria", 5.7);
        Producto p2 = new Producto("Monitor", "Tecnologia",4.5);
        
        ColeccionProductos col1 = new ColeccionProductos();
        ColeccionProductos col2 = new ColeccionProductos();
        
        col1.addProducto(p1);
        col2.addProducto(p2);
        
        col1.createProductosDisponibles();
        col2.createProductosFalla();
        
        System.out.println("Productos Disponibles: "+col1.getProductos());
        System.out.println("Productos con falla: "+col2.getProductos());
        
        //Segundo Párrafo
        System.out.println("-------------------------------------------------------");
        ContextoTransporte context = new ContextoTransporte();
        Strategy str = new TransporteCarro();
        context.setStrategy(str);
        context.doSomething();
        
        Strategy other = new TransporteBici();
        context.setStrategy(other);
        context.doSomething();
        
        Strategy other2 = new TransporteAereo();
        context.setStrategy(other2);
        context.doSomething();
        
        Strategy other3 = new TransporteFluvial();
        context.setStrategy(other3);
        context.doSomething();
        
        //Tercer párrafo
        System.out.println("-------------------------------------------------------");
        Handler gerente = new AprobacionGerente();
        Handler exist = new CertificarExistencia();
        Handler fallo = new FalloCubierto();
        Handler verif = new VerificarGarantia();
        Handler solici = new SolicitarCambio();
        solici.setNext(verif);
        verif.setNext(fallo);
        fallo.setNext(exist);
        exist.setNext(gerente);
        solici.handle();
    }
}
