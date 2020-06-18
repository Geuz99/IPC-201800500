/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Clases.NoCuentas;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GEUZ99
 */
public class TablaNoAsegurados extends AbstractTableModel {

    private String[] nombresColumnas = {"DPI", "NOMBRE", "TELEFONO"};
    NoCuentas[] nocuentas;

    public TablaNoAsegurados(NoCuentas[] nocuentas) {
        this.nocuentas = nocuentas;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return nocuentas.length;
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
        NoCuentas noasegurado = this.nocuentas[rowIndex];
        if (noasegurado != null) {
            switch (columnIndex) {
                case 0:
                    valor = noasegurado.getDpi();
                    break;
                case 1:
                    valor = noasegurado.getNombre();
                    break;
                case 2:
                    valor = noasegurado.getTalefono();
                    break;               
            }
        }
        return valor;

    }

}
