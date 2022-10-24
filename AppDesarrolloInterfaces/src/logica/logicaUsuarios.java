
package logica;

import datos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solet
 */
public class logicaUsuarios {
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    
    public static void aniadirUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    
}
