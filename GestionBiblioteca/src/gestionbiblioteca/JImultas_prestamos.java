/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionbiblioteca;

/**
 *
 * @author Aitor
 */
public class JImultas_prestamos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JImultas_prestamos
     */
    public JImultas_prestamos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTmultapres = new javax.swing.JTable();
        jBcerrar = new javax.swing.JButton();
        jBteliminar = new javax.swing.JButton();
        jBtanadir = new javax.swing.JButton();
        jCHKmoseliminados = new javax.swing.JCheckBox();
        jBtmodificar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1300, 600));

        jTmultapres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID PRÉSTAMO", "ID MULTA", "PAGADA", "FECHA PAGO"
            }
        ));
        jTmultapres.setPreferredSize(new java.awt.Dimension(1300, 588));
        jScrollPane1.setViewportView(jTmultapres);

        jBcerrar.setText("Cerrar Ventana");

        jBteliminar.setText("Eliminar");

        jBtanadir.setText("Añadir");

        jCHKmoseliminados.setText("Mostrar eliminados");

        jBtmodificar.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtanadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCHKmoseliminados)
                    .addComponent(jBcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtanadir)
                        .addGap(33, 33, 33)
                        .addComponent(jBtmodificar)
                        .addGap(28, 28, 28)
                        .addComponent(jBteliminar)
                        .addGap(47, 47, 47)
                        .addComponent(jCHKmoseliminados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBcerrar)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcerrar;
    private javax.swing.JButton jBtanadir;
    private javax.swing.JButton jBteliminar;
    private javax.swing.JButton jBtmodificar;
    private javax.swing.JCheckBox jCHKmoseliminados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmultapres;
    // End of variables declaration//GEN-END:variables
}