package com.mycompany.programacion_proyectofinal;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hiram
 */

/**
 * Clase que se encarga de agregar productos a la tabla de productos
 */
public class Agregar_productos extends javax.swing.JPanel implements ActionListener {
    String ruta;
    List<Producto> productos;
    private final String ARCHIVO_JSON = "productos.json";
    ArrayList<Producto> productosNuevos = new ArrayList<>();
    boolean esNumero = false;
    Arbol arbol;

    /**
     * Se inicializan los elementos de la interfaz
     * @param productos
     */
    public Agregar_productos(List<Producto> productos,Arbol arbol) {
        initComponents();
        tabla.setDefaultRenderer(Object.class, new RenderImagen());
        agregarTabla(productos);
        clave_t.setText(generarClave());
        this.productos = productos;
        agregarListenerNumeros();
        this.arbol = arbol;
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
        agregar = new javax.swing.JButton();
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
        lugar = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();

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
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        guardar.setBackground(new java.awt.Color(35, 135, 55));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar Cambios");
        guardar.addActionListener(this);

        agregar_seccion.setBackground(new java.awt.Color(237, 240, 242));

        agregar.setBackground(new java.awt.Color(35, 135, 55));
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(this);

        titulo.setBackground(new java.awt.Color(1, 52, 87));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 52, 87));
        titulo.setText("Agregar Producto");

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
        porque.setToolTipText("La clave del producto es generada automaticamente");

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

        lugar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lugarLayout = new javax.swing.GroupLayout(lugar);
        lugar.setLayout(lugarLayout);
        lugarLayout.setHorizontalGroup(
            lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        lugarLayout.setVerticalGroup(
            lugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        cargar.setBackground(new java.awt.Color(30, 112, 235));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar imagen");
        cargar.addActionListener(this);

        javax.swing.GroupLayout agregar_seccionLayout = new javax.swing.GroupLayout(agregar_seccion);
        agregar_seccion.setLayout(agregar_seccionLayout);
        agregar_seccionLayout.setHorizontalGroup(
            agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_seccionLayout.createSequentialGroup()
                .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clave_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clave_t, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(porque))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(titulo)
                                .addGroup(agregar_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_label)
                                    .addComponent(nombre_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cantidad_label)
                            .addComponent(cantidad_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_label)
                            .addComponent(precio_t, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagen_label)))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(agregar))
                    .addGroup(agregar_seccionLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cargar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_seccionLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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
                .addGap(18, 18, 18)
                .addComponent(precio_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precio_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagen_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(agregar)
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
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JPanel agregar_seccion;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JTextField cantidad_t;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel clave_label;
    private javax.swing.JTextField clave_t;
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
     * Genera una clave random para el producto que puede ir desde 10000 hasta 65535
     * @return numero Aleatorio
     */
    public String generarClave(){
        int clave = tabla.getRowCount() + 1;
        return String.valueOf(clave);
    }
    
    /**
     * Carga una imagen del sistema haciendo uso de JFileChooser 
     * La imagen obtenida la coloca en el label imagen
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

    /**
     * Agrega un producto a la tabla de productos
     */
    public void agregarProducto(){
        int clave = Integer.parseInt(clave_t.getText());
        String nombre = nombre_t.getText();
        int cantidad = Integer.parseInt(cantidad_t.getText());
        double precio = Double.parseDouble(precio_t.getText());
        try {
            byte[] imagen = getImagen(ruta);
            Image imagenBuena = new ImageIcon(imagen).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
            Object[] fila = {clave, nombre, cantidad, precio, new JLabel(new ImageIcon(imagenBuena))};
            ((javax.swing.table.DefaultTableModel) tabla.getModel()).addRow(fila);
            Producto p = new Producto(clave, nombre, cantidad, precio, imagen);
            productosNuevos.add(p);
        } catch (NullPointerException e){
            byte[] imagen = getImagen("src/main/java/Resources/Images/default.png");
            Image imagenBuena = new ImageIcon(imagen).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
            Object[] fila = {clave, nombre, cantidad, precio, new JLabel(new ImageIcon(imagenBuena))};
            ((javax.swing.table.DefaultTableModel) tabla.getModel()).addRow(fila);
            Producto p = new Producto(clave, nombre, cantidad, precio, imagen);
            productosNuevos.add(p);
        }
        vaciarCampos();
    }

    /**
     * Vacia los campos de texto y la imagen
     */
    public void vaciarCampos(){
        clave_t.setText(generarClave());
        nombre_t.setText("");
        cantidad_t.setText("");
        precio_t.setText("");
        imagen.setIcon(null);
    }

    /**
     * Valida que los campos no esten vacios y que los campos de cantidad y precio sean numeros
     * Si todo esta correcto, agrega el producto
     */
    public void validar(){
        if(nombre_t.getText().isEmpty() && cantidad_t.getText().isEmpty() && precio_t.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
            return;
        }
        if(nombre_t.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre al producto");
            return;
        }
        if(!esNumero){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en los campos de cantidad y precio");
            return;
        }
        ((Tinicio) SwingUtilities.getWindowAncestor(this)).historial("Se ha agreado un producto! " + nombre_t.getText());
        agregarProducto();
    }


    /**
    * Maneja las acciones de los botones
     * @param evt
    */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == cargar){
            cargarImagen();
        }
        if(evt.getSource() == agregar) {
            validar();
        }
        if(evt.getSource() == guardar){
            guardarCambios();
        }
    }

    /**
     * Guarda los productos nuevos en el archivo JSON
     */
    public void guardarCambios(){

        for(Producto producto: productosNuevos){
            agregarProductoAlArchivo(producto);
        }
        productosNuevos.clear();
        ((Tinicio) SwingUtilities.getWindowAncestor(this)).historial("Se han guardado los cambios en los productos");
        ((Tinicio) SwingUtilities.getWindowAncestor(this)).añadirAlArbol(productosNuevos);
        JOptionPane.showMessageDialog(null, "Se han guardado los cambios");
    }


    /**
     * Obtiene el arreglo de bytes de la imagen por medio de su ruta en el sistema
     * @param ruta
     * @return arreglo de bytes de la imagen
     */
    private byte[] getImagen(String ruta){
        File imagen = new File(ruta);
        try{
            byte[] icono = new byte[(int)imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
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


    // creacion del archivo json
    /** Metodo para agregar un producto al archivo JSON
     *  Codifica la imagen a base 64 con la clase base 64
     * @param producto
     */
    public void agregarProductoAlArchivo(Producto producto) {
        this.productos.add(producto);

        // Convertir lista a JSON y guardar en el archivo
        JSONArray jsonArray = new JSONArray();
        for (Producto prod : productos) {
            JSONObject json = new JSONObject();
            json.put("Clave", prod.getClave());
            json.put("Nombre", prod.getNombre());
            json.put("Precio", prod.getPrecio());
            json.put("Cantidad", prod.getCantidad());
            json.put("Imagen", Base64.getEncoder().encodeToString(prod.getImagen()));
            jsonArray.put(json);
        }

        try (FileWriter file = new FileWriter(ARCHIVO_JSON)) {
            file.write(jsonArray.toString(4));
        } catch (IOException e) {
            System.err.println("Error al guardar en el archivo JSON: " + e.getMessage());
        }
    }

}

