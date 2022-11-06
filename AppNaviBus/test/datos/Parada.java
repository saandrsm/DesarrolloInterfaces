/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author solet
 */
public class Parada {
    private String Nombre;
    private int NumParada;

    public int getNumParada() {
        return NumParada;
    }

    public void setNumParada(int NumParada) {
        this.NumParada = NumParada;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Parada(String Nombre, int NumParada){
        this.Nombre = Nombre;
        this.NumParada = NumParada;
    }
    
    //método que crea un array de strings para guardar los datos y mostrarlos
    public String[] toArrayString(){
        String[] s = new String[2];
        s[0] = Nombre;
        s[1] = String.valueOf(NumParada);
        return s;
    }
}
