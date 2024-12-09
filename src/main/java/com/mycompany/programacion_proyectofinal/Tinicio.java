
package com.mycompany.programacion_proyectofinal;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Stack;
import javax.swing.ImageIcon;

/**
 *
 * @author hiram
 */
public class Tinicio extends javax.swing.JFrame implements ActionListener {
    Stack<String> historial = new Stack<>();
    List<Producto> productos;
    private final String ARCHIVO_JSON = "productos.json";
    Arbol arbol = new Arbol();
    /**
     * Creates new form Tinicio
     */
    public Tinicio() {
        initComponents();
        this.historial = historial;
        Image foto = new ImageIcon("Logo.png").getImage();
        ImageIcon icono =  new ImageIcon(foto.getScaledInstance(icono_tienda.getWidth(),icono_tienda.getHeight(),Image.SCALE_SMOOTH));
        iconoP.setIcon(icono);
        setIconImage(new ImageIcon("tienda.png").getImage());
        this.setTitle("Guau Miau Store");
        historial("Se ha iniciado sesion!");
        try {
            productos = cargarProductosDesdeArchivo();
            arbol.construirDesdeLista(productos);
        } catch (Exception e) {
            productos = new ArrayList<>();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        historico = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        icono_tienda = new javax.swing.JPanel();
        iconoP = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 764));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 53, 87));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        agregar.setBackground(new java.awt.Color(0, 53, 87));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar Productos");
        agregar.addActionListener(this);

        editar.setBackground(new java.awt.Color(0, 53, 87));
        editar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("Editar Productos");
        editar.setToolTipText("");
        editar.addActionListener(this);

        eliminar.setBackground(new java.awt.Color(0, 53, 87));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar Productos");
        eliminar.setToolTipText("");
        eliminar.addActionListener(this);

        historico.setBackground(new java.awt.Color(0, 53, 87));
        historico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historico.setForeground(new java.awt.Color(255, 255, 255));
        historico.setText("Historial");
        historico.setToolTipText("");
        historico.addActionListener(this);
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(0, 53, 87));
        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar Productos");
        mostrar.addActionListener(this);

        buscar.setBackground(new java.awt.Color(0, 53, 87));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar Productos");
        buscar.setToolTipText("");
        buscar.addActionListener(this);

        icono_tienda.setBackground(new java.awt.Color(0, 53, 87));

        javax.swing.GroupLayout icono_tiendaLayout = new javax.swing.GroupLayout(icono_tienda);
        icono_tienda.setLayout(icono_tiendaLayout);
        icono_tiendaLayout.setHorizontalGroup(
            icono_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        icono_tiendaLayout.setVerticalGroup(
            icono_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Guau Miau Store");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(historico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(icono_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(icono_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addGap(26, 26, 26)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(historico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );

        getContentPane().add(contenido);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tinicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton historico;
    private javax.swing.JLabel iconoP;
    private javax.swing.JPanel icono_tienda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables



    /**metodo para agregar los productos del archivo a la lista
     *Decodifica de base 64 la imagen
     * @return productos que es una lista
     */
    public List<Producto> cargarProductosDesdeArchivo() {
        List<Producto> productos = new ArrayList<>();
        File archivo = new File(ARCHIVO_JSON);

        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                StringBuilder contenido = new StringBuilder();
                String linea;
                while ((linea = reader.readLine()) != null) {
                    contenido.append(linea);
                }
                //
                JSONArray jsonArray = new JSONArray(contenido.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    byte[] imagenProducto = Base64.getDecoder().decode(jsonObject.getString("Imagen"));
                    Producto producto = new Producto(
                            jsonObject.getInt("Clave"),
                            jsonObject.getString("Nombre"),
                            jsonObject.getInt("Cantidad"),
                            jsonObject.getDouble("Precio"),
                            imagenProducto
                    );
                    productos.add(producto);
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo JSON: " + e.getMessage());
            }
        }

        return productos;
    }

    /**
     * Maneja los eventos de los botones
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == agregar){
            Agregar_productos agregar_P = new Agregar_productos(productos, arbol);
            agregar_P.setLocation(0, 0);
            agregar_P.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(agregar_P,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
        if(evt.getSource() == mostrar){
            if(productos.isEmpty()){
                Mostrar_productos mostrar_p = new Mostrar_productos(productos);
                mostrar_p.setLocation(0, 0);
                mostrar_p.setSize(contenido.getWidth(), contenido.getHeight());

                contenido.removeAll();
                contenido.add(mostrar_p,BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
            }
            Mostrar_productos mostrar_p = new Mostrar_productos(productos, arbol);
            mostrar_p.setLocation(0, 0);
            mostrar_p.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(mostrar_p,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
        if(evt.getSource() == editar){
            Editar_productos editar_p = new Editar_productos(productos);
            editar_p.setLocation(0, 0);
            editar_p.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(editar_p,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
        if(evt.getSource() == eliminar){
            if(productos.isEmpty()){
                Eliminar_productos eliminar_p = new Eliminar_productos(productos);
                eliminar_p.setLocation(0, 0);
                eliminar_p.setSize(contenido.getWidth(), contenido.getHeight());

                contenido.removeAll();
                contenido.add(eliminar_p,BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
            }
            Eliminar_productos eliminar_p = new Eliminar_productos(productos, arbol);
            eliminar_p.setLocation(0, 0);
            eliminar_p.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(eliminar_p,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
        if(evt.getSource() == buscar){
            if(productos.isEmpty()){
                Buscar_productos buscar_p = new Buscar_productos();
                buscar_p.setLocation(0, 0);
                buscar_p.setSize(contenido.getWidth(), contenido.getHeight());

                contenido.removeAll();
                contenido.add(buscar_p,BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
            }
            Buscar_productos buscar_p = new Buscar_productos(productos, arbol);
            buscar_p.setLocation(0, 0);
            buscar_p.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(buscar_p,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
        if(evt.getSource() == historico){
            Historial_productos historial_p = new Historial_productos(this.historial);
            historial_p.setLocation(0, 0);
            historial_p.setSize(contenido.getWidth(), contenido.getHeight());

            contenido.removeAll();
            contenido.add(historial_p,BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
    }

    /**
     * Metodo para agregar un mensaje al historial
     * @param mensaje mensaje a agregar
     */
    public void historial(String mensaje){
        this.historial.push(mensaje);
    }

    public void actualizarLista(){
        try {
            productos = cargarProductosDesdeArchivo();
            arbol.construirDesdeLista(productos);
        } catch (Exception e) {
            productos = new ArrayList<>();
        }
    }

    public void añadirAlArbol(ArrayList<Producto> productosNuevos) {
        if (arbol.getRaiz() == null) {
            arbol.construirDesdeLista(productosNuevos);
        } else {
            for (Producto producto : productosNuevos) {
                arbol.agregar(producto);
            }
        }
    }
}
