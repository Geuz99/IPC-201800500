/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Clases.ColaTaller;
import javax.swing.table.AbstractTableModel;    

/**
 *
 * @author GEUZ99
 */
public class TablaColaTaller extends AbstractTableModel{
    private String[] nombresColumnas = {"CODIGO", "ASOCIADO", "TERCERO",
    "ESTADO","PAGO"};
    ColaTaller[] cola;

    public TablaColaTaller(ColaTaller[] cola) {
        this.cola = cola;
        this.fireTableDataChanged();
    }
    

    @Override
    public int getRowCount() {
        return cola.length;
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
        ColaTaller cola = this.cola[rowIndex];
        if (cola != null) {
            switch (columnIndex) {
                case 0:
                    valor = cola.getCodigo();
                    break;
                case 1:
                    valor = cola.getAsociado();
                    break;
                case 2:
                    valor = cola.getTercero();
                    break;
                case 3:
                    valor = "EN PROCESO";
                    break;
                case 4:
                    valor = "PAGADO";
                    break;
            }
        }
        
        return valor;    
    }
    
}
