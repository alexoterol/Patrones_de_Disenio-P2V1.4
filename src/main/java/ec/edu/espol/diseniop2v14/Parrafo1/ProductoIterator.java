/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.diseniop2v14.Parrafo1;

import java.util.ArrayList;

/**
 *
 * @author jaren
 */
public class ProductoIterator implements Iterator {
    
    private ArrayList<Producto> productos;
    private int currentPosition;

    public ProductoIterator(ArrayList<Producto> productos) {
        this.productos = productos;
        this.currentPosition = 0;
    }    

    @Override
    public Producto getNext() {
        if(hasMoore()) {
            Producto p = productos.get(currentPosition);
            currentPosition++;
            return p;
        }
        return null;
    }

    @Override
    public boolean hasMoore() {
        return currentPosition < productos.size();
    }
    
}
