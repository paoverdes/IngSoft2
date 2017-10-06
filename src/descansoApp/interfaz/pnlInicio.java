package descansoApp.interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;

public class pnlInicio extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public pnlInicio(Sistema unModelo, JFrame miPadre) {
        initComponents();
        modelo = unModelo;
        padre = miPadre;
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViaje.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCiudades = new javax.swing.JLabel();
        lblNuevoViaje = new javax.swing.JLabel();
        lblMisViajes = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        lblBuscador = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCiudad.png"))); // NOI18N
        lblCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCiudadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCiudadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCiudadesMouseExited(evt);
            }
        });
        add(lblCiudades);
        lblCiudades.setBounds(110, 150, 130, 40);
        lblCiudades.getAccessibleContext().setAccessibleName("lblAgregarCiudad");

        lblNuevoViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNuevoViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevoViajeMouseExited(evt);
            }
        });
        add(lblNuevoViaje);
        lblNuevoViaje.setBounds(110, 215, 130, 40);

        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/btnMisViajes.png"))); // NOI18N
        lblMisViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisViajesMouseExited(evt);
            }
        });
        add(lblMisViajes);
        lblMisViajes.setBounds(110, 280, 132, 40);

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/Lupa.png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        add(lblBuscar);
        lblBuscar.setBounds(720, 290, 20, 20);

        txtBuscador.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtBuscador.setBorder(null);
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });
        add(txtBuscador);
        txtBuscador.setBounds(370, 290, 340, 22);

        lblBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/Buscador.png"))); // NOI18N
        add(lblBuscador);
        lblBuscador.setBounds(340, 190, 440, 160);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/FondoInicio.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        add(lblImagen);
        lblImagen.setBounds(0, 0, 840, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void lblNuevoViajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseEntered
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViajeON.png")));
    }//GEN-LAST:event_lblNuevoViajeMouseEntered

    private void lblNuevoViajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseExited
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnNuevoViaje.png")));
    }//GEN-LAST:event_lblNuevoViajeMouseExited

    private void lblMisViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseEntered
        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnMisViajesON.png")));
    }//GEN-LAST:event_lblMisViajesMouseEntered

    private void lblMisViajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseExited
        lblMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnMisViajes.png")));
    }//GEN-LAST:event_lblMisViajesMouseExited

    private void lblNuevoViajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoViajeMouseClicked
        PopUp p= new PopUp();
        p.add(new pnlNuevoViaje(modelo, p, null));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_lblNuevoViajeMouseClicked

    private void lblMisViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisViajesMouseClicked
        PopUp p= new PopUp();
        p.add(new pnlMisViajes(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_lblMisViajesMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        buscar();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void lblCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCiudadesMouseClicked
        padre.remove(this);
        padre.add(new pnlCiudades(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblCiudadesMouseClicked

    private void lblCiudadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCiudadesMouseEntered
        lblCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCiudadONN.png")));
    }//GEN-LAST:event_lblCiudadesMouseEntered

    private void lblCiudadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCiudadesMouseExited
        lblCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCiudad.png")));
    }//GEN-LAST:event_lblCiudadesMouseExited

    private void buscar() {
        if (txtBuscador.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una palabra clave (más de tres letras) en el cuadro de busqueda", "Busqueda Vacía", JOptionPane.INFORMATION_MESSAGE);
        } else {
            padre.remove(this);
            padre.add(new pnlResultadoBusqueda(modelo, padre, txtBuscador.getText()), BorderLayout.WEST);
            padre.pack();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBuscador;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCiudades;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMisViajes;
    private javax.swing.JLabel lblNuevoViaje;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
