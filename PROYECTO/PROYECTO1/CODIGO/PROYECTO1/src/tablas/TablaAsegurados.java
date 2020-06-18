/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Clases.Cuentas;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GEUZ99
 */
public class TablaAsegurados extends AbstractTableModel{   
    private String[] nombresColumnas = {"DPI", "NOMBRE", "ESTADO", "ULTIMA PRIMA"}; 
    Cuentas[] misasegurados;
    public TablaAsegurados(Cuentas[] misasegurados) {
        this.misasegurados = misasegurados;
        this.fireTableDataChanged();
    }    
    
    @Override
    public int getRowCount() {
        return misasegurados.length;
    }

    @Override
    public int getColumnCount() {
        return nombresColumnas.length;
    }
    public String getColumnName(int columIndex) {
        return this.nombresColumnas[columIndex];
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valor = null;
        Cuentas solicitud = this.misasegurados[rowIndex];
        if (solicitud != null) {
            switch (columnIndex) {
                case 0:
                    valor = solicitud.getDpi();
                    break;
                case 1:
                    valor = solicitud.getNombre();
                    break;
                case 2:
                    valor = "PROTEGIDO";
                    break;
                case 3:
                    valor = "PENDIENTE";                    
                    break;                
            }
        }
        return valor;
    
    }

       
    
}
