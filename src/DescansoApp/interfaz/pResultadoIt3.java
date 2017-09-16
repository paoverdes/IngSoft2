package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

public class pResultadoIt3 extends javax.swing.JPanel {

    private Evento evento;
    private Viaje viaje;
    private JFrame miVentana;
    private JPanel miPanel;
    private Sistema modelo;

    public pResultadoIt3(Sistema unModelo,Viaje unViaje, Evento unEvento, JFrame miContenedorPrincipal, JPanel miContenedor) {
        initComponents();
        modelo= unModelo;
        evento = unEvento;
        viaje = unViaje;
        miVentana = miContenedorPrincipal;
        miPanel = miContenedor;

        lblHora.setText(evento.horaInicioToString());
        lblNombre.setText(evento.getNombre());
        lblUbicacion.setText("(" + evento.getUbicacion() + ")");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();

        setOpaque(false);

        lblHora.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblHora.setText("18:00 hs");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 204));
        lblNombre.setText("Nombre del Evento");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
        });

        lblUbicacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblUbicacion.setText("(Ubicacion)");

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Editar.png"))); // NOI18N
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblHora)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUbicacion)
                .addGap(18, 18, 18)
                .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblHora)
                .addComponent(lblNombre)
                .addComponent(lblUbicacion))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlEvento(modelo, viaje, evento.getCiudad(), evento, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlInformacionEvento(modelo, viaje, evento, miVentana));
        miVentana.pack();        
    }//GEN-LAST:event_lblNombreMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUbicacion;
    // End of variables declaration//GEN-END:variables
}
