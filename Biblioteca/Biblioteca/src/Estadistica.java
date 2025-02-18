public class Estadistica {

    private int nPrestamosActivos;
    private int nPrestamosTotales;


    
    public Estadistica(int nPrestamosActivos, int nPrestamosTotales) {
        this.nPrestamosActivos = nPrestamosActivos;
        this.nPrestamosTotales = nPrestamosTotales;
    }



    public int getnPrestamosActivos() {
        return nPrestamosActivos;
    }



    public void setnPrestamosActivos(int nPrestamosActivos) {
        this.nPrestamosActivos = nPrestamosActivos;
    }



    public int getnPrestamosTotales() {
        return nPrestamosTotales;
    }



    public void setnPrestamosTotales(int nPrestamosTotales) {
        this.nPrestamosTotales = nPrestamosTotales;
    }

}
