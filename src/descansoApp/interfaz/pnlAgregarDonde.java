

package descansoApp.interfaz;


import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.ComercioActividad;
import descansoApp.herramientas.TipoCA;

public class pnlAgregarDonde extends javax.swing.JPanel {
    private Sistema modelo;
    private JFrame padre;
   private Ciudad unaCiudad;
   private TipoCA elTipo;
    
    public pnlAgregarDonde(Sistema unModelo, JFrame miPadre, Ciudad laCiudad,  TipoCA unTipo) {
        initComponents();        
        modelo = unModelo;
        padre = miPadre;
        unaCiudad= laCiudad;
        elTipo = unTipo;
        if(elTipo == TipoCA.estGastronomico){
            lblTitulo.setText("¿Donde comer?");
        }
        if(elTipo == TipoCA.actividad){
            lblTitulo.setText("¿Que hacer?");
        }
        if(elTipo == TipoCA.alojamiento){
            lblTitulo.setText("¿Donde dormir?");
        }        
        cargarLista();         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicio = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstActividad = new javax.swing.JList<>();
        lblAgregarLugar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        Volver = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("¿Donde Comer?");

        jScrollPane1.setNextFocusableComponent(lblAgregarLugar);

        jScrollPane1.setViewportView(lstActividad);

        lblAgregarLugar.setText("Agregar");
        lblAgregarLugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarLugarMouseClicked(evt);
            }
        });

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png"))); // NOI18N
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
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
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblEliminar)
                        .addGap(56, 56, 56)
                        .addComponent(lblAgregarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicio)
                .addGap(54, 54, 54)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 840, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio)
                    .addComponent(lblTitulo)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEliminar)
                    .addComponent(lblAgregarLugar))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblAgregarLugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarLugarMouseClicked
        padre.remove(this);
        padre.add(new pnlAgregarComercioActividad(modelo, padre, unaCiudad, elTipo));
        padre.pack();
    }//GEN-LAST:event_lblAgregarLugarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        if(!lstActividad.isSelectionEmpty()){
            int seleccion = lstActividad.getSelectedIndex();
            if(elTipo == TipoCA.estGastronomico){
                unaCiudad.getEstGastronomicos().remove(seleccion);            
            }
            if(elTipo == TipoCA.actividad){
                unaCiudad.getActividades().remove(seleccion);            
            }
            if(elTipo == TipoCA.alojamiento){
                unaCiudad.getAlojamientos().remove(seleccion);            
            }              
            cargarLista();} 
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        padre.remove(this);
        padre.add(new pnlCiudades(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_VolverMouseClicked
    private void cargarLista (){
        ArrayList <ComercioActividad> lista = new ArrayList <ComercioActividad>() ;
        if(elTipo == TipoCA.estGastronomico){
            lista = unaCiudad.getEstGastronomicos();
        }
        if(elTipo == TipoCA.actividad){
            lista = unaCiudad.getActividades();
        }
        if(elTipo == TipoCA.alojamiento){
            lista = unaCiudad.getAlojamientos();            
        }           
        DefaultListModel listaEventosAgregados = new DefaultListModel();
        for (int i = 0; i < lista.size(); i++) {
            listaEventosAgregados.addElement(lista.get(i).toString());
        }               
        lstActividad.setModel(listaEventosAgregados);
    }        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarLugar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstActividad;
    // End of variables declaration//GEN-END:variables
}
