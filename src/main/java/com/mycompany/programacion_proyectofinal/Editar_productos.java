package com.mycompany.programacion_proyectofinal;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hiram
 */
public class Editar_productos extends javax.swing.JPanel implements ActionListener {
    String ruta;

    /**
     * Creates new form Editar_productos
     */
    public Editar_productos(List<Producto> productos) {
        initComponents();
        tabla.setDefaultRenderer(Object.class, new RenderImagen());
        agregarTabla(productos);
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
        agregar_seccion = new javax.swing.JPanel();
        editar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        clave_label = new javax.swing.JLabel();
        clave_t = new javax.swing.JTextField();
        porque = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        nombre_t = new javax.swing.JTextField();
        cantidad_label = new javax.swing.JLabel();
        cantidad_t = new javax.swing.JTextField();
        precio_t = new javax.swing.JTextField();
        precio_label = new javax.swing.JLabel();
        imagen_label = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();
        lugar = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        guardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        principal.setBackground(new java.awt.Color(255, 255, 255));

        agregar_seccion.setBackground(new java.awt.Color(237, 240, 242));

        editar.setBackground(new java.awt.Color(35, 135, 55));
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("Editar");

        titulo.setBackground(new java.awt.Color(1, 52, 87));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 52, 87));
        titulo.setText("Editar Producto");

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
        porque.setToolTipText("Ingresa la clave del producto que quieres editar");

        nombre_label.setBackground(new java.awt.Color(1, 52, 87));
        nombre_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(1, 52, 87));
        nombre_label.setText("Nombre del Producto:");

        nombre_t.setBackground(new java.awt.Color(255, 255, 255));
        nombre_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre_t.setForeground(new java.awt.Color(0, 0, 0));
        nombre_t.setToolTipText("");

        cantidad_label.setBackground(new java.awt.Color(1, 52, 87));
        cantidad_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cantidad_label.setForeground(new java.awt.Color(1, 52, 87));
        cantidad_label.setText("Cantidad:");

        cantidad_t.setBackground(new java.awt.Color(255, 255, 255));
        cantidad_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidad_t.setForeground(new java.awt.Color(0, 0, 0));
        cantidad_t.setToolTipText("");

        precio_t.setBackground(new java.awt.Color(255, 255, 255));
        precio_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precio_t.setForeground(new java.awt.Color(0, 0, 0));
        precio_t.setToolTipText("");

        precio_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        precio_label.setForeground(new java.awt.Color(1, 52, 87));
        precio_label.setText("Precio:");

        imagen_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imagen_label.setForeground(new java.awt.Color(1, 52, 87));
        imagen_label.setText("Imagen:");

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen");
        cargar.addActionListener(this);

        lugar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lugarLayout = new javax.swing.GroupLayout(lugar);
        lugar.setLayout(lugarLayout);
        lugarLayout.setHorizontalGroup(
            lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
            .addGroup(lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lugarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lugarLayout.setVerticalGroup(
            lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
            .addGroup(lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lugarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout agregar_seccionLayout = new javax.swing.GroupLayout(agregar_seccion);
        agregar_seccion.setLayout(agregar_seccionLayout);
        agregar_seccionLayout.setHorizontalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_seccionLayout.createSequentialGroup()
                .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_label)
                            .addComponent(cantidad_label)
                            .addComponent(cantidad_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagen_label)
                            .addComponent(precio_label)
                            .addComponent(precio_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(editar))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titulo)
                            .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(clave_label, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clave_t, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(porque))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cargar))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addComponent(nombre_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cantidad_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidad_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagen_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(editar)
                .addContainerGap())
        );

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
        guardar.addActionListener(this);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(agregar_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar)))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(guardar)
                .addContainerGap())
            .addComponent(agregar_seccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar_seccion;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JTextField cantidad_t;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel clave_label;
    private javax.swing.JTextField clave_t;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imagen_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lugar;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JTextField nombre_t;
    private javax.swing.JLabel porque;
    private javax.swing.JLabel precio_label;
    private javax.swing.JTextField precio_t;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    /**
     * Carga una imagen en el JLabel
     */
    public void cargarImagen(){
        JFileChooser archivos = new JFileChooser();
        FileNameExtensionFilter imagenes = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        archivos.setFileFilter(imagenes);

        int respuesta = archivos.showOpenDialog(this);
        if(respuesta == archivos.APPROVE_OPTION){
            ruta = archivos.getSelectedFile().getPath();

            Image foto = new ImageIcon(ruta).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH));
            imagen.setIcon(icono);
        }
    }

    /**
     * Agrega una fila a la tabla de productos del archivo JSON
     * @param productos
     */
    public void agregarTabla(List<Producto> productos) {
        for(Producto producto: productos) {
            Object[] fila = new Object[5];
            fila[0] = String.valueOf(producto.getClave());
            fila[1] = producto.getNombre();
            fila[2] = String.valueOf(producto.getCantidad());
            fila[3] = String.valueOf(producto.getPrecio());

            try {
                byte[] imagenProducto = producto.getImagen();
                BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imagenProducto));

                if (bufferedImage != null) {
                    ImageIcon mFoto = new ImageIcon(bufferedImage.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
                    fila[4] = new JLabel(mFoto);
                } else {
                    fila[4] = "Espero que nunca pase esto";
                }
            } catch (Exception e) {
                System.out.println("Error al procesar la imagen: " + e);
                fila[4] = "Error";
            }

            ((javax.swing.table.DefaultTableModel) tabla.getModel()).addRow(fila);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cargar){
            cargarImagen();
        }
    }
}
