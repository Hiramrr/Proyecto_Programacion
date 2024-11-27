package com.mycompany.programacion_proyectofinal;
/**
 * @author miche
 * @
 * */
public class Nodo {
    Producto producto;
    Nodo izquierdo, derecho;
    /**
     * Metodo constructor de la clase nodo
     * Recibe un objeto de tipo producto
     * */
    public Nodo(Producto producto) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
}
