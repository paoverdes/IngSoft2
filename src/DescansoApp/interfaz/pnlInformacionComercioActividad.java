package descansoApp.interfaz;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

public class pnlInformacionComercioActividad extends javax.swing.JPanel {

    private Sistema modelo;
    private ComercioActividad cA;
    private JFrame padre;
    private ArrayList<ImageIcon> listaImagenes;
    private int contador = 0;
    private descansoApp.dominio.Ciudad ciudad;

    public pnlInformacionComercioActividad(Sistema unModelo, ComercioActividad unCA, JFrame unPadre, descansoApp.dominio.Ciudad unaCiudad) {
        initComponents();
        modelo = unModelo;
        cA = unCA;
        padre = unPadre;
        ciudad = unaCiudad;

        listaImagenes = cA.getImagenes();
        lblGaleria.setIcon(listaImagenes.get(0));

        if (!modelo.getListaViajes().isEmpty()) {
            Iterator<Viaje> itViaje = modelo.getListaViajes().iterator();
            while (itViaje.hasNext()) {
                Viaje viaje = itViaje.next();
                comboViajes.addItem(viaje);
            }
        } else {
            comboViajes.setVisible(false);
            lblBoton.setVisible(false);
        }
        
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRepercusiones = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        txtIntroduccion = new javax.swing.JTextArea();
        lblNombreEst = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        comboViajes = new javax.swing.JComboBox();
        lblVolver = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        txtHorarios = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblGaleria = new javax.swing.JLabel();
        lblHorarios = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblWeb = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        txtTelefono = new javax.swing.JTextArea();
        lblPrecio1 = new javax.swing.JLabel();
        scroll5 = new javax.swing.JScrollPane();
        txtPrecio = new javax.swing.JTextArea();
        lblUbicacion = new javax.swing.JLabel();
        scroll4 = new javax.swing.JScrollPane();
        txtUbicacion = new javax.swing.JTextArea();
        lblBoton = new javax.swing.JLabel();
        lblpagina = new javax.swing.JLabel();
        lblVolver1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(840, 500));
        setMinimumSize(new java.awt.Dimension(840, 500));
        setPreferredSize(new java.awt.Dimension(840, 500));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(840, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(840, 688));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 688));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("875");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 202, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1985");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 202, -1, -1));

        lblRepercusiones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRepercusiones.setForeground(new java.awt.Color(255, 255, 255));
        lblRepercusiones.setText("Repercusiones");
        jPanel1.add(lblRepercusiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        scroll1.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll1.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll1.setPreferredSize(new java.awt.Dimension(162, 80));

        txtIntroduccion.setEditable(false);
        txtIntroduccion.setColumns(20);
        txtIntroduccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtIntroduccion.setForeground(new java.awt.Color(255, 255, 255));
        txtIntroduccion.setLineWrap(true);
        txtIntroduccion.setRows(5);
        txtIntroduccion.setWrapStyleWord(true);
        txtIntroduccion.setBorder(null);
        txtIntroduccion.setHighlighter(null);
        scroll1.setViewportView(txtIntroduccion);

        jPanel1.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 770, 90));

        lblNombreEst.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblNombreEst.setText("Nombre Establecimiento");
        jPanel1.add(lblNombreEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 400, 30));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriader.png"))); // NOI18N
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        jPanel1.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, 20));

        jPanel1.add(comboViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 260, 22));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriaIzq.png"))); // NOI18N
        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseClicked(evt);
            }
        });
        jPanel1.add(lblAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtHorarios.setEditable(false);
        txtHorarios.setColumns(20);
        txtHorarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHorarios.setForeground(new java.awt.Color(255, 255, 255));
        txtHorarios.setLineWrap(true);
        txtHorarios.setRows(5);
        txtHorarios.setWrapStyleWord(true);
        txtHorarios.setHighlighter(null);
        scroll.setViewportView(txtHorarios);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 202, 340, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Repercusiones.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 182, 310, 470));

        lblGaleria.setText(" ");
        lblGaleria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblGaleria.setMinimumSize(new java.awt.Dimension(450, 280));
        lblGaleria.setPreferredSize(new java.awt.Dimension(450, 280));
        jPanel1.add(lblGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblHorarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHorarios.setForeground(new java.awt.Color(255, 255, 255));
        lblHorarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHorarios.setText("Horarios: ");
        jPanel1.add(lblHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 20));

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Teléfono: ");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));

        lblWeb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblWeb.setForeground(new java.awt.Color(255, 255, 255));
        lblWeb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeb.setText("Página Web: ");
        jPanel1.add(lblWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, -1));

        scroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtTelefono.setEditable(false);
        txtTelefono.setColumns(20);
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setLineWrap(true);
        txtTelefono.setRows(5);
        txtTelefono.setWrapStyleWord(true);
        txtTelefono.setHighlighter(null);
        scroll2.setViewportView(txtTelefono);

        jPanel1.add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 232, 340, 20));

        lblPrecio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio1.setText("Precio: ");
        jPanel1.add(lblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 20));

        scroll5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtPrecio.setEditable(false);
        txtPrecio.setColumns(20);
        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setLineWrap(true);
        txtPrecio.setRows(5);
        txtPrecio.setWrapStyleWord(true);
        txtPrecio.setHighlighter(null);
        scroll5.setViewportView(txtPrecio);

        jPanel1.add(scroll5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 262, 340, 20));

        lblUbicacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUbicacion.setText("Ubicación: ");
        jPanel1.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, 20));

        scroll4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtUbicacion.setEditable(false);
        txtUbicacion.setColumns(20);
        txtUbicacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        txtUbicacion.setLineWrap(true);
        txtUbicacion.setRows(5);
        txtUbicacion.setWrapStyleWord(true);
        txtUbicacion.setHighlighter(null);
        scroll4.setViewportView(txtUbicacion);

        jPanel1.add(scroll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 292, 340, 20));

        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnPlus.png"))); // NOI18N
        lblBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBotonMouseExited(evt);
            }
        });
        jPanel1.add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 37, -1, 30));

        lblpagina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblpagina.setForeground(new java.awt.Color(0, 51, 204));
        lblpagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblpagina.setMaximumSize(new java.awt.Dimension(999, 999));
        lblpagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpaginaMouseClicked(evt);
            }
        });
        jPanel1.add(lblpagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 318, 340, 20));

        lblVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolver1MouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 38, 30, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/InformacionComercioActividad.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo,ciudad , padre, cA.getTipo()));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseClicked
        if (contador == 0) {
            contador = listaImagenes.size() - 1;
        } else {
            contador--;
        }
        lblGaleria.setIcon(listaImagenes.get(contador));
    }//GEN-LAST:event_lblAnteriorMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (contador == listaImagenes.size() - 1) {
            contador = 0;
        } else {
            contador++;
        }

        lblGaleria.setIcon(listaImagenes.get(contador));
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseClicked
        PopUp p = new PopUp();
        p.add(new pnlEvento(modelo, (Viaje) comboViajes.getSelectedItem(), ciudad, null, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_lblBotonMouseClicked

    private void lblBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseEntered
        
    }//GEN-LAST:event_lblBotonMouseEntered

    private void lblBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseExited
       
    }//GEN-LAST:event_lblBotonMouseExited

    private void lblpaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpaginaMouseClicked
        try {
            URI ruta= new URI(cA.getWeb());
            if(java.awt.Desktop.isDesktopSupported()){
                try{
                    Desktop dk = Desktop.getDesktop();

                    dk.browse(ruta);
                }catch(Exception e){
                    System.out.println("Error al abrir URL: "+e.getMessage());
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(pnlInformacionComercioActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblpaginaMouseClicked

    private void lblVolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolver1MouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolver1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboViajes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGaleria;
    private javax.swing.JLabel lblHorarios;
    private javax.swing.JLabel lblNombreEst;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblRepercusiones;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel lblVolver1;
    private javax.swing.JLabel lblWeb;
    private javax.swing.JLabel lblpagina;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JScrollPane scroll5;
    private javax.swing.JTextArea txtHorarios;
    private javax.swing.JTextArea txtIntroduccion;
    private javax.swing.JTextArea txtPrecio;
    private javax.swing.JTextArea txtTelefono;
    private javax.swing.JTextArea txtUbicacion;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        lblNombreEst.setText(cA.getNombre());
        txtIntroduccion.setText(cA.getDetalles());
        txtHorarios.setText(cA.getHorario());
        txtTelefono.setText(cA.getTelefono());
        txtPrecio.setText(cA.getPrecio());
        txtUbicacion.setText(cA.getUbicacion());
        lblpagina.setText(cA.getWeb());
        
        
        
        
        txtIntroduccion.setOpaque(false);
        txtHorarios.setOpaque(false);
        txtTelefono.setOpaque(false);
        txtPrecio.setOpaque(false);
        txtUbicacion.setOpaque(false);
        
        
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        scroll1.setOpaque(false);
        scroll1.getViewport().setOpaque(false);
        scroll1.setBorder(null);
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);
        
        scroll4.setOpaque(false);
        scroll4.getViewport().setOpaque(false);
        scroll4.setBorder(null);
        scroll5.setOpaque(false);
        scroll5.getViewport().setOpaque(false);
        scroll5.setBorder(null);
        
        
        
        
        
    }
    

}
