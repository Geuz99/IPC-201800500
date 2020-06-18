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
public class TablaMisIncidentes extends AbstractTableModel{
     private String[] nombresColumnas = {"CODIGO", "ROL", "COSTO REAL", 
     "PAGO REQUERIDO", "ESTADO", "PAGO"};
     Incidentes[] incidentes;

    public TablaMisIncidentes(Incidentes[] incidentes) {
        this.incidentes = incidentes;
        this.fireTableDataChanged();  }
     
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
                    valor = incidentes.getRol();
                    break;
                case 2:
                    valor = incidentes.getCostoreal();
                    break;
                case 3:
                    valor = "0";
                    break;
                case 4:
                    valor = "EN PROCESO";
                    break;
                case 5:
                    valor = "PENDIENTE";
                    break;
            }
        }
        return valor;
    
    }
    
}
