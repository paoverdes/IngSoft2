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
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));

        lblAgregarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnAgregar.png"))); // NOI18N
        lblAgregarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarCiudadMouseClicked(evt);
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

        jLabel1.setText("Cargar Imagenes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreCiudad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInformacionGeneral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgregarCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInicio)
                        .addGap(238, 238, 238)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicio))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInformacionGeneral)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(lblAgregarCiudad)
                .addGap(26, 26, 26))
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
        }
    }//GEN-LAST:event_lblAgregarCiudadMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblInicioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescripcionCiudad;
    private javax.swing.JTextArea InfoCiudad;
    private javax.swing.JTextField NombreCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregarCiudad;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInformacionGeneral;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
