/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.diseniop2v14;

import Parrafo1.ColeccionProductos;
import Parrafo1.Producto;
import ec.edu.espol.diseniop2v14.Parrafo3.AprobacionGerente;
import ec.edu.espol.diseniop2v14.Parrafo3.CertificarExistencia;
import ec.edu.espol.diseniop2v14.Parrafo3.FalloCubierto;
import ec.edu.espol.diseniop2v14.Parrafo3.Handler;
import ec.edu.espol.diseniop2v14.Parrafo3.HandlerBase;
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
        
        Producto p1 = new Producto("Lapiz", "Papeleria");
        Producto p2 = new Producto("Monitor", "Tecnologia");
        
        ColeccionProductos col1 = new ColeccionProductos(new ArrayList<Producto>());
        ColeccionProductos col2 = new ColeccionProductos(new ArrayList<Producto>());
        
        col1.addProducto(p1);
        col2.addProducto(p2);
        
        //col1.createProductosDisponibles();
        
        //Segundo Párrafo
        
        
        //Tercer párrafo
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
