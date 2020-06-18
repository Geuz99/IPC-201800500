/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Clases.Incidentes;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GEUZ99
 */
public class TablaIncidente extends AbstractTableModel {

    private String[] nombresColumnas = {"CODIGO", "NOMBRE", "PRECIO"};
    Incidentes[] incidentes;

    public TablaIncidente(Incidentes[] incidentes) {
        this.incidentes = incidentes;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return incidentes.length;
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
        Incidentes incidentes = this.incidentes[rowIndex];
        if (incidentes != null) {
            switch (columnIndex) {
                case 0:
                    valor = incidentes.getCodigo();
                    break;
                case 1:
                    valor = incidentes.getRepuesto();
                    break;
                case 2:
                    valor = incidentes.getCostoreal();
                    break;
            }
        }
        return valor;

    }
}
