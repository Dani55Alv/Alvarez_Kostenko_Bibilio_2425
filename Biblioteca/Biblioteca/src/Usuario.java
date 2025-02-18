
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
        this.contadoPrestamosActivos = 0;
        this.admin = admin;
    }

    /**
     * Obtiene el contador de préstamos activos del usuario.
     * 
     * @return El número de préstamos activos.
     */
    public int getContadoPrestamosActivos() {
        return contadoPrestamosActivos;
    }

    /**
     * Establece el contador de préstamos activos del usuario.
     * 
     * @param contadoPrestamosActivos El nuevo número de préstamos activos.
     */
    public void setContadoPrestamosActivos(int contadoPrestamosActivos) {
        this.contadoPrestamosActivos = contadoPrestamosActivos;
    }

    /**
     * Verifica si el usuario tiene permisos de administrador.
     * 
     * @return {@code true} si el usuario es administrador, {@code false} en caso
     *         contrario.
     */
    public boolean getAdmin() {
        return admin;
    }

    /**
     * Establece los permisos de administrador del usuario.
     * 
     * @param admin {@code true} si el usuario debe ser administrador, {@code false}
     *              en caso contrario.
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * Obtiene el nombre de usuario.
     * 
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre de usuario.
     * 
     * @param nombreUsuario El nuevo nombre de usuario.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param contrasenia La nueva contraseña del usuario.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el DNI del usuario.
     * 
     * @return El DNI del usuario.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del usuario.
     * 
     * @param dni El nuevo DNI del usuario.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

}
