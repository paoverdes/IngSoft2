

package descansoApp.interfaz;


import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class pnlCiudades extends javax.swing.JPanel {
    private Sistema modelo;
    private JFrame padre;
    
    public pnlCiudades(Sistema unModelo, JFrame miPadre) {
        initComponents();        
        modelo = unModelo;
        padre = miPadre;
        cargarLista();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicio = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCiudades = new javax.swing.JList<>();
        lblAgregarCiudad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Ciudades");

        jScrollPane1.setNextFocusableComponent(lblAgregarCiudad);

        jScrollPane1.setViewportView(lstCiudades);

        lblAgregarCiudad.setText("Agregar Ciudad");
        lblAgregarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio)
                .addGap(104, 104, 104)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(lblAgregarCiudad)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio)
                    .addComponent(lblTitulo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgregarCiudad)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblAgregarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarCiudadMouseClicked
        padre.remove(this);
        padre.add(new pnlAgregarCiudad(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblAgregarCiudadMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(!lstCiudades.isSelectionEmpty()){
            int seleccion = lstCiudades.getSelectedIndex();
            modelo.getListaCiudades().remove(seleccion);
            cargarLista();} 
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    private void cargarLista (){
        ArrayList <Ciudad> ciudades = modelo.getListaCiudades();
        DefaultListModel listaCiudades = new DefaultListModel();
        for (int i = 0; i < ciudades.size(); i++) {
            listaCiudades.addElement(ciudades.get(i).toString());
        }
        lstCiudades.setModel(listaCiudades);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarCiudad;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstCiudades;
    // End of variables declaration//GEN-END:variables
}
