/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import conexion.ConexionSingleton;
import static formularios.JI_Socios.setOcultarColumnasJTable;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Bprestamos;
import modelo.Bsocios;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juan
 */
public class JI_Socios extends javax.swing.JInternalFrame {

    /**
     * Creates new form JI_Socios
     */
    private static JI_Socios instancia;
    public DefaultTableModel tablaSocios;

    public static JI_Socios getInstancia() {
        // Si la instancia no está creada o la ventana está cerrada se crea la instancia

        if (instancia == null) {
            instancia = new JI_Socios();
        }
        return instancia;
    }

    private JI_Socios() {
        initComponents();
        tablaSocios = (DefaultTableModel) jTableSocios.getModel();
        llenarTablaSociosInicioHibernate();
    }

    

    private void llenarTablaSociosInicioHibernate() {
        String sql = "FROM Bsocios s WHERE s.eliminado=0 ORDER BY s.apellidos ";
        llenarTablaSociosHibernate(sql);
    }

    

    private void llenarTablaSociosHibernate(String sql) {
        limpiarTabla(tablaSocios);
        Session sesion = JF_Menu.instanciaHibernate.openSession();
        Query consulta = sesion.createQuery(sql);
        Iterator iter = consulta.iterate();
        while (iter.hasNext()) {
            Bsocios socio = (Bsocios) iter.next();
            Object nuevo[] = {socio.getIdsocio(), socio.getDni(), socio.getApellidos(), socio.getNombre(), socio.getPcodPobl().getPpoblaciones().getPoblacion()};
            tablaSocios.addRow(nuevo);
        }
        setOcultarColumnasJTable(jTableSocios, new int[]{0});
        sesion.close();
    }

    public static void setOcultarColumnasJTable(JTable tbl, int columna[]) {
        for (int i = 0; i < columna.length; i++) {
            tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
            tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
        }
    }

    private void limpiarTabla(DefaultTableModel tabla) {
        int a = tabla.getRowCount() - 1;  //Índices van de 0 a n-1
        for (int i = a; i >= 0; i--) {
            tabla.removeRow(i);
        }
    }

    private void filtrar() {

        String sql = "FROM Bsocios s ";
        if (radioEliminados.isSelected()) {
            sql = sql + " WHERE s.eliminado =1";
        } else {
            sql = sql + " WHERE s.eliminado =0";
        }
        if (txtApellidos.getText().length() > 0) {
            sql = sql + " and upper(s.apellidos) like '%" + txtApellidos.getText().toUpperCase() + "%'";
        }
        if (txtDNI.getText().length() > 0) {
            sql = sql + " and upper(s.dni) like '%" + txtDNI.getText().toUpperCase() + "%'";
        }

        sql = sql + " order by s.apellidos";

        llenarTablaSociosHibernate(sql);

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
        jTableSocios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        radioEliminados = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SOCIOS");

        jTableSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdSocio", "Dni", "Apellidos", "Nombre", "Poblacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSocios);

        jLabel1.setText("FILTROS");

        jLabel2.setText("Apellidos");

        jLabel3.setText("DNI");

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
        });

        txtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDNIFocusLost(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDNIKeyReleased(evt);
            }
        });

        radioEliminados.setText("Eliminados");
        radioEliminados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioEliminadosStateChanged(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EXIT_ (23).jpg"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Filtros");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(radioEliminados, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioEliminados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(64, 64, 64)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusLost
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_txtDNIFocusLost

    private void txtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_txtDNIKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void radioEliminadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioEliminadosStateChanged
        // TODO add your handling code here:
        if (radioEliminados.isSelected()) {
            btnEliminar.setText("Restaurar");
        } else {
            btnEliminar.setText("Eliminar");
        }
        filtrar();
    }//GEN-LAST:event_radioEliminadosStateChanged

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Frame f = JOptionPane.getFrameForComponent(this);
        JD_SocioNuevo dialogSocioNuevo = new JD_SocioNuevo(f, true, "0");
        dialogSocioNuevo.dispose();
        dialogSocioNuevo.setVisible(true);
        // Actualizamos el jTable
        llenarTablaSociosInicioHibernate();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (jTableSocios.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay Socio");
        } else {
            if (jTableSocios.getSelectedRow() != -1) {
                //devuelve el valor de la fila selecciona y la columna que es código departamento
                String idEditorial = String.valueOf(jTableSocios.getValueAt(jTableSocios.getSelectedRow(), 0));
                Frame f = JOptionPane.getFrameForComponent(this);
                JD_SocioNuevo socioNuevo = new JD_SocioNuevo(f, true, idEditorial);
                socioNuevo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguno");
            }
        }
        llenarTablaSociosInicioHibernate();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (radioEliminados.isSelected()) {
            eliminarORestaurarHibernate(false, "restaurar");
        } else {
            eliminarORestaurarHibernate(true, "eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtApellidos.setText("");
        txtDNI.setText("");
        llenarTablaSociosInicioHibernate();
    }//GEN-LAST:event_btnLimpiarActionPerformed
  

    public void eliminarORestaurarHibernate(boolean eliminado, String texto) {

        if (jTableSocios.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay socios");
        } else {

            if (jTableSocios.getSelectedRow() != -1) {

                //devuelve el valor de la fila selecciona y la columna 0
                int fila = jTableSocios.getSelectedRow();

                if (tieneLibroPrestadoHibernate(String.valueOf(jTableSocios.getValueAt(fila, 0)))) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar al socio; tiene un libro prestado");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea " + texto + " el registro : " + jTableSocios.getValueAt(fila, 2) + "?");
                    Session sesion = JF_Menu.instanciaHibernate.openSession();
                    if (opcion == JOptionPane.YES_OPTION) {

                        Transaction tx = sesion.beginTransaction();
                        Bsocios soc = new Bsocios();
                        soc = (Bsocios) sesion.get(Bsocios.class, Integer.parseInt(jTableSocios.getValueAt(fila, 0).toString()));
                        soc.setEliminado(eliminado);
                        tx.commit();
                        tablaSocios.removeRow(fila);

                        String texto2;
                        if (texto.equals("eliminar")) {
                            texto2 = "eliminado";
                        } else {
                            texto2 = "restaurado";
                        }
                        JOptionPane.showMessageDialog(null, "Registro " + texto2);

                    }
                    sesion.close();

                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguno");
            }
        }

    }

   

    private boolean tieneLibroPrestadoHibernate(String idSocio) {
        String sql = "FROM Bprestamos p WHERE p.bsocios.idsocio=" + idSocio;
        Session sesion = JF_Menu.instanciaHibernate.openSession();
        Query consulta = sesion.createQuery(sql);
        Iterator iter = consulta.iterate();
        while (iter.hasNext()) {
            Bprestamos pres = (Bprestamos) iter.next();
            int prestamos = pres.getBsocios().getIdsocio();
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSocios;
    private javax.swing.JRadioButton radioEliminados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
