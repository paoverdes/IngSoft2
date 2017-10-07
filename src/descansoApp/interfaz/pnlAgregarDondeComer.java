/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descansoApp.interfaz;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.DefaultListModel;
import java.util.ArrayList;
import descansoApp.herramientas.TipoCA;


/**
 *
 * @author Daniela
 */
public class pnlAgregarDondeComer extends javax.swing.JPanel {

     private Sistema modelo;
     private JFrame padre;
     Ciudad ciudad;
     
     
    public pnlAgregarDondeComer(Sistema unModelo, JFrame miPadre) {
        initComponents();
       modelo= unModelo;
       padre= miPadre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDetalles = new javax.swing.JLabel();
        txtdetalles = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblWeb = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblNombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblDetalles.setText("Detalles");

        lblCategoria.setText("Categoria");

        lblHorario.setText("Horario");

        lblUbicacion.setText("Ubicacion");

        lblTelefono.setText("Telefono");

        lblWeb.setText("Web");

        lblPrecio.setText("Precio");

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Donde comer");

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblUbicacion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWeb)
                        .addGap(18, 18, 18)
                        .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrecio)
                        .addGap(27, 27, 27)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblDetalles))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtdetalles))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(23, 23, 23))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTelefono)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetalles)
                    .addComponent(txtdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeb)
                    .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbicacion)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        
      
         TipoCA elTipo= TipoCA.estGastronomico;
         ComercioActividad nuevo= new ComercioActividad();
         nuevo.setNombre(txtNombre.getText());
         nuevo.setDetalles(txtdetalles.getText());
         nuevo.setHorario(txtHorario.getText());
         nuevo.setCategoria(txtCategoria.getText());
         nuevo.setPrecio(txtPrecio.getText());
         nuevo.setTelefono(txtTelefono.getText());
         nuevo.setUbicacion(txtUbicacion.getText());
         nuevo.setTipo(elTipo);
         boolean seGuarda= true;
         if(nuevo.getNombre().equals("") || nuevo.getDetalles().equals("") || nuevo.getHorario().equals("") || nuevo.getCategoria().equals("")|| nuevo.getUbicacion().equals("") || nuevo.getTelefono().equals("")|| nuevo.getWeb().equals("") ||nuevo.getPrecio().equals("")){
              JOptionPane.showMessageDialog(this, "Hay campos sin completar", "Error", JOptionPane.ERROR_MESSAGE);
              seGuarda= false;
         }
         else{
              Ciudad unaCiudad= new Ciudad();
              unaCiudad.agregarComercioActividad(elTipo, nuevo);
              
         }
         
         
         
        /*nuevaCiudad.setNombre(txtNombre.getText());
        nuevaCiudad(DescripcionCiudad.getText());
        nuevaCiudad.setInfoGral(InfoCiudad.getText());
        boolean seAgrega = true;
        if(nuevaCiudad.getNombre().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            seAgrega = false;
        }else if(modelo.perteneceCiudad(nuevaCiudad)){
            JOptionPane.showMessageDialog(this, "Esa ciudad ya se encuentra ingresada", "Error", JOptionPane.ERROR_MESSAGE);
            seAgrega = false;        
        }else if(nuevaCiudad.getInfoGral().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar la información gral", "Error", JOptionPane.ERROR_MESSAGE);
            seAgrega = false;
        }else if(nuevaCiudad.getDescripcion().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción", "Error", JOptionPane.ERROR_MESSAGE);
            seAgrega = false;
        }
        if (seAgrega){
            modelo.agregarCiudad(nuevaCiudad);
            JOptionPane.showMessageDialog(this, "Ciudad ingresada con éxito", "INFO", JOptionPane.INFORMATION_MESSAGE);            
        }*/
       
         
         
    }//GEN-LAST:event_lblGuardarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblWeb;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtWeb;
    private javax.swing.JTextField txtdetalles;
    // End of variables declaration//GEN-END:variables
}
