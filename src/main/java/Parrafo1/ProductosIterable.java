/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Parrafo1;

import java.util.ArrayList;

/**
 *
 * @author jaren
 */
public interface ProductosIterable {
    public Iterator createProductosDisponibles();
    public Iterator createProductosVendedor(String tienda);
    public Iterator createProductosFalla();
    public Iterator createProductosReparacion();
}
