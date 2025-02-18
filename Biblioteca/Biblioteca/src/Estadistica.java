/**
 * Es la clase donde se almacena las estadisticas de los prestamos.
 * 
 * @author Daniel Alvarez Morales
 * @version 1.0
 * @since 2025
 * 
 */
public class Estadistica {


    private int nPrestamosActivos;
    private int nPrestamosTotales;


    
    public Estadistica(int nPrestamosActivos, int nPrestamosTotales) {
        this.nPrestamosActivos = nPrestamosActivos;
        this.nPrestamosTotales = nPrestamosTotales;
    }



   /**
 * Obtiene el número de préstamos activos del usuario.
 *
 * @return el número de préstamos activos.
 */
public int getnPrestamosActivos() {
    return nPrestamosActivos;
}

/**
 * Establece el número de préstamos activos del usuario.
 *
 * @param nPrestamosActivos el número de préstamos activos a establecer.
 */
public void setnPrestamosActivos(int nPrestamosActivos) {
    this.nPrestamosActivos = nPrestamosActivos;
}

/**
 * Obtiene el número total de préstamos realizados por el usuario.
 *
 * @return el número total de préstamos.
 */
public int getnPrestamosTotales() {
    return nPrestamosTotales;
}

/**
 * Establece el número total de préstamos realizados por el usuario.
 *
 * @param nPrestamosTotales el número total de préstamos a establecer.
 */
public void setnPrestamosTotales(int nPrestamosTotales) {
    this.nPrestamosTotales = nPrestamosTotales;
}

}
