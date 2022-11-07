
package logica;

import datos.Parada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solet
 */
public class logicaParadas {
    private static List<Parada> listaParadas = new ArrayList<>();

    public static void guardarParada(Parada parada){ //es un método para que el usuario añada paradas
        listaParadas.add(parada);
    }
    

    public static void cargarParada(){           //es un método para cargar en la tabla unas paradas pre-establecidas
        guardarParada(new Parada("Azuqueca", 3678));
        guardarParada(new Parada("Azuqueca", 1652));
        guardarParada(new Parada("Meco", 4008));
        guardarParada(new Parada("Alcalá de Henares", 2545));
        guardarParada(new Parada("Alcalá de Henares", 3089));
    }

    public static List<Parada> getListaParadas() {
        return listaParadas;
    
    }
}