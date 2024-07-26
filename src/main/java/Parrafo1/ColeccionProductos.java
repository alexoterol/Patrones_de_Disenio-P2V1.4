/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parrafo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaren
 */
public class ColeccionProductos implements ProductosIterable{
    private List<Producto> productos;

    public ColeccionProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    // Metodos
    
    public void addProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public Iterator createProductosDisponibles(ArrayList<Producto> p) {
        return new ProductoIterator(p);
    }

    @Override
    public Iterator createProductosVendedor(ArrayList<Producto> p) {
        return new ProductoIterator(p);
    }

    @Override
    public Iterator createProductosFalla(ArrayList<Producto> p) {
        return new ProductoIterator(p);
    }

    @Override
    public Iterator createProductosReparacion(ArrayList<Producto> p) {
        return new ProductoIterator(p);
    }    
    
}
