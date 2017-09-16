package descansoApp.interfaz;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;

public class pResultadoDondeQue extends javax.swing.JPanel {

    private Sistema modelo;
    private ComercioActividad cA;
    private JPanel padre;
    private JFrame ventana;
    private descansoApp.dominio.Ciudad ciudad;
   
    public pResultadoDondeQue(Sistema unModelo, ComercioActividad unCA,  JFrame unaVentana, JPanel unPadre, descansoApp.dominio.Ciudad unaCiudad) {
        initComponents();
       
        txtDes.setOpaque(false);
        txtDes.setLayout(new BoxLayout(txtDes, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        
        modelo = unModelo;
        cA = unCA;
        padre = unPadre;
        ventana = unaVentana;
        ciudad = unaCiudad;
        
        lblNombre.setText(unCA.getNombre());
        txtDes.setText(unCA.getDetalles());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();

        setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 204));
        lblNombre.setText("Nombre de DondeQue");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
        });

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDes.setEditable(false);
        txtDes.setColumns(20);
        txtDes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDes.setForeground(new java.awt.Color(255, 255, 255));
        txtDes.setLineWrap(true);
        txtDes.setRows(5);
        txtDes.setWrapStyleWord(true);
        txtDes.setHighlighter(null);
        scroll.setViewportView(txtDes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        ventana.remove(padre);
        ventana.add(new pnlInformacionComercioActividad(modelo, cA, ventana,ciudad));
        ventana.pack();
    }//GEN-LAST:event_lblNombreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea txtDes;
    // End of variables declaration//GEN-END:variables
}
