package descansoApp.interfaz;

import javax.swing.JFrame;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

public class pnlInformacionEvento extends javax.swing.JPanel {

    private Evento evento;
    private JFrame miVentana;
    private Viaje viaje;
    private Sistema modelo;
    
    public pnlInformacionEvento(Sistema unModelo, Viaje unViaje, Evento unEvento, JFrame unContenedor) {
      
        initComponents();
        modelo = unModelo;
        evento = unEvento;
        viaje = unViaje;
        miVentana = unContenedor;
        
        txtNombre.setOpaque(false);
        scroll1.setOpaque(false);
        scroll1.getViewport().setOpaque(false);
        scroll1.setBorder(null);
        txtInicio.setOpaque(false);
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);
        txtFin.setOpaque(false);
        scroll3.setOpaque(false);
        scroll3.getViewport().setOpaque(false);
        scroll3.setBorder(null);
        txtUbicacion.setOpaque(false);
        scroll4.setOpaque(false);
        scroll4.getViewport().setOpaque(false);
        scroll4.setBorder(null);
        txtDescripcion.setOpaque(false);
        scroll5.setOpaque(false);
        scroll5.getViewport().setOpaque(false);
        scroll5.setBorder(null);
        
        cargar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll4 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        scroll3 = new javax.swing.JScrollPane();
        txtUbicacion = new javax.swing.JTextArea();
        scroll2 = new javax.swing.JScrollPane();
        txtFin = new javax.swing.JTextArea();
        scroll1 = new javax.swing.JScrollPane();
        txtInicio = new javax.swing.JTextArea();
        scroll5 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextArea();
        txtHoraFin = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        lblVolver = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(490, 285));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll4.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll4.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll4.setPreferredSize(new java.awt.Dimension(162, 80));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setToolTipText("");
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.setBorder(null);
        txtDescripcion.setHighlighter(null);
        scroll4.setViewportView(txtDescripcion);

        add(scroll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 95, 200, 150));

        scroll3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll3.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll3.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll3.setPreferredSize(new java.awt.Dimension(162, 80));

        txtUbicacion.setEditable(false);
        txtUbicacion.setColumns(20);
        txtUbicacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUbicacion.setLineWrap(true);
        txtUbicacion.setRows(5);
        txtUbicacion.setToolTipText("");
        txtUbicacion.setWrapStyleWord(true);
        txtUbicacion.setAutoscrolls(false);
        txtUbicacion.setBorder(null);
        txtUbicacion.setHighlighter(null);
        scroll3.setViewportView(txtUbicacion);

        add(scroll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 225, 130, 20));

        scroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll2.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll2.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll2.setPreferredSize(new java.awt.Dimension(162, 80));

        txtFin.setEditable(false);
        txtFin.setColumns(20);
        txtFin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFin.setLineWrap(true);
        txtFin.setRows(5);
        txtFin.setToolTipText("");
        txtFin.setWrapStyleWord(true);
        txtFin.setAutoscrolls(false);
        txtFin.setBorder(null);
        txtFin.setHighlighter(null);
        scroll2.setViewportView(txtFin);

        add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 165, 130, 20));

        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll1.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll1.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll1.setPreferredSize(new java.awt.Dimension(162, 80));

        txtInicio.setEditable(false);
        txtInicio.setColumns(20);
        txtInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInicio.setLineWrap(true);
        txtInicio.setRows(5);
        txtInicio.setToolTipText("");
        txtInicio.setWrapStyleWord(true);
        txtInicio.setAutoscrolls(false);
        txtInicio.setBorder(null);
        txtInicio.setHighlighter(null);
        scroll1.setViewportView(txtInicio);

        add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 105, 130, 20));

        scroll5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtNombre.setEditable(false);
        txtNombre.setColumns(20);
        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setLineWrap(true);
        txtNombre.setRows(5);
        txtNombre.setWrapStyleWord(true);
        txtNombre.setAutoscrolls(false);
        scroll5.setViewportView(txtNombre);

        add(scroll5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, 130, 20));

        txtHoraFin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHoraFin.setBorder(null);
        txtHoraFin.setOpaque(false);
        add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 195, 130, 20));

        txtHoraInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHoraInicio.setBorder(null);
        txtHoraInicio.setOpaque(false);
        add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 135, 130, 20));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/InformacionEvento.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JScrollPane scroll5;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtFin;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextArea txtInicio;
    private javax.swing.JTextArea txtNombre;
    private javax.swing.JTextArea txtUbicacion;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        txtNombre.setText(evento.getNombre());
        txtInicio.setText(evento.fechaInicioToString());
        txtHoraInicio.setText(evento.horaInicioToString());
        txtFin.setText(evento.fechaFinToString());
        txtHoraFin.setText(evento.horaFinToString());
        txtUbicacion.setText(evento.getUbicacion());
        txtDescripcion.setText(evento.getDescripcion());
    }
}
