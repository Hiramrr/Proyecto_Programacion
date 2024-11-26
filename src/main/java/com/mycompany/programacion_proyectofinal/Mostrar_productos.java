/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.programacion_proyectofinal;

/**
 *
 * @author sasuk
 */
public class Mostrar_productos extends javax.swing.JPanel {

    /**
     * Se inicializan los elementos de la interfaz
     */
    public Mostrar_productos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        guardar = new javax.swing.JButton();
        agregar_seccion = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        orden_default = new javax.swing.JButton();
        orden_nombre = new javax.swing.JButton();
        orden_precio = new javax.swing.JButton();

        principal.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(70);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        guardar.setBackground(new java.awt.Color(35, 135, 55));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar Cambios");

        agregar_seccion.setBackground(new java.awt.Color(237, 240, 242));
        agregar_seccion.setPreferredSize(new java.awt.Dimension(256, 101));

        titulo.setBackground(new java.awt.Color(1, 52, 87));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 52, 87));
        titulo.setText("Mostrar Productos");

        orden_default.setBackground(new java.awt.Color(237, 240, 242));
        orden_default.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orden_default.setForeground(new java.awt.Color(1, 52, 87));
        orden_default.setText("Ordenar por Default");

        orden_nombre.setBackground(new java.awt.Color(237, 240, 242));
        orden_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orden_nombre.setForeground(new java.awt.Color(1, 52, 87));
        orden_nombre.setText("Ordenar por nombre ");

        orden_precio.setBackground(new java.awt.Color(237, 240, 242));
        orden_precio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orden_precio.setForeground(new java.awt.Color(1, 52, 87));
        orden_precio.setText("Ordenar por precio");

        javax.swing.GroupLayout agregar_seccionLayout = new javax.swing.GroupLayout(agregar_seccion);
        agregar_seccion.setLayout(agregar_seccionLayout);
        agregar_seccionLayout.setHorizontalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_seccionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(orden_default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(orden_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(orden_precio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregar_seccionLayout.setVerticalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_seccionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo)
                .addGap(113, 113, 113)
                .addComponent(orden_default)
                .addGap(75, 75, 75)
                .addComponent(orden_nombre)
                .addGap(75, 75, 75)
                .addComponent(orden_precio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(agregar_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addContainerGap())
            .addComponent(agregar_seccion, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar_seccion;
    private javax.swing.JButton guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orden_default;
    private javax.swing.JButton orden_nombre;
    private javax.swing.JButton orden_precio;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
