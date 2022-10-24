
package gui.tablemodels;

import datos.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author solet
 */
public class UsuariosTableModel extends AbstractTableModel{
    private List<Usuario> listUsuario;
    private String[] columnas ={"Nombre", "Apellidos", "Provincia", "Fecha Nacimiento"};
            
    public UsuariosTableModel(List<Usuario> listUsuario){
        this.listUsuario = listUsuario;
    }   
            
    @Override
    public int getRowCount() {
        return listUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
            case 0:
                return listUsuario.get(rowIndex).getNombre();
            case 1:
                return listUsuario.get(rowIndex).getApellidos();
            case 2:
                return listUsuario.get(rowIndex).getProvincia();
            case 3:
                return listUsuario.get(rowIndex).getFechaNac();
       }
       return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    
}
