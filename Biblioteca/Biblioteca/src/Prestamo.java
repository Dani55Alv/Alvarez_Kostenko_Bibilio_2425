
/**
 * Es la clase donde se almacena las caracteristicas de los prestasmos.
 * Se trata de la union de un libro y un usuario.
 * 
 * @author Daniel Alvarez Morales
 * @version 1.0
 * @since 2025
 * 
 */

public class Prestamo {

    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    /**
     * Obtiene el objeto `Usuario` asociado.
     *
     * @return el objeto `Usuario` asociado.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Obtiene el objeto `Libro` asociado.
     *
     * @return el objeto `Libro` asociado.
     */
    public Libro getLibro() {
        return libro;
    }

}
