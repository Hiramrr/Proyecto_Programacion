package com.mycompany.programacion_proyectofinal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author miche
 * */
/**
 * Clase Arbol
 */
public class Arbol {
    private static Nodo raiz;

    /**
     * Constructor de la clase Arbol
     */
    public  Nodo getRaiz() {
        return raiz;
    }

    /**
     * Metodo para obtener la raiz del arbol
     * @return
     */
    public static void setRaiz(Nodo raiz) {
        Arbol.raiz = raiz;
    }

    /**
     * Metodo para agregar un producto en el arbol
     * @param producto
     */
    public static void agregar(Producto producto) {
        raiz = agregarRecursivo(raiz, producto);
    }

    /**
     * Metodo para agregar un producto en el arbol
     * de manera recursiva
     * @param actual
     * @param producto
     * @return
     */
    private static Nodo agregarRecursivo(Nodo actual, Producto producto) {
        if (actual == null) {
            return new Nodo(producto);
        }

        if (producto.getClave() < actual.producto.getClave()) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, producto);
        } else if (producto.getClave() > actual.producto.getClave()) {
            actual.derecho = agregarRecursivo(actual.derecho, producto);
        } else {
            return actual;
        }
        return actual;
    }

    /**
     * Metodo para buscar un producto en el arbol
     */
    public void inOrden() {
        inOrdenRecursivo(raiz);
    }
    /**
     * metodo para recorrer el arbol en inOrden
     * @param nodo
     * @return resultado
     * */
    public List<Producto> inOrdenRecursivo(Nodo nodo) {
        List<Producto> resultado = new ArrayList<>();
        if (nodo != null) {
            resultado.addAll(inOrdenRecursivo(nodo.izquierdo));
            resultado.add(nodo.producto);
            resultado.addAll(inOrdenRecursivo(nodo.derecho));
        }
        return resultado;
    }


    /**
     * Metodo para construir el arbol apartir de la lista de productos
     * @param productos
     */
    public void construirDesdeLista(List<Producto> productos) {
        raiz = null;
        for (Producto producto : productos) {
            agregar(producto);
        }
    }

    /*
    * Metodo para eliminar un producto en el arbol
    * @param clave
     */
    public void eliminar(int clave) {
        raiz = eliminarRecursivo(raiz, clave);
    }

    /**
     * Metodo para eliminar un producto en el arbol
     * de manera recursiva
     * @param actual
     * @param clave
     * @return
     */
    private Nodo eliminarRecursivo(Nodo actual, int clave) {
        if (actual == null) {
            return null;
        }

        if (clave == actual.producto.getClave()) {
            // Nodo sin hijos
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }
            // Nodo con un solo hijo
            if (actual.izquierdo == null) {
                return actual.derecho;
            }
            if (actual.derecho == null) {
                return actual.izquierdo;
            }
            // Nodo con dos hijos
            Producto menorValor = encontrarMenorValor(actual.derecho);
            actual.producto = menorValor;
            actual.derecho = eliminarRecursivo(actual.derecho, menorValor.getClave());
            return actual;
        }
        if (clave < actual.producto.getClave()) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, clave);
            return actual;
        }
        actual.derecho = eliminarRecursivo(actual.derecho, clave);
        return actual;
    }

    /**
     * Metodo para encontrar el menor valor en el arbol
     * @param nodo
     * @return
     */
    private Producto encontrarMenorValor(Nodo nodo) {
        return nodo.izquierdo == null ? nodo.producto : encontrarMenorValor(nodo.izquierdo);
    }

}
