/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parrafo1;

/**
 *
 * @author jaren
 */
public class Producto {
    private String nombre;
    private String categoria;
    private String status;
    private String periodoGarantia;

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
        
    
    // Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeriodoGarantia() {
        return periodoGarantia;
    }

    public void setPeriodoGarantia(String periodoGarantia) {
        this.periodoGarantia = periodoGarantia;
    }
    
    
}
