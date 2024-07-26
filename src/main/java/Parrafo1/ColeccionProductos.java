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

    public ColeccionProductos() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto p) {
        this.productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public Iterator createProductosDisponibles() {
        return new ProductoIterator(new ArrayList<>());
    }

    @Override
    public Iterator createProductosVendedor(String tienda) {
        return new ProductoIterator(new ArrayList<>());
    }

    @Override
    public Iterator createProductosFalla() {
        return new ProductoIterator(new ArrayList<>());
    }

    @Override
    public Iterator createProductosReparacion() {
       return new ProductoIterator(new ArrayList<>());
    }   
    
}
