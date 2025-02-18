
/**
 * Es la clase donde se almacena las caracteristicas del usuario.
 * 
 * @author Daniel Alvarez Morales
 * @version 1.0
 * @since 2025
 * 
 */
public class Usuario {

    private String nombreUsuario;
    private String contrasenia;
    private String dni;
    private int contadoPrestamosActivos;
    private boolean admin;
    public Usuario(String nombreUsuario, String contrasenia, String dni, boolean admin) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.dni = dni;
        this.contadoPrestamosActivos=0;
        this.admin=admin;
    }
    public int getContadoPrestamosActivos() {
        return contadoPrestamosActivos;
    }
    public boolean getAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public void setContadoPrestamosActivos(int contadoPrestamosActivos) {
        this.contadoPrestamosActivos = contadoPrestamosActivos;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public String getDni() {
        return dni;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }



    
    
}
