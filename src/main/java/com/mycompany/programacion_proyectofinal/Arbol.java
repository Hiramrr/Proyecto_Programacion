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
     * Metodo para obtener la raiz del arbol
     * @return raiz la raiz de tip nodo del Arbol
      */
    public  Nodo getRaiz() {
        return raiz;
    }

    /**
     * Metodo para enviar la raiz del arbol
     * @param raiz de tipo nodo para que se cree el arbol
     */
    public static void setRaiz(Nodo raiz) {
        Arbol.raiz = raiz;
    }

    /**
     * Metodo para agregar un producto en el arbol
     * @param producto objeto de tipo producto que se agrega al arbol
     */
    public static void agregar(Producto producto) {
        raiz = agregarRecursivo(raiz, producto);
    }

    /**
     * Metodo para agregar un producto en el arbol
     * de manera recursiva
     * @param actual nodo en el que se encuentra o que es la raiz
     * @param producto objeto de tipo producto
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
     * @param nodo objeto de tipo Nodo para ordenar
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
     * @param productos Lista de tipo Producto desde la cual se va a construir el arbol
     */
    public void construirDesdeLista(List<Producto> productos) {
        raiz = null;
        for (Producto producto : productos) {
            agregar(producto);
        }
    }

    /**
    * Metodo para eliminar un producto en el arbol
    * @param clave entero que se va a buscar para eliminar el producto
     */
    public void eliminar(int clave) {
        raiz = eliminarRecursivo(raiz, clave);
    }

    /**
     * Metodo para eliminar un producto en el arbol
     * de manera recursiva
     * @param actual objeto de tipo nodo y es en el que se encuentra
     * @param clave entero que se va a buscar para eliminar el producto
     * @return actual que es el nodo que se va a eliminar
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
     * @param nodo objeto de tipo nodo
     * @return nodo que es el nodo con el valor mas paqueño
     */
    private Producto encontrarMenorValor(Nodo nodo) {
        return nodo.izquierdo == null ? nodo.producto : encontrarMenorValor(nodo.izquierdo);
    }

}
