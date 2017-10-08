package descansoApp.interfaz;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class pnlAgregarCiudad extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;
    public pnlAgregarCiudad(Sistema unModelo, JFrame miPadre) {
        initComponents();
        modelo = unModelo;
        padre = miPadre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgregarCiudad = new javax.swing.JLabel();
        NombreCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoCiudad = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescripcionCiudad = new javax.swing.JTextArea();
        lblCiudad = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblInformacionGeneral = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblCargarImagenes = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        Volver = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblAgregarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnAgregar.png"))); // NOI18N
        lblAgregarCiudad.setPreferredSize(new java.awt.Dimension(202, 33));
        lblAgregarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseExited(evt);
            }
        });

        NombreCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCiudadActionPerformed(evt);
            }
        });

        InfoCiudad.setColumns(20);
        InfoCiudad.setRows(5);
        jScrollPane1.setViewportView(InfoCiudad);

        DescripcionCiudad.setColumns(20);
        DescripcionCiudad.setRows(5);
        jScrollPane2.setViewportView(DescripcionCiudad);

        lblCiudad.setText("Nombre de la ciudad:");

        lblTitulo.setText("Agregar una nueva ciudad");

        lblInformacionGeneral.setText("Información general:");

        lblDescripcion.setText("Descripcion:");

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        lblCargarImagenes.setText("Cargar Imagenes");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/FondoInicio.png"))); // NOI18N
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCiudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NombreCiudad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCargarImagenes)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblInformacionGeneral)
                                            .addComponent(lblDescripcion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1))))))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInicio)
                        .addGap(207, 207, 207)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 860, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicio)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInformacionGeneral)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGap(24, 24, 24)
                .addComponent(lblCargarImagenes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lblAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 537, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCiudadActionPerformed
        
    }//GEN-LAST:event_NombreCiudadActionPerformed

    private void lblAgregarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarCiudadMouseClicked
        Ciudad nuevaCiudad = new Ciudad();
        nuevaCiudad.setNombre(NombreCiudad.getText());
        nuevaCiudad.setDescripcion(DescripcionCiudad.getText());
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
            //nuevaCiudad.agregarComercioActividad(TipoCA.otros, nuevo);
        }
    }//GEN-LAST:event_lblAgregarCiudadMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblInicioMouseClicked

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        padre.remove(this);
        padre.add(new pnlCiudades(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_VolverMouseClicked

    private void lblAgregarCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarCiudadMouseEntered
       lblAgregarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnAgregarONN.png")));
    }//GEN-LAST:event_lblAgregarCiudadMouseEntered

    private void lblAgregarCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarCiudadMouseExited
        lblAgregarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnAgregar.png")));
    }//GEN-LAST:event_lblAgregarCiudadMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescripcionCiudad;
    private javax.swing.JTextArea InfoCiudad;
    private javax.swing.JTextField NombreCiudad;
    private javax.swing.JLabel Volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregarCiudad;
    private javax.swing.JLabel lblCargarImagenes;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInformacionGeneral;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
