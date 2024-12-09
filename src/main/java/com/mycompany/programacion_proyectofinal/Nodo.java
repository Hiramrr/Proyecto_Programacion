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
     * @param producto objeto de tipo producto que se envia como valor del nodo
     * */
    public Nodo(Producto producto) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
}
