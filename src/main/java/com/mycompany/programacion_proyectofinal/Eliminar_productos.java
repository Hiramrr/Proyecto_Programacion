package com.mycompany.programacion_proyectofinal;

/**
 *
 * @author hiram
 */
public class Eliminar_productos extends javax.swing.JPanel {

    /**
     * Creates new form Eliminar_Productos
     */
    public Eliminar_productos() {
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
        eliminar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        clave_label = new javax.swing.JLabel();
        clave_t = new javax.swing.JTextField();
        porque = new javax.swing.JLabel();
        clave_t1 = new javax.swing.JTextField();
        clave_label1 = new javax.swing.JLabel();
        clave_label2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        principal.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        eliminar.setBackground(new java.awt.Color(184, 44, 0));
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");

        titulo.setBackground(new java.awt.Color(1, 52, 87));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 52, 87));
        titulo.setText("Eliminar Producto");

        clave_label.setBackground(new java.awt.Color(1, 52, 87));
        clave_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clave_label.setForeground(new java.awt.Color(1, 52, 87));
        clave_label.setText("Clave del producto:");

        clave_t.setBackground(new java.awt.Color(255, 255, 255));
        clave_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clave_t.setForeground(new java.awt.Color(0, 0, 0));

        porque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        porque.setForeground(new java.awt.Color(1, 52, 87));
        porque.setText("?");
        porque.setToolTipText("La clave del producto que sera eliminado");

        clave_t1.setEditable(false);
        clave_t1.setBackground(new java.awt.Color(210, 210, 210));
        clave_t1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clave_t1.setForeground(new java.awt.Color(30, 30, 30));

        clave_label1.setBackground(new java.awt.Color(1, 52, 87));
        clave_label1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clave_label1.setForeground(new java.awt.Color(1, 52, 87));
        clave_label1.setText("Fecha de eliminación:");

        clave_label2.setBackground(new java.awt.Color(1, 52, 87));
        clave_label2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clave_label2.setForeground(new java.awt.Color(1, 52, 87));
        clave_label2.setText("Razón:");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout agregar_seccionLayout = new javax.swing.GroupLayout(agregar_seccion);
        agregar_seccion.setLayout(agregar_seccionLayout);
        agregar_seccionLayout.setHorizontalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_seccionLayout.createSequentialGroup()
                .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(titulo))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(eliminar))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clave_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clave_t, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(porque))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clave_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clave_label1))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clave_label2))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        agregar_seccionLayout.setVerticalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_seccionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(clave_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porque))
                .addGap(45, 45, 45)
                .addComponent(clave_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clave_t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(clave_label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addContainerGap())
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
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addContainerGap())
            .addComponent(agregar_seccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar_seccion;
    private javax.swing.JLabel clave_label;
    private javax.swing.JLabel clave_label1;
    private javax.swing.JLabel clave_label2;
    private javax.swing.JTextField clave_t;
    private javax.swing.JTextField clave_t1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel porque;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
