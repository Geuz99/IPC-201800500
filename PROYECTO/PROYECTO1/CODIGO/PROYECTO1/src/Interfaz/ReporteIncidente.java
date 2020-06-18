/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Incidentes;
import Clases.NoCuentas;
import Clases.ColaTaller;
import static Interfaz.CargarDatos.InvMecanica;
import static Interfaz.CargarDatos.InvRepuesto;
import static Interfaz.Solicitudes.miscuentas;
//import static Interfaz.Solicitudes.nocuentas;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import tablas.TablaIncidente;

/**
 *
 * @author GEUZ99
 */
public class ReporteIncidente extends javax.swing.JDialog {

    private JTable tablita;
    TablaIncidente modelo;

    /**
     * Creates new form ReporteIncidente
     */
    public ReporteIncidente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PrintMecanica();
        PrintRepuesto();
        tablita = new JTable();
        modelo = new TablaIncidente(this.incidentes);
        tablita.setModel(modelo);
        jScrollPane1.setViewportView(tablita);

    }
    public static NoCuentas[] nocuentas = new NoCuentas[20];
    public static Incidentes[] incidentes = new Incidentes[20];
    public static ColaTaller[] colataller = new ColaTaller[20];
    int seleccion;

    public void PrintMecanica() {
        for (int i = 0; i < 20; i++) {
            if (InvMecanica[i] != null) {
                ServicioBox.addItem(InvMecanica[i].getNombre());
            }
        }
    }

    public void PrintRepuesto() {
        for (int i = 0; i < 20; i++) {
            if (InvRepuesto[i] != null) {
                RepuestoBox.addItem(InvRepuesto[i].getNombre());
            }
        }
    }

    public boolean CheckBox() {
//        String autor = "AUTOR";
//        String afectado = "AFECTADO";
        if (AseguradoCulpable.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public void addNoCuentas(NoCuentas obj) {
        for (int i = 0; i < 20; i++) {
            if (nocuentas[i] != null) {
                nocuentas[i] = obj;
                return;
            }
        }
    }

    public void VerificaciondeCuenta() {
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            if (miscuentas[i] != null) {
                if (miscuentas[i].getDpi().equals(dpiAseguradoTxt.getText())) {
                    System.out.println("EL ASEGURADO SI TIENE SEGURO");
                    contador = 1;
                }
            }
        }
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "ESTE DPI NO CUENTA CON UN SEGURO");
        }
    }

    public void addcuentas() {
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            if (miscuentas[i] != null) {
                if (miscuentas[i].getDpi().equals(dpiTerceroTxt.getText())) {
                    System.out.println("TIENE CUENTA");
                    contador = 1;
                } else {
                    //System.out.println("EL TERCERO NO CUENTA CON UN SEGURO");
//                    String nombre = JOptionPane.showInputDialog("POR FAVOR INGRESA TU NOMBRE ");
//                    String Telefono = JOptionPane.showInputDialog("POR FAVOR INGRESA TU NUMERO DE TELEFONO");
//                    String dpi = dpiTerceroTxt.getText();
//                    addNoCuentas(new NoCuentas(nombre, dpi, Telefono));
                }
            }

        }
        if (contador == 0) {
            System.out.println("EL TERCERO NO CUENTA CON UN SEGURO");
            String nombre = JOptionPane.showInputDialog("POR FAVOR INGRESA TU NOMBRE ");
                    String Telefono = JOptionPane.showInputDialog("POR FAVOR INGRESA TU NUMERO DE TELEFONO");
                    String dpi = dpiTerceroTxt.getText();
                    NoCuentas nocuentas = new NoCuentas(nombre,dpi,Telefono);
//                    addNoCuentas(new NoCuentas(nombre, dpi, Telefono));
                    SavenoCuentas(nocuentas);
                    
        }
    }
    public void SavenoCuentas(NoCuentas obj) {
        for (int i = 0; i < incidentes.length; i++) {
            if (nocuentas[i] == null) {
                nocuentas[i] = obj;
                break;
            }

        }
    }

    public String codigo() {
        int randomNumber = new Random().nextInt(9000) + 1000;
        String cod = String.valueOf(randomNumber);
        return cod;
    }

    public double ValorServicios(String repuesto) {
        double ValorRepuesto;
        for (int i = 0; i < 20; i++) {
            if (InvMecanica[i].getNombre().equals(repuesto)) {
                ValorRepuesto = (InvMecanica[i].getPrecio());
                return ValorRepuesto;
            }
        }
        return 0;
    }

    public double ValorRepuesto(String servicio) {
        double ValorRepuesto;
        for (int i = 0; i < 20; i++) {
            if (InvRepuesto[i].getNombre().equals(servicio)) {
                ValorRepuesto = (InvRepuesto[i].getPrecio());
                return ValorRepuesto;
            }
        }
        return 0;
    }

    public double Total() {
        double tot = ValorServicios(ServicioBox.getSelectedItem().toString());// + ValorRepuesto(RepuestoBox.getSelectedItem().toString());
        return tot;
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
        jLabel4 = new javax.swing.JLabel();
        dpiAseguradoTxt = new javax.swing.JTextField();
        dpiTerceroTxt = new javax.swing.JTextField();
        ServicioBox = new javax.swing.JComboBox<>();
        RepuestoBox = new javax.swing.JComboBox<>();
        AseguradoCulpable = new javax.swing.JCheckBox();
        TerceroSeguro = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        TotalTxt = new javax.swing.JTextField();
        btnReportar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REPORTE INCIDENTE AUTOMAS");

        jLabel1.setText("DPI ASEGURADO");

        jLabel2.setText("DPI TERCERO");

        jLabel3.setText("TIPO SERVICIOS");

        jLabel4.setText("REPUESTOS");

        AseguradoCulpable.setText("EL ASEGURADO ES CULPABLE");

        TerceroSeguro.setText("EL TERCERO TIENE SEGURO");

        btnAgregar.setBackground(new java.awt.Color(51, 255, 204));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("TOTAL");

        btnReportar.setBackground(new java.awt.Color(51, 255, 204));
        btnReportar.setText("REPORTAR INCIDENTE");
        btnReportar.setBorder(new javax.swing.border.MatteBorder(null));
        btnReportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(51, 255, 204));
        Cancelar.setText("CANCELAR");
        Cancelar.setBorder(new javax.swing.border.MatteBorder(null));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dpiAseguradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dpiTerceroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ServicioBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RepuestoBox, 0, 280, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AseguradoCulpable)
                                    .addComponent(TerceroSeguro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addComponent(btnReportar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dpiAseguradoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AseguradoCulpable))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpiTerceroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TerceroSeguro))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ServicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(RepuestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnReportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void btnReportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarActionPerformed
        seleccion = ValorFila();
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "No has seleccionado una fila");

        } else {
            String c0 = (String) tablita.getValueAt(seleccion, 0);
            String c1 = dpiAseguradoTxt.getText();
            String c2 = dpiTerceroTxt.getText();
            addTaller(new ColaTaller(c0, c1, c2));
        }

    }//GEN-LAST:event_btnReportarActionPerformed
    public void addTaller(ColaTaller obj) {
        for (int i = 0; i < 20; i++) {
            if (colataller[i] == null) {
                colataller[i] = obj;
                return;
            }
        }
    }

    public int ValorFila() {
        int seleccion = tablita.getSelectedRow();
        return seleccion;
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean a = CheckBox();
        String rolAsegurado;
        String rolTercero;
        if (a) {
            rolAsegurado = "AUTOR";
            rolTercero = "AFECTADO";
        } else {
            rolAsegurado = "AUTOR";
            rolTercero = "AFECTADO";
        }
        VerificaciondeCuenta();
        addcuentas();
        String codigo = codigo();
        String total = String.valueOf(Total());
        TotalTxt.setText(total);
        Incidentes inci = new Incidentes(codigo, rolAsegurado, rolTercero, total, dpiAseguradoTxt.getText(),
                dpiTerceroTxt.getText(), ServicioBox.getSelectedItem().toString(), RepuestoBox.getSelectedItem().toString());
        Save(inci);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void Save(Incidentes obj) {
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i] == null) {
                incidentes[i] = obj;
                break;
            }

        }
    }

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
            java.util.logging.Logger.getLogger(ReporteIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReporteIncidente dialog = new ReporteIncidente(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox AseguradoCulpable;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> RepuestoBox;
    private javax.swing.JComboBox<String> ServicioBox;
    private javax.swing.JCheckBox TerceroSeguro;
    private javax.swing.JTextField TotalTxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnReportar;
    private javax.swing.JTextField dpiAseguradoTxt;
    private javax.swing.JTextField dpiTerceroTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
