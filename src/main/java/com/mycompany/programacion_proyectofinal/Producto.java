package com.mycompany.programacion_proyectofinal;

import java.util.Arrays;

/**
 * @autor michel
 */

/**
 * Clase Producto
 */
public class Producto {
    private int clave;
    private String nombre;
    private int cantidad;
    private double precio;
    public byte[]imagen;
    private boolean eliminado;


    /**
     * Constructor de la clase Producto
     * @param clave entero que indica la clave del producto
     * @param nombre String con el nombre del producto
     * @param cantidad entero con la cantidad disponible del producto
     * @param precio numero con decimal que es el precio del producto
     * @param imagen arreglo de bytes con los ´pixeles de la imagen
     */
    public Producto(int clave, String nombre, int cantidad, double precio, byte[] imagen) {
        this.clave = clave;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }

    /**
     * getter y setters de la clase Producto
     * @return
     */
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

    /**
     * para saber si un producto fue eliminado
     * @return eliminado boleano de si fue eliminado true o no false
     */
    public boolean isEliminado() {
        return eliminado;
    }

    /**
     * para marcar un producto como eliminado
     * @param eliminado boleano de si se elimino o no el producto
     */
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    /**
     * Metodo toString de la clase Producto
     * @return String con todos los datos del producto
     */
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

