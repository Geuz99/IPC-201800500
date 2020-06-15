/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Clases.Solicitudes;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GEUZ99
 */
public class TablaSolicitud extends AbstractTableModel {

    private String[] nombresColumnas = {"DPI", "NOMBRE", "TELEFONO", "TIPO", "DESCRIPCION", "MONTO",
        "POLIZA", "DEDUCIBLE"};
    Solicitudes[] misolicitud;

    public TablaSolicitud(Solicitudes[] misolicitud) {
        this.misolicitud = misolicitud;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return misolicitud.length;
    }

    @Override
    public int getColumnCount() {
        return nombresColumnas.length;
    }

    @Override
    public String getColumnName(int columIndex) {
        return this.nombresColumnas[columIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valor = null;        
        Solicitudes solicitud = this.misolicitud[rowIndex];
        if (solicitud != null) {
            switch (columnIndex) {
                case 0:
                    valor = solicitud.getDpi();
                    break;
                case 1:
                    valor = solicitud.getNombre();
                    break;
                case 2:
                    valor = solicitud.getTalefono();
                    break;
                case 3:
                    valor = "AUTOMAS";
                    
                    break;
                case 4:
                    valor = solicitud.getTipovehiculo() + "," + solicitud.getModelo() +
                            "," + solicitud.getMarca() + "," + solicitud.getLinea() +
                            "," + solicitud.getUsovehiculo();
                    
                    break;
                case 5:
                    valor = solicitud.getValorvehiculo();
                    break;
                case 6:
                    valor = solicitud.getPCostoPrima();
                    break;
                case 7:
                    valor = solicitud.getPDeducible();
                    break;
            }
        }
        return valor;
    }

}
