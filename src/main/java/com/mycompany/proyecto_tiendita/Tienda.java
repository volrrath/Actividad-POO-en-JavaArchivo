
package com.mycompany.proyecto_tiendita;

public class Tienda
{
    private String nombre_producto;
    private double precio;
    private int stock;

    public Tienda() {
    }

    public Tienda(String nombre_producto, double precio, int stock) {
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Tienda{" + "Nombre producto=" + nombre_producto + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
