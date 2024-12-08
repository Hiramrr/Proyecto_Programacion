package com.mycompany.programacion_proyectofinal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author miche
 * */
public class Arbol {
    List<Producto> productos = new ArrayList<>();
    private static Nodo raiz;

    public static Nodo getRaiz() {
        return raiz;
    }

    public static void setRaiz(Nodo raiz) {
        Arbol.raiz = raiz;
    }

    public static void agregar(Producto producto) {
        raiz = agregarRecursivo(raiz, producto);
    }

    private static Nodo agregarRecursivo(Nodo actual, Producto producto) {
        if (actual == null) {
            return new Nodo(producto);
        }

        if (producto.getClave() < actual.producto.getClave()) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, producto);
        } else if (producto.getClave() > actual.producto.getClave()) {
            actual.derecho = agregarRecursivo(actual.derecho, producto);
        }

        return actual;
    }

    public void inOrden() {
        inOrdenRecursivo(raiz);
    }
    /**
     * metodo para imprimir el arbol inOrden
     *
     * @param nodo
     * */
    List<Producto> inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            productos.add(nodo.producto);
            inOrdenRecursivo(nodo.derecho);
        }
        return productos;
    }
    /**
     * Metodo para construir el arbol apartir de la lista
     *
     * @param productos
     */
    public static void construirDesdeLista(List<Producto> productos) {
        raiz = null; // Limpiar el árbol
        for (Producto producto : productos) {
            agregar(producto);
        }
    }


}
