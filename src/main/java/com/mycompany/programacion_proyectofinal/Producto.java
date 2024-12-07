package com.mycompany.programacion_proyectofinal;

import java.util.Arrays;

public class Producto {

    private int clave;
    private String nombre;
    private int cantidad;
    private double precio;
    public byte[]imagen;

    public Producto(int id, String nombre,double cantidad, double precio) {
    }

    public Producto(int clave, String nombre, int cantidad, double precio, byte[] imagen) {
        this.clave = clave;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "clave=" + clave +
                ", nombre='" + nombre +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", imagen=" + Arrays.toString(imagen) +
                '}';
    }
}

