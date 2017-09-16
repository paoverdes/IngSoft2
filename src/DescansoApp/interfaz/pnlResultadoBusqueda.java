package descansoApp.interfaz;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;
import descansoApp.dominio.Sistema;
import descansoApp.herramientas.Buscador;

public class pnlResultadoBusqueda extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public pnlResultadoBusqueda(Sistema unModelo, JFrame unPadre, String palabra) {
        initComponents();
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Fondo.png")));
        pnlResultados.setOpaque(false);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        padre = unPadre;

        busqueda(palabra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHome = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        lblNoHay = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 38, 20, 20));

        txtBuscador.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtBuscador.setBorder(null);
        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });
        add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 250, 20));

        lblNoHay.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblNoHay.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHay.setText("No hay resultados para la búsqueda realizada, vuelva a intentarlo ...");
        add(lblNoHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 130, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lblTitulo.setText("Resultados de la búsqueda");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 38, -1, -1));

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 770, 370));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Fondo.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed

    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        if (txtBuscador.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una palabra clave (más de tres letras) en el cuadro de busqueda", "Busqueda Vacía", JOptionPane.INFORMATION_MESSAGE);
        } else {
            busqueda(txtBuscador.getText());
            txtBuscador.setText("");
        }
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtBuscador.getText().length() <= 3) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una palabra clave (más de tres letras) en el cuadro de busqueda", "Busqueda Vacía", JOptionPane.INFORMATION_MESSAGE);
            } else {
                busqueda(txtBuscador.getText());
                txtBuscador.setText("");
            }
        }
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void busqueda(String unaPalabra) {
        pnlResultados.removeAll();
        pnlResultados.revalidate();
        pnlResultados.repaint();

        Buscador bus = new Buscador(modelo.getListaCiudades());
        ArrayList<descansoApp.dominio.Ciudad> resultados = bus.buscar(unaPalabra);

        int cantResultados = resultados.size();
        if (cantResultados > 0) {
            scroll.setVisible(true);
            lblNoHay.setVisible(false);
            
            for (int i = 0; i < cantResultados; i++) {
                pResultado pr = new pResultado(modelo, resultados.get(i), padre, this);
                
                pnlResultados.setLayout(new java.awt.BorderLayout());
                pnlResultados.add(pr);
                pr.setVisible(true);
                pnlResultados.setVisible(true);
                pnlResultados.revalidate();
                pnlResultados.repaint();
            }
        }
        else {
            scroll.setVisible(false);
            lblNoHay.setVisible(true);
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblNoHay;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
