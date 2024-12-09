package com.mycompany.programacion_proyectofinal;
/**
 * @author miche
 * @
 * */

/**
 * Clase Nodo
 */
public class Nodo {
    Producto producto;
    Nodo izquierdo, derecho;
    /**
     * Metodo constructor de la clase nodo
     * @param producto
     * */
    public Nodo(Producto producto) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
}
