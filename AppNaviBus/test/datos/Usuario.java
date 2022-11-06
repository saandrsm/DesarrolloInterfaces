
package datos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author solet
 */
public class Usuario {
    private String Nombre;            //añado todos los atributos que va a tener un usuario
    private String Apellido;
    private String Provincia;
    private String Genero;
    private Date FechaNac;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //aquí modifico el formato de la fecha para que aparezcan dias-meses-año

    //getters y setters
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellidos(String Apellidos) {
        this.Apellido = Apellidos;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    //constructor
    public Usuario(String Nombre, String Apellidos, String Provincia, String Genero, Date FechaNac) {
        this.Nombre = Nombre;
        this.Apellido = Apellidos;
        this.Provincia = Provincia;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
    }
    
    //método que crea un array de strings para guardar los datos y mostrarlos
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = Nombre;
        s[1] = Apellido;
        s[2] = Provincia;
        s[3] = Genero;
        s[4] = sdf.format(FechaNac);    
        return s;
    }
}
