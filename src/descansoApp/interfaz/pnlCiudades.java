

package descansoApp.interfaz;


import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.ComercioActividad;
import descansoApp.herramientas.TipoCA;

public class pnlCiudades extends javax.swing.JPanel {
    private Sistema modelo;
    private JFrame padre;
   private Ciudad unaCiudad;
    
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
        lblDondeDormir = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCiudades = new javax.swing.JList<>();
        lblQueHacer = new javax.swing.JLabel();
        lblAgregarCiudad = new javax.swing.JLabel();
        lblEliminarCiudad = new javax.swing.JLabel();
        lblDondeComer = new javax.swing.JLabel();
        Volver = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        lblDondeDormir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeDormir.png"))); // NOI18N
        lblDondeDormir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeDormirMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Ciudades");

        jScrollPane1.setNextFocusableComponent(lblAgregarCiudad);

        jScrollPane1.setViewportView(lstCiudades);

        lblQueHacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueHacer.png"))); // NOI18N
        lblQueHacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseClicked(evt);
            }
        });

        lblAgregarCiudad.setText("Agregar ciudad");
        lblAgregarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseClicked(evt);
            }
        });

        lblEliminarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        lblEliminarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarCiudadMouseClicked(evt);
            }
        });

        lblDondeComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeComer.png"))); // NOI18N
        lblDondeComer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseClicked(evt);
            }
        });

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/FondoInicio.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInicio)
                .addGap(56, 56, 56)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDondeComer)
                        .addGap(18, 18, 18)
                        .addComponent(lblDondeDormir)
                        .addGap(18, 18, 18)
                        .addComponent(lblQueHacer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEliminarCiudad)
                        .addGap(18, 18, 18)
                        .addComponent(lblAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitulo)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQueHacer)
                    .addComponent(lblDondeDormir)
                    .addComponent(lblDondeComer)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAgregarCiudad)
                        .addComponent(lblEliminarCiudad)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void lblEliminarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarCiudadMouseClicked
        if(!lstCiudades.isSelectionEmpty()){
            int seleccion = lstCiudades.getSelectedIndex();
            modelo.getListaCiudades().remove(seleccion);
            cargarLista();} 
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblEliminarCiudadMouseClicked

    private void lblDondeComerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeComerMouseClicked
        if(!lstCiudades.isSelectionEmpty()){
            Ciudad ciudad = modelo.getListaCiudades().get(lstCiudades.getSelectedIndex());            
            padre.remove(this);
            padre.add(new pnlAgregarDonde(modelo, padre, ciudad, TipoCA.estGastronomico));
            padre.pack();
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_lblDondeComerMouseClicked

    private void lblDondeDormirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeDormirMouseClicked
        if(!lstCiudades.isSelectionEmpty()){
            Ciudad ciudad = modelo.getListaCiudades().get(lstCiudades.getSelectedIndex());            
            padre.remove(this);
            padre.add(new pnlAgregarDonde(modelo, padre, ciudad, TipoCA.alojamiento));
            padre.pack();
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_lblDondeDormirMouseClicked

    private void lblQueHacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueHacerMouseClicked
        if(!lstCiudades.isSelectionEmpty()){
            Ciudad ciudad = modelo.getListaCiudades().get(lstCiudades.getSelectedIndex());            
            padre.remove(this);
            padre.add(new pnlAgregarDonde(modelo, padre, ciudad, TipoCA.actividad));
            padre.pack();
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_lblQueHacerMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_VolverMouseClicked
    private void cargarLista (){
        ArrayList <Ciudad> ciudades = modelo.getListaCiudades();
        DefaultListModel listaCiudades = new DefaultListModel();
        for (int i = 0; i < ciudades.size(); i++) {
            listaCiudades.addElement(ciudades.get(i).toString());
        }
        lstCiudades.setModel(listaCiudades);
    }
    
    // recibe una ciudad seleccionada, la encuentra en la lista y muestra los lugares para comer
    /*private void cargarLstCA(Ciudad unaCiudad){
         ArrayList<ComercioActividad> listaCA= new ArrayList<ComercioActividad>();
         DefaultListModel lstCA = new DefaultListModel();
        for (int i = 0; i < modelo.getListaCiudades().size(); i++){
            Ciudad laCiudad= modelo.getListaCiudades().get(i);
            if(laCiudad.equals(unaCiudad)){
               lstCA.addElement(laCiudad.getEstGastronomicos());
               
            
            }
        }
         lstCiudades.setModel(lstCA);
        
    }*/
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarCiudad;
    private javax.swing.JLabel lblDondeComer;
    private javax.swing.JLabel lblDondeDormir;
    private javax.swing.JLabel lblEliminarCiudad;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblQueHacer;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstCiudades;
    // End of variables declaration//GEN-END:variables
}
