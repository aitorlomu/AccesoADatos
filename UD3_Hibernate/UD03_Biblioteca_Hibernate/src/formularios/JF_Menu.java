/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import conexion.ConexionSingleton;
import conexion.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 *
 * @author ALUMNOM
 */
public class JF_Menu extends javax.swing.JFrame {

    public ConexionSingleton bd = ConexionSingleton.getInstance("oracle", "localhost", "ORADAM2", "C##USRBIBLIOTECA", "biblioteca");
    public static SessionFactory instanciaHibernate = HibernateUtil.getSessionFactory();
    /**
     * Creates new form Menu
     */
    public JF_Menu() {
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

        jDeskPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalir = new javax.swing.JMenu();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuILibros = new javax.swing.JMenuItem();
        jMenuIMaterias = new javax.swing.JMenuItem();
        jMenuIEditoriales = new javax.swing.JMenuItem();
        jMenuISocios = new javax.swing.JMenuItem();
        jMenuIMultas = new javax.swing.JMenuItem();
        jMenuGestion = new javax.swing.JMenu();
        jMenuIPrestamos = new javax.swing.JMenuItem();
        jMenuIMultas2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIOTECA");
        setExtendedState(6);

        javax.swing.GroupLayout jDeskPrincipalLayout = new javax.swing.GroupLayout(jDeskPrincipal);
        jDeskPrincipal.setLayout(jDeskPrincipalLayout);
        jDeskPrincipalLayout.setHorizontalGroup(
            jDeskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jDeskPrincipalLayout.setVerticalGroup(
            jDeskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EXIT_ (23).jpg"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        jMenuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KDE Apps.jpg"))); // NOI18N
        jMenuMantenimiento.setText("Mantenimiento");

        jMenuILibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Libro.jpg"))); // NOI18N
        jMenuILibros.setText("Libros");
        jMenuILibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuILibrosActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuILibros);

        jMenuIMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Materias.gif"))); // NOI18N
        jMenuIMaterias.setText("Materias");
        jMenuIMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIMateriasActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuIMaterias);

        jMenuIEditoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editoriales.jpg"))); // NOI18N
        jMenuIEditoriales.setText("Editoriales");
        jMenuIEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIEditorialesActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuIEditoriales);

        jMenuISocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-socios.jpg"))); // NOI18N
        jMenuISocios.setText("Socios");
        jMenuISocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuISociosActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuISocios);

        jMenuIMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_03.png"))); // NOI18N
        jMenuIMultas.setText("Multas");
        jMenuIMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIMultasActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuIMultas);

        jMenuBar1.add(jMenuMantenimiento);

        jMenuGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0016.gif"))); // NOI18N
        jMenuGestion.setText("Gestión");

        jMenuIPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.jpg"))); // NOI18N
        jMenuIPrestamos.setText("Préstamos");
        jMenuIPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIPrestamosActionPerformed(evt);
            }
        });
        jMenuGestion.add(jMenuIPrestamos);

        jMenuIMultas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_03.png"))); // NOI18N
        jMenuIMultas2.setText("Multas");
        jMenuIMultas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIMultas2ActionPerformed(evt);
            }
        });
        jMenuGestion.add(jMenuIMultas2);

        jMenuBar1.add(jMenuGestion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDeskPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDeskPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIMultasActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Multas internalMultas = JI_Multas.getInstancia();
        jDeskPrincipal.add(internalMultas);
        internalMultas.show();
    }//GEN-LAST:event_jMenuIMultasActionPerformed

    private void jMenuIEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIEditorialesActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Editoriales internalEditoriales = JI_Editoriales.getInstancia();
        jDeskPrincipal.add(internalEditoriales);
        internalEditoriales.show();
    }//GEN-LAST:event_jMenuIEditorialesActionPerformed

    private void jMenuIMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIMateriasActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Materias internalMaterias = JI_Materias.getInstancia();
        jDeskPrincipal.add(internalMaterias);
        internalMaterias.show();
    }//GEN-LAST:event_jMenuIMateriasActionPerformed

    private void jMenuILibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuILibrosActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Libros internalLibros = JI_Libros.getInstancia();
        jDeskPrincipal.add(internalLibros);
        internalLibros.show();
    }//GEN-LAST:event_jMenuILibrosActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        int botonDialogo =JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?","AVISO",JOptionPane.YES_NO_OPTION);
        if(botonDialogo == JOptionPane.YES_OPTION){
            ConexionSingleton.cerrarConexion();
            System.exit(0);
        }

    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuISociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuISociosActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Socios internalSocios = JI_Socios.getInstancia();
        jDeskPrincipal.add(internalSocios);
        internalSocios.show();
    }//GEN-LAST:event_jMenuISociosActionPerformed

    private void jMenuIPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIPrestamosActionPerformed
        // TODO add your handling code here:jDeskPrincipal.removeAll();
        jDeskPrincipal.repaint();
        JI_Prestamos internalPrestamos = JI_Prestamos.getInstancia();
        jDeskPrincipal.add(internalPrestamos);
        internalPrestamos.show();
        
    }//GEN-LAST:event_jMenuIPrestamosActionPerformed

    private void jMenuIMultas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIMultas2ActionPerformed
        // TODO add your handling code here:
        jDeskPrincipal.repaint();
        JI_PagarMultas internalPagarMultas = JI_PagarMultas.getInstancia();
        jDeskPrincipal.add(internalPagarMultas);
        internalPagarMultas.show();
    }//GEN-LAST:event_jMenuIMultas2ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDeskPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGestion;
    private javax.swing.JMenuItem jMenuIEditoriales;
    private javax.swing.JMenuItem jMenuILibros;
    private javax.swing.JMenuItem jMenuIMaterias;
    private javax.swing.JMenuItem jMenuIMultas;
    private javax.swing.JMenuItem jMenuIMultas2;
    private javax.swing.JMenuItem jMenuIPrestamos;
    private javax.swing.JMenuItem jMenuISocios;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
