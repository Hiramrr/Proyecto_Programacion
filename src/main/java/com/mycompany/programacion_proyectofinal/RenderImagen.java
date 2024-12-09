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
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
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
