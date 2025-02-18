
/**
 * Es la clase donde se almacena las caracteristicas del libro.
 * 
 * @author Daniel Alvarez Morales
 * @version 1.0
 * @since 2025
 * 
 */

public class Libro {

    private String titulo;
    private String autor;
    private String categoria;
    private int isbn;
    private static int contadorIsbn;
    private int contadorLibrosPrestados;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = contadorIsbn;
        contadorIsbn++;
        this.contadorLibrosPrestados = 0;

    }

    /**
     * Obtiene el contador de libros prestados.
     * 
     * @return El número de libros que han sido prestados.
     */
    public int getContadorLibrosPrestados() {
        return contadorLibrosPrestados;
    }

    /**
     * Establece el contador de libros prestados.
     * 
     * @param contadorLibrosPrestados El nuevo valor del contador de libros
     *                                prestados.
     */
    public void setContadorLibrosPrestados(int contadorLibrosPrestados) {
        this.contadorLibrosPrestados = contadorLibrosPrestados;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el ISBN del libro.
     * 
     * @return El número ISBN del libro.
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return El nombre del autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param autor El nuevo nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la categoría del libro.
     * 
     * @return La categoría del libro.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del libro.
     * 
     * @param categoria La nueva categoría del libro.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
