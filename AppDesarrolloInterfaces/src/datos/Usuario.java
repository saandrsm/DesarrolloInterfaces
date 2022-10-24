
package datos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author solet
 */
public class Usuario {
    private String Nombre;
    private String Apellidos;
    private String Provincia;
    private Date FechaNac;
    private SimpleDateFormat sdf = new SimpleDateFormat("ss-MM-yyyy");

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
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

    public Usuario(String Nombre, String Apellidos, String Provincia, Date FechaNac) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Provincia = Provincia;
        this.FechaNac = FechaNac;
    }
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = Nombre;
        s[1] = Apellidos;
        s[2] = Provincia;
        s[3] = sdf.format(FechaNac);    
        return s;
    }
}
