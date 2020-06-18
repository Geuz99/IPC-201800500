/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Solicitudes;
import static Interfaz.CargarDatos.InvLinea;
import static Interfaz.CargarDatos.InvMarca;
import static Interfaz.CargarDatos.InvModelo;
import static Interfaz.CargarDatos.InvTipo;
import static Interfaz.CargarDatos.InvUso;
import javax.swing.JOptionPane;

/**
 *
 * @author GEUZ99
 */
public class SolicitarSeguro extends javax.swing.JDialog {

    /**
     * Creates new form SolicitarSeguro
     */
    public SolicitarSeguro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PrintTipo();
        PrintModelo();
        PrintMarca();
        PrintLinea();
        PrintUso();
    }
    public static Solicitudes[] misdatos = new Solicitudes[20];

    public void PrintTipo() {
        for (int i = 0; i < 20; i++) {
            if (InvTipo[i] != null) {
                String tipo = InvTipo[i].getNombre();
                String valor = String.valueOf(InvTipo[i].getValorMaximo());
                TipoVehiculoBox.addItem(tipo);

            }
        }
    }

    public void PrintModelo() {
        for (int i = 0; i < 20; i++) {
            if (InvModelo[i] != null) {
                int modelo = InvModelo[i].getAnio();
                ModeloBox.addItem(Integer.toString(modelo));
            }
        }
    }

    public void PrintMarca() {
        for (int i = 0; i < 20; i++) {
            if (InvMarca[i] != null) {
                String marca = InvMarca[i].getNombre();
                MarcaBox.addItem(marca);
            }
        }
    }

    public void PrintLinea() {
        for (int i = 0; i < 20; i++) {
            if (InvLinea[i] != null) {
                String linea = InvLinea[i].getNombre();
                LineaBox.addItem(linea);
            }
        }
    }

    public void PrintUso() {
        for (int i = 0; i < 20; i++) {
            if (InvUso[i] != null) {
                String uso = InvUso[i].getNombre();
                UsoVehiculoBox.addItem(uso);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        masDeducible = new javax.swing.JButton();
        Solicitar = new javax.swing.JButton();
        nombreTxt = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        apellidoTxt = new javax.swing.JTextField();
        DPI = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        TipoVehiculoBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        UsoVehiculoBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        MarcaBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        LineaBox = new javax.swing.JComboBox<>();
        CostoPrimaTxt = new javax.swing.JTextField();
        ModeloBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        DeducibleTxt = new javax.swing.JTextField();
        Cotizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PCostoPrimaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PosibleDeducibleTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menosDeducible = new javax.swing.JButton();
        ValorVehiculoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOLICITUD DE SEGURO");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("MODELO");
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("VALOR DEL VEHICULO");
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 10));

        masDeducible.setBackground(new java.awt.Color(51, 255, 204));
        masDeducible.setText("+DEDUCIBLE");
        masDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masDeducibleActionPerformed(evt);
            }
        });

        Solicitar.setBackground(new java.awt.Color(51, 255, 204));
        Solicitar.setText("SOLICITAR SEGURO");
        Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(51, 255, 204));
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        TipoVehiculoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoVehiculoBoxActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DPI");
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel14.setText("POSIBLE DEDUCIBLE");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("TELEFONO");
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TIPO DE VEHICULO");
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 10));

        Cotizar.setBackground(new java.awt.Color(51, 255, 204));
        Cotizar.setText("COTIZAR");
        Cotizar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CotizarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("USO DEL VEHICULO");
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel11.setText("COSTO PRIMA");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRES");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MARCA");
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel12.setText("DEDUCIBLE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("APELLIDOS");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("LINEA");
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 10));

        jLabel13.setText("POSIBLE COSTO PRIMA ");

        menosDeducible.setBackground(new java.awt.Color(51, 255, 204));
        menosDeducible.setText("-DEDUCIBLE");
        menosDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosDeducibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PCostoPrimaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(PosibleDeducibleTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CostoPrimaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(DeducibleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ValorVehiculoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UsoVehiculoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 125, Short.MAX_VALUE)
                        .addComponent(TipoVehiculoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefonoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DPI, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(apellidoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MarcaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LineaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModeloBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menosDeducible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masDeducible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Solicitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellidoTxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DPI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTxt)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoVehiculoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsoVehiculoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarcaBox)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LineaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorVehiculoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Cotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CostoPrimaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(DeducibleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(PCostoPrimaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(PosibleDeducibleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosDeducible)
                    .addComponent(masDeducible)
                    .addComponent(Solicitar)
                    .addComponent(Cancelar))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void TipoVehiculoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoVehiculoBoxActionPerformed

    }//GEN-LAST:event_TipoVehiculoBoxActionPerformed

    private void CotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CotizarActionPerformed
        double valorEstablecido = valorEstablecido(TipoVehiculoBox.getSelectedItem().toString());
        double valorDepreciciacion = valorDepreciacion(Integer.parseInt(ModeloBox.getSelectedItem().toString()));
        double valorusuario = Double.parseDouble(ValorVehiculoTxt.getText());
        double porcentajemarca = PolizaMarca(MarcaBox.getSelectedItem().toString());
        double porcentajelinea = PolizaLinea(LineaBox.getSelectedItem().toString());
        double porcentajeuso = PolizaUso(UsoVehiculoBox.getSelectedItem().toString());
        boolean a = validacion(valorEstablecido, valorusuario, valorDepreciciacion);
        double PTR = PTR(porcentajemarca, porcentajelinea, porcentajeuso);
        double PT = PT(valorusuario, PTR);
        double Cp = Cp(PT);
        double cd = cd(valorusuario);
        if (a) {
            CostoPrimaTxt.setText(String.valueOf(Cp));
            DeducibleTxt.setText(String.valueOf(cd));
            PCostoPrimaTxt.setText(String.valueOf(Cp));
            PosibleDeducibleTxt.setText(String.valueOf(cd));
        }
    }//GEN-LAST:event_CotizarActionPerformed

    private void menosDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosDeducibleActionPerformed
        menosd();
    }//GEN-LAST:event_menosDeducibleActionPerformed

    private void masDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masDeducibleActionPerformed
        masd();
    }//GEN-LAST:event_masDeducibleActionPerformed

    private void SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarActionPerformed
        Solicitudes solicitud = new Solicitudes(nombreTxt.getText(), apellidoTxt.getText(),
                DPI.getText(), telefonoTxt.getText(), TipoVehiculoBox.getSelectedItem().toString(),
                UsoVehiculoBox.getSelectedItem().toString(), MarcaBox.getSelectedItem().toString(),
                LineaBox.getSelectedItem().toString(), ModeloBox.getSelectedItem().toString(), ValorVehiculoTxt.getText(),
                CostoPrimaTxt.getText(), DeducibleTxt.getText(), PCostoPrimaTxt.getText(), PosibleDeducibleTxt.getText());
        Save(solicitud);
        
        Reset();
        
    }//GEN-LAST:event_SolicitarActionPerformed
    public void Save(Solicitudes obj) {
        for (int i = 0; i < misdatos.length; i++) {
            if (misdatos[i] == null) {
                misdatos[i] = obj;
                break;
            }               
            
        }
    }

    public static void Reordenar() {
        Solicitudes[] aux = new Solicitudes[20];
        int contador = 0;
        for (int i = 0; i < misdatos.length; i++) {
            if (misdatos[i]!=null) {
                aux[contador] = misdatos[i]; 
                contador++;
            }
        }
        misdatos = null;
        misdatos = aux;
    }
    int contador = 0;

    public double valorEstablecido(String tipo) {
        double valorEstablecido;
        for (int i = 0; i < 20; i++) {
            if (InvTipo[i].getNombre().equals(tipo)) {
                valorEstablecido = InvTipo[i].getValorMaximo();
                return valorEstablecido;
            }
        }
        return 0;
    }

    public double valorDepreciacion(int modelo) { //if (InvModelo[i].getAnio().equal(String.valueOf(modelo)))
        double Depreciacion;        
        for (int i = 0; i < 20; i++) {
            if (InvModelo[i].getAnio() == modelo) {
                Depreciacion = (InvModelo[i].getDepreciacion()/100); //modifique para que fuera porcentaje
                return Depreciacion;
            }
        }
        return 0;
    }

    public boolean validacion(double valorE, double valorI, double porcentajeD) {
        double valorReal = valorE - ((porcentajeD / 100) * valorE);
        if (valorI > valorReal) {
            JOptionPane.showMessageDialog(null, "El valor del vehículo no puede ser mayor al valor real.");
            return false;
        }
        return true;
    }

    public double PolizaMarca(String marca) {
        double porMarca;
        for (int i = 0; i < 20; i++) {
            if (InvMarca[i].getNombre().equals(marca)) {
                porMarca = (InvMarca[i].getAumentoPoliza()/100); //modifique para que fuera porcentaje
                return porMarca;
            }
        }
        return 0;
    }

    public double PolizaLinea(String linea) {
        double porLinea;
        for (int i = 0; i < 20; i++) {
            if (InvLinea[i].getNombre().equals(linea)) {
                porLinea = (InvLinea[i].getAumentoPoliza()/100);//modifique para que fuera porcentaje
                return porLinea;
            }
        }
        return 0;
    }

    public double PolizaUso(String uso) {
        double porUso;
        for (int i = 0; i < 20; i++) {
            if (InvUso[i].getNombre().equals(uso)) {
                porUso = (InvLinea[i].getAumentoPoliza()/100);//modifique para que fuera porcentaje
                return porUso;
            }
        }
        return 0;
    }

    public double PTR(double pormarca, double porlinea, double poruso) {
        double PTR = pormarca + porlinea + poruso;
        return PTR;
    }

    public double PT(double valorI, double ptr) {
        double PT = valorI * (0.1 + ptr);
        return PT;
    }

    public double Cp(double pt) {
        Double Cp = (pt / 12);
        return Cp;
    }

    public double cd(double valorI) {
        double cd = 0.07 * valorI;
        return cd;
    }

    public void menosd() {
        double Pcp = Double.parseDouble(CostoPrimaTxt.getText());
        double Pcd = Double.parseDouble(DeducibleTxt.getText());
        double NewPcp;
        double NewPcd;
        NewPcd = Pcd - (Pcd * 0.10);
        NewPcp = Pcp + (Pcp * 0.03);
        PCostoPrimaTxt.setText(String.valueOf(NewPcp));
        PosibleDeducibleTxt.setText(String.valueOf(NewPcd));
    }

    public void masd() {
        double Pcp = Double.parseDouble(CostoPrimaTxt.getText());
        double Pcd = Double.parseDouble(DeducibleTxt.getText());
        double NewPcp;
        double NewPcd;
        NewPcd = Pcd + (Pcd * 0.10);
        NewPcp = Pcp - (Pcp * 0.03);
        PCostoPrimaTxt.setText(String.valueOf(NewPcp));
        PosibleDeducibleTxt.setText(String.valueOf(NewPcd));
    }
    public void Reset(){
        nombreTxt.setText("");
        apellidoTxt.setText("");
        DPI.setText("");
        telefonoTxt.setText("");
        ValorVehiculoTxt.setText("");
        CostoPrimaTxt.setText("");
        DeducibleTxt.setText("");
        PCostoPrimaTxt.setText("");
        PosibleDeducibleTxt.setText("");
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
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SolicitarSeguro dialog = new SolicitarSeguro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField CostoPrimaTxt;
    private javax.swing.JButton Cotizar;
    private javax.swing.JTextField DPI;
    private javax.swing.JTextField DeducibleTxt;
    private javax.swing.JComboBox<String> LineaBox;
    private javax.swing.JComboBox<String> MarcaBox;
    private javax.swing.JComboBox<String> ModeloBox;
    private javax.swing.JTextField PCostoPrimaTxt;
    private javax.swing.JTextField PosibleDeducibleTxt;
    private javax.swing.JButton Solicitar;
    private javax.swing.JComboBox<String> TipoVehiculoBox;
    private javax.swing.JComboBox<String> UsoVehiculoBox;
    private javax.swing.JTextField ValorVehiculoTxt;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton masDeducible;
    private javax.swing.JButton menosDeducible;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
