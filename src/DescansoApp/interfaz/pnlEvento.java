package descansoApp.interfaz;

import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import descansoApp.herramientas.EsNumero;

public class pnlEvento extends javax.swing.JPanel {

    private Viaje viaje;
    private Evento modEvento;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame miVentana;
    private Sistema modelo;

    public pnlEvento(Sistema unModelo, Viaje unViaje, descansoApp.dominio.Ciudad unaCiudad, Evento unEvento, JFrame unContenedor) {
        initComponents();
        modelo = unModelo;
        viaje = unViaje;
        modEvento = unEvento;
        ciudad = unaCiudad;
        miVentana = unContenedor;

        if (modEvento == null) {
            lblEliminar1.setVisible(false);
            lblVolver.setVisible(false);
        } else {
            lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/ModificarEvento.png")));
            txtNombre.setText(modEvento.getNombre());
            txtDescripcion.setText(modEvento.getDescripcion());
            txtHoraIHoras.setText("" + modEvento.getFechaHoraI().get(Calendar.HOUR));
            txtHoraIMinutos.setText("" + modEvento.getFechaHoraI().get(Calendar.MINUTE));
            txtHoraFHoras.setText("" + modEvento.getFechaHoraF().get(Calendar.HOUR));
            txtHoraFMinutos.setText("" + modEvento.getFechaHoraF().get(Calendar.MINUTE));
            txtUbicacion.setText(modEvento.getUbicacion());
            dChosserFechaI.setCalendar(modEvento.getFechaHoraI());
            dChosserFechaF.setCalendar(modEvento.getFechaHoraF());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        dChosserFechaI = new com.toedter.calendar.JDateChooser();
        dChosserFechaF = new com.toedter.calendar.JDateChooser();
        txtHoraIMinutos = new javax.swing.JFormattedTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFHoras = new javax.swing.JFormattedTextField();
        txtHoraIHoras = new javax.swing.JFormattedTextField();
        txtHoraFMinutos = new javax.swing.JFormattedTextField();
        lblGuardar = new javax.swing.JLabel();
        lblEliminar1 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(490, 285));
        setMinimumSize(new java.awt.Dimension(490, 285));
        setPreferredSize(new java.awt.Dimension(490, 285));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 200, 150));

        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 18));
        add(dChosserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));
        add(dChosserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        txtHoraIMinutos.setBorder(null);
        txtHoraIMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraIMinutosActionPerformed(evt);
            }
        });
        add(txtHoraIMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 19, 18));

        txtUbicacion.setBorder(null);
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, 18));

        jLabel1.setText(" :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 10, 20));

        jLabel5.setText(" :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 10, 20));

        txtHoraFHoras.setBorder(null);
        txtHoraFHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFHorasActionPerformed(evt);
            }
        });
        add(txtHoraFHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 19, 18));

        txtHoraIHoras.setBorder(null);
        txtHoraIHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraIHorasActionPerformed(evt);
            }
        });
        add(txtHoraIHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 19, 18));

        txtHoraFMinutos.setBorder(null);
        txtHoraFMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFMinutosActionPerformed(evt);
            }
        });
        add(txtHoraFMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 19, 18));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });
        add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 250, -1, 30));

        lblEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        lblEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseExited(evt);
            }
        });
        add(lblEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/AgregarEvento.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtHoraIMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraIMinutosActionPerformed

    }//GEN-LAST:event_txtHoraIMinutosActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed

    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtHoraFHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFHorasActionPerformed

    }//GEN-LAST:event_txtHoraFHorasActionPerformed

    private void txtHoraIHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraIHorasActionPerformed

    }//GEN-LAST:event_txtHoraIHorasActionPerformed

    private void txtHoraFMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFMinutosActionPerformed

    }//GEN-LAST:event_txtHoraFMinutosActionPerformed

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if (txtNombre.getText().length() > 0 && txtUbicacion.getText().length() > 0 && txtDescripcion.getText().length() > 0
                && txtHoraIHoras.getText().length() > 0 && txtHoraIMinutos.getText().length() > 0 && txtHoraFHoras.getText().length() > 0
                && txtHoraFMinutos.getText().length() > 0 && dChosserFechaI != null && dChosserFechaF != null) {

            Evento evento;
            if (modEvento == null) {
                evento = new Evento();
            } else {
                evento = modEvento;
            }

            evento.setNombre(txtNombre.getText());
            evento.setUbicacion(txtUbicacion.getText());
            evento.setDescripcion(txtDescripcion.getText());
            evento.setCiudad(ciudad);

            if (!esNumero(txtHoraIHoras.getText()) || !esNumero(txtHoraIMinutos.getText())
                    || !esNumero(txtHoraFHoras.getText()) || !esNumero(txtHoraFMinutos.getText())) {
                JOptionPane.showMessageDialog(this, "Formato incorrecto de la hora ingresada.", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int hIHoras = Integer.parseInt(txtHoraIHoras.getText());
                int hIMinutos = Integer.parseInt(txtHoraIMinutos.getText());
                int hFHoras = Integer.parseInt(txtHoraFHoras.getText());
                int hFMinutos = Integer.parseInt(txtHoraFMinutos.getText());

                if ((hIHoras >= 0 && hIHoras <= 23) && (hIMinutos >= 0 && hIMinutos <= 59) && (hFHoras >= 0 && hFHoras <= 23) && (hFMinutos >= 0 && hFMinutos <= 59)) {

                    Calendar cFechaI = dChosserFechaI.getCalendar();
                    Calendar cFechaF = dChosserFechaF.getCalendar();

                    cFechaI.set(Calendar.HOUR_OF_DAY, hIHoras);
                    cFechaI.set(Calendar.MINUTE, hIMinutos);
                    cFechaF.set(Calendar.HOUR_OF_DAY, hFHoras);
                    cFechaF.set(Calendar.MINUTE, hFMinutos);

                    try {
                        evento.setFechaHoraI(cFechaI);
                        evento.setFechaHoraF(cFechaI, cFechaF);

                        if (modEvento == null) {
                            viaje.agregarEvento(evento);
                            miVentana.dispose();
                        } else {
                            miVentana.remove(this);
                            miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
                            miVentana.pack();
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Formato incorrecto de la hora ingresada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(miVentana, viaje, TOOL_TIP_TEXT_KEY, WIDTH);
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    public boolean esNumero(String texto) {
        boolean correcto;
        int num;

        try {
            num = Integer.parseInt(texto);
            correcto = true;
        } catch (NumberFormatException e) {
            correcto = false;
        }

        return correcto;
    }
    
    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el evento?", "Eliminar Evento", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            viaje.eliminarEvento(modEvento);
            
            miVentana.remove(this);
            miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
            miVentana.pack();
        }
    }//GEN-LAST:event_lblEliminar1MouseClicked

    private void lblEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseEntered
        
    }//GEN-LAST:event_lblEliminar1MouseEntered

    private void lblEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseExited

    }//GEN-LAST:event_lblEliminar1MouseExited

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dChosserFechaF;
    private com.toedter.calendar.JDateChooser dChosserFechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JFormattedTextField txtHoraFHoras;
    private javax.swing.JFormattedTextField txtHoraFMinutos;
    private javax.swing.JFormattedTextField txtHoraIHoras;
    private javax.swing.JFormattedTextField txtHoraIMinutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
