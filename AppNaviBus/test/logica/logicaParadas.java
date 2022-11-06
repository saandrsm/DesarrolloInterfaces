
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

public static void guardarParada(Parada parada){
        listaParadas.add(parada);
    }

    public static List<Parada> getListaParadas() {
        return listaParadas;
    
    }
}