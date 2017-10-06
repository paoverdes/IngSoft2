

package descansoApp.interfaz;


import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.ComercioActividad;

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
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCiudades = new javax.swing.JList<>();
        lblAgregarCiudad = new javax.swing.JLabel();
        lblEliminarCiudad = new javax.swing.JLabel();

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
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(651, 651, 651)
                        .addComponent(lblEliminarCiudad)
                        .addGap(56, 56, 56)
                        .addComponent(lblAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEliminarCiudad)
                    .addComponent(lblAgregarCiudad))
                .addGap(20, 20, 20))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarCiudad;
    private javax.swing.JLabel lblEliminarCiudad;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstCiudades;
    // End of variables declaration//GEN-END:variables
}
