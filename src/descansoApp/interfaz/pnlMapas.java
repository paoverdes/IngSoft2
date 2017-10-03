package descansoApp.interfaz;

import javax.swing.JFrame;
import descansoApp.dominio.Sistema;

public class pnlMapas extends javax.swing.JPanel {
    private Sistema modelo;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame padre;
    
    public pnlMapas(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unPadre)  {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        
        lblTitulo.setText("Mapa de " + ciudad.getNombre());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolver = new javax.swing.JLabel();
        lblMapa = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/mapaaa.jpg"))); // NOI18N
        add(lblMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 88, 810, 400));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Mapa de Fray Bentos");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 267, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Fondo.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new pnlInformacionCiudad(modelo, ciudad, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMapa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    // End of variables declaration//GEN-END:variables
}
