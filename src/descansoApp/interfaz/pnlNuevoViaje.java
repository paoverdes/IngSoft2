package descansoApp.interfaz;

import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

public class pnlNuevoViaje extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame miVentana;
    private Viaje modViaje;

    public pnlNuevoViaje(Sistema unModelo, JFrame unContenedor, Viaje modificarViaje) {
        initComponents();
        modelo = unModelo;
        miVentana = unContenedor;
        modViaje = modificarViaje;
        lblBoton.setVisible(true);

        if (modViaje == null) {      
            lblVolver.setVisible(false);
        } else {
            lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/ModificarViaje.png")));
            txtNombre.setText(modViaje.getNombre());
            dChooserFechaI.setCalendar(modViaje.getFechaI());
            dChooserFechaF.setCalendar(modViaje.getFechaF());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        dChooserFechaI = new com.toedter.calendar.JDateChooser();
        dChooserFechaF = new com.toedter.calendar.JDateChooser();
        lblBoton = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 20));

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });
        add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 30));
        add(dChooserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 138, 200, -1));
        add(dChooserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 168, 200, -1));

        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
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
        add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 35, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/NuevoViaje.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered

    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited

    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el viaje?", "Eliminar Viaje", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            modelo.eliminarViaje(modViaje);
            miVentana.dispose();
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseClicked
        if (txtNombre.getText().length() > 0 && dChooserFechaI != null && dChooserFechaF != null) {
            Viaje viaje;

            if (modViaje == null) {
                viaje = new Viaje();
            } else {
                viaje = modViaje;
            }

            viaje.setNombre(txtNombre.getText());
            Calendar c = dChooserFechaI.getCalendar();

            try {
                viaje.setFechaI(c);
                viaje.setFechaF(dChooserFechaI.getCalendar(), dChooserFechaF.getCalendar());

                if (modViaje == null) {
                    modelo.agregarViaje(viaje);
                }

                miVentana.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblBotonMouseClicked

    private void lblBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseEntered
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
    }//GEN-LAST:event_lblBotonMouseEntered

    private void lblBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseExited
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblBotonMouseExited

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlMisViajes(modelo, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dChooserFechaF;
    private com.toedter.calendar.JDateChooser dChooserFechaI;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
