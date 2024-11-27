package com.mycompany.programacion_proyectofinal;
/**
 * @author miche
 * */
public class Arbol {
    private Nodo raiz;

    public void agregar(Producto producto) {
        raiz = agregarRecursivo(raiz, producto);
    }

    private Nodo agregarRecursivo(Nodo actual, Producto producto) {
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

    private void inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.println(nodo.producto);
            inOrdenRecursivo(nodo.derecho);
        }
    }


}
