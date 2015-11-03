/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class PC02_JD_Ventas extends javax.swing.JDialog {

    /**
     * Creates new form PCXX_JD_Ventas
     */
    public PC02_JD_Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        conexion=ConexionBDSingleton.getInstance("Oracle", "localhost", "oradam2", "ad", "ad");
        
        String consulta_Vendedores="select idvendedor, nombre_vend from ex_vendedores where eliminado=0";
        String consulta_Articulos="select idarticulo, descr_artic from ex_articulos where eliminado=0";
        String consulta_zonas="select idzona, nombre_zona from ex_zonas";
        
        conexion.rellenaComboBox2Columnas(comboVendedores, consulta_Vendedores, "--Elige Vendedor--", "idvendedor", "nombre_vend");
        
        conexion.rellenaComboBox2Columnas(comboArticulos, consulta_Articulos, "--Elige Articulo--", "idarticulo", "descr_artic");
        
        conexion.rellenaComboBox2Columnas(comboZonas, consulta_zonas, "--Elige zona--", "idzona", "nombre_zona");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboVendedores = new javax.swing.JComboBox();
        comboArticulos = new javax.swing.JComboBox();
        txtUnidades = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboZonas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dateFechaVenta = new com.toedter.calendar.JDateChooser();
        btnAnadir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblControlUnidades = new javax.swing.JLabel();
        lblControlLongitudUnidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir Ventas");

        jLabel1.setText("Vendedor");

        jLabel2.setText("Articulo");

        jLabel3.setText("Unidades Vendidas");

        comboVendedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Vendedor" }));

        comboArticulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Articulo" }));

        txtUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesActionPerformed(evt);
            }
        });
        txtUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesKeyTyped(evt);
            }
        });

        jLabel4.setText("Zona de la Venta");

        comboZonas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Zona" }));
        comboZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboZonasActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Venta");

        btnAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addition.gif"))); // NOI18N
        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir22x22.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboVendedores, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE)
                            .addComponent(comboArticulos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboZonas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblControlUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dateFechaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblControlLongitudUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnadir)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(comboZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dateFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblControlUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblControlLongitudUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnadir)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesActionPerformed

    private void comboZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboZonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboZonasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       
        comboVendedores.setSelectedIndex(0);
        comboArticulos.setSelectedIndex(0);
        comboZonas.setSelectedIndex(0);
        
        txtUnidades.setText("");
        
        dateFechaVenta.setDate(null);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesKeyTyped
       
        MetodosComunes.escribirSoloNumeros(evt, lblControlUnidades);
        MetodosComunes.noEscribirMasDe(txtUnidades, 8, evt, lblControlLongitudUnidades);
        
    }//GEN-LAST:event_txtUnidadesKeyTyped

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        
        String error="";
        
        int codVend=MetodosComunes.devolverCodigoComboBox(comboVendedores);
        int codArt=MetodosComunes.devolverCodigoComboBox(comboArticulos);
        int codZona=MetodosComunes.devolverCodigoComboBox(comboZonas);
        int fecha=MetodosComunes.deFechaANumero(dateFechaVenta.getDate());
        
        if(codVend==-1){
            error+="- Selecciona un Vendedor\n";
        }
        
        if(codArt==-1){
            error+="- Selecciona un articulo";
        }
        
        if(codZona==-1){
            error+="- Selecciona una zona\n";
        }
        
        if(txtUnidades.getText().equals("")){
            error+="- Selecciona una cantidad";
        }
        
        if(!conexion.consultaVaciaV2("select count(*) from ex_ventas where idvendedor="+codVend+" and idarticulo="+codArt+" and idzona="+codZona+" and fecha_venta="+fecha)){
            error+="- Ya existe un registro identico\n";
        }
        
        
        if(error.equals("")){
            
            int seleccion=JOptionPane.showConfirmDialog(this, "¿Estas seguro de que quieres añadir el registro?");
                
            if(seleccion==JOptionPane.YES_OPTION){
                
                int codVenta=conexion.proximoIDDisponible("idventa", "ex_ventas");
            
                conexion.ejecutarInstruccion("insert into ex_ventas values(" 
                                            + " "+codVenta+", "
                                            + " "+codVend+", "
                                            + " "+codArt+","
                                            + " "+codZona+", "
                                            + " "+fecha+","
                                            + ""+txtUnidades.getText()+", "
                                            + "0)");
                
                conexion.commit();
             
                
                JOptionPane.showMessageDialog(this, "Venta añadida");
            }
                
        }else{
            JOptionPane.showMessageDialog(this, error);
        }
        
        
    }//GEN-LAST:event_btnAnadirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PC02_JD_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PC02_JD_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PC02_JD_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PC02_JD_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PC02_JD_Ventas dialog = new PC02_JD_Ventas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboArticulos;
    private javax.swing.JComboBox comboVendedores;
    private javax.swing.JComboBox comboZonas;
    private com.toedter.calendar.JDateChooser dateFechaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblControlLongitudUnidades;
    private javax.swing.JLabel lblControlUnidades;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
    private ConexionBDSingleton conexion;
}