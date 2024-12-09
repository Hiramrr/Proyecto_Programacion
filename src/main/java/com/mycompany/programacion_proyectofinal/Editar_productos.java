package com.mycompany.programacion_proyectofinal;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hiram
 */
public class Editar_productos extends javax.swing.JPanel implements ActionListener {
    String ruta;
    List<Producto> productos = new ArrayList<Producto>();
    Arbol arbol = new Arbol();
    boolean esNumero = true;
    byte[] imagenProducto;
    List<Producto> productosEditados = new ArrayList<Producto>();
    boolean seCambiaronImagenes = false;
    private final String ARCHIVO_JSON = "productos.json";

    /**
     * Creates new form Editar_productos
     */
    public Editar_productos(List<Producto> productos) {
        initComponents();
        tabla.setDefaultRenderer(Object.class, new RenderImagen());
        this.productos = productos;
        agregarTabla(productos);
        agregarListenerNumeros();
        agregarListenerSeleccionTabla();
        this.imagenProducto = imagenProducto;
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
        editar.addActionListener(this);

        titulo.setBackground(new java.awt.Color(1, 52, 87));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 52, 87));
        titulo.setText("Editar Producto");

        clave_label.setBackground(new java.awt.Color(1, 52, 87));
        clave_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clave_label.setForeground(new java.awt.Color(1, 52, 87));
        clave_label.setText("Clave del producto:");

        clave_t.setEditable(false);
        clave_t.setBackground(new java.awt.Color(210, 210, 210));
        clave_t.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clave_t.setForeground(new java.awt.Color(30, 30, 30));

        porque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        porque.setForeground(new java.awt.Color(1, 52, 87));
        porque.setText("?");
        porque.setToolTipText("La clave del producto que quieres editar");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            seCambiaronImagenes = true;

            try {
                imagenProducto = Files.readAllBytes(archivos.getSelectedFile().toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    /**
     * Maneja los eventos de los botones
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cargar){
            cargarImagen();
        }
        if(evt.getSource() == editar){
            if(esNumero){
                int clave = Integer.parseInt(clave_t.getText());
                editarProducto(clave);
            }
            seCambiaronImagenes = false;
        }
        if(evt.getSource() == guardar){
            guardarCambios();
        }
    }

    public void guardarCambios() {
        for (Producto productoEditado : productosEditados) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getClave() == productoEditado.getClave()) {
                    productos.set(i, productoEditado);
                    break;
                }
            }
        }
        JSONArray jsonArray = new JSONArray();

        for (Producto producto : productos) {
            JSONObject json = new JSONObject();
            json.put("Clave", producto.getClave());
            json.put("Nombre", producto.getNombre());
            json.put("Precio", producto.getPrecio());
            json.put("Cantidad", producto.getCantidad());
            json.put("Imagen", Base64.getEncoder().encodeToString(producto.getImagen()));
            jsonArray.put(json);
            System.out.println("Producto guardado: " + producto.getNombre());
        }

        try (FileWriter file = new FileWriter(ARCHIVO_JSON, false)) {
            file.write(jsonArray.toString(4));
            JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
        } catch (IOException e) {
            System.err.println("Error al guardar en el archivo JSON: " + e.getMessage());
        }
        arbol.construirDesdeLista(productos);
    }

    /**
     * Metodo para editar productos
     * ojala funcione bien jajaja
     * @param clave
     * */
    public void editarProducto(int clave) {
        if(!validar()){
            return;
        }
        Producto productoAEditar = null;
        for (Producto producto : productos) {
            if (producto.getClave() == clave) {
                productoAEditar = producto;
                break;
            }
        }

        String nuevoNombre = nombre_t.getText();
        int nuevaCantidad = Integer.parseInt(cantidad_t.getText());
        double nuevoPrecio = Double.parseDouble(precio_t.getText());
        if (seCambiaronImagenes) {
            productoAEditar.setImagen(imagenProducto);
        }

        productoAEditar.setNombre(nuevoNombre);
        productoAEditar.setPrecio(nuevoPrecio);
        productoAEditar.setCantidad(nuevaCantidad);

        tabla.setValueAt(nuevoNombre, tabla.getSelectedRow(), 1);
        tabla.setValueAt(nuevaCantidad, tabla.getSelectedRow(), 2);
        tabla.setValueAt(nuevoPrecio, tabla.getSelectedRow(), 3);

        if (seCambiaronImagenes) {
            ImageIcon icono = (ImageIcon) imagen.getIcon();
            Image foto = icono.getImage();
            tabla.setValueAt(new JLabel(new ImageIcon(foto.getScaledInstance(70, 70, Image.SCALE_SMOOTH))), tabla.getSelectedRow(), 4);
            tabla.repaint();
        }

        Producto productoTemporal = new Producto(productoAEditar.getClave(), nuevoNombre, nuevaCantidad, nuevoPrecio, productoAEditar.getImagen());
        productosEditados.add(productoTemporal);
    }

    /**
     * Agrega un listener a los campos de texto para verificar que solo se ingresen numeros
     */
    private void agregarListenerNumeros() {
        cantidad_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                esNumeroCantidad();
            }

            public void removeUpdate(DocumentEvent e) {
                esNumeroCantidad();
            }

            public void insertUpdate(DocumentEvent e) {
                esNumeroCantidad();
            }
        });
        precio_t.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                esNumeroPrecio();
            }

            public void removeUpdate(DocumentEvent e) {
                esNumeroPrecio();
            }

            public void insertUpdate(DocumentEvent e) {
                esNumeroPrecio();
            }
        });
    }

    /**
     * Valida que los campos de texto no esten vacios y sean validos
     * @return
     */
    public boolean validar(){
        if(nombre_t.getText().isEmpty() && cantidad_t.getText().isEmpty() && precio_t.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
            return false;
        }
        if(nombre_t.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre al producto");
            return false;
        }
        if(!esNumero){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en los campos de cantidad y precio");
            return false;
        }
        return true;
    }

    /**
     * Verifica si el texto ingresado en la cantidad es un numero
     */
    public void esNumeroCantidad() {
        try {
            if (!cantidad_t.getText().isEmpty()) {
                int cantidad = Integer.parseInt(cantidad_t.getText());
                esNumero = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en los campos de cantidad");
            esNumero = false;
        }
    }

    /**
     * Verifica si el texto ingresado en la precio es un numero
     */
    public void esNumeroPrecio() {
        try {
            if (!precio_t.getText().isEmpty()) {
                double precio = Double.parseDouble(precio_t.getText());
                esNumero = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en los campos de precio");
            esNumero = false;
        }
    }

    /**
     * Agrega un listener a la tabla para seleccionar un producto
     * y mostrar su informacion en los campos de texto
     */
    private void agregarListenerSeleccionTabla() {
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {

                int filaSeleccionada = tabla.getSelectedRow();

                if (filaSeleccionada != -1) {
                    clave_t.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
                    nombre_t.setText(tabla.getValueAt(filaSeleccionada, 1).toString());
                    cantidad_t.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
                    precio_t.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
                    esNumero = true;
                    int clave = Integer.parseInt(clave_t.getText());
                    Producto productoSeleccionado = productos.stream()
                            .filter(producto -> producto.getClave() == clave)
                            .findFirst()
                            .orElse(null);

                    if (productoSeleccionado != null) {
                        imagenProducto = productoSeleccionado.getImagen();
                        BufferedImage bufferedImage = null;
                        try {
                            bufferedImage = ImageIO.read(new ByteArrayInputStream(imagenProducto));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        ImageIcon icono = new ImageIcon(bufferedImage.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));
                        imagen.setIcon(icono);
                    }
                }
            }
        });
    }
}
