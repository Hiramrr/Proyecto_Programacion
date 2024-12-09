package com.mycompany.programacion_proyectofinal;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 * @autor Hiram
 */

/**
 * Clase RenderImagen
 */
public class RenderImagen extends DefaultTableCellRenderer {
    /**
     * Metodo para renderizar la imagen en la tabla
     * @param table objeto Jtable
     * @param value envia el valor para crear la imagen
     * @param isSelected boleano si esta seleccionado un elemento de la tabla
     * @param hasFocus boleano verifica que esta seleccionado una fila de la tbla
     * @param row entero con el numero de filas de la tabla
     * @param column entero con el numero de columnas de la tabla
     * @return JLabel
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof JLabel) {
            return (JLabel) value;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
