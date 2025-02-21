
/**
 * Es la clase donde se almacena las caracteristicas de la biblioteca propia es
 * decir, Prestamos propios, libros propios , usuarios propios y demás.
 * 
 * @author Elena Kostenko
 * @version 1.0
 * @since 2025
 * 
 */

public class Biblioteca {
    private int numLibros;
    private int numUsuarios;
    private Usuario[] arrayUsuarios;
    private Libro[] arrayLibros;
    private Prestamo[] arrayPrestamos;
    private int numPrestamos;
    private Estadistica estadisticas;

    public Biblioteca(int numLibros, int numUsuarios, Usuario[] arrayUsuarios, Libro[] arrayLibros,
            int numPrestamos, Prestamo[] arrayPrestamos, Estadistica estadisticas) {
        this.numLibros = numLibros;
        this.numUsuarios = numUsuarios;
        this.arrayUsuarios = arrayUsuarios;
        this.arrayLibros = arrayLibros;
        this.arrayPrestamos = arrayPrestamos;
        this.numPrestamos = numPrestamos;
        this.estadisticas = estadisticas;
    }

    /**
     * Obtiene el número total de libros.
     * 
     * @return El número de libros.
     */
    public int getNumLibros() {
        return numLibros;
    }

    /**
     * Establece el número total de libros.
     * 
     * @param numLibros El nuevo número de libros.
     */
    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    /**
     * Obtiene el número total de usuarios.
     * 
     * @return El número de usuarios.
     */
    public int getNumUsuarios() {
        return numUsuarios;
    }

    /**
     * Establece el número total de usuarios.
     * 
     * @param numUsuarios El nuevo número de usuarios.
     */
    public void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    /**
     * Obtiene el arreglo de usuarios registrados.
     * 
     * @return Un array de objetos {@code Usuario}.
     */
    public Usuario[] getArrayUsuarios() {
        return arrayUsuarios;
    }

    /**
     * Establece el arreglo de usuarios registrados.
     * 
     * @param arrayUsuarios Un array de objetos {@code Usuario}.
     */
    public void setArrayUsuarios(Usuario[] arrayUsuarios) {
        this.arrayUsuarios = arrayUsuarios;
    }

    /**
     * Obtiene el arreglo de libros disponibles.
     * 
     * @return Un array de objetos {@code Libro}.
     */
    public Libro[] getArrayLibros() {
        return arrayLibros;
    }

    /**
     * Establece el arreglo de libros disponibles.
     * 
     * @param arrayLibros Un array de objetos {@code Libro}.
     */
    public void setArrayLibros(Libro[] arrayLibros) {
        this.arrayLibros = arrayLibros;
    }

    /**
     * Obtiene el arreglo de préstamos registrados.
     * 
     * @return Un array de objetos {@code Prestamo}.
     */
    public Prestamo[] getArrayPrestamos() {
        return arrayPrestamos;
    }

    /**
     * Obtiene el número total de préstamos realizados.
     * 
     * @return El número de préstamos.
     */
    public int getNumPrestamos() {
        return numPrestamos;
    }

    /**
     * Es una funcion que Chekea un array para dectetar si el libro existe.
     * 
     * @param isbn (int), el isbn del libro.
     * @return El boleano que confirma la exitencia del libro con tal isbn.
     */
    private boolean checkeadorArraysLibros(int isbn) {
        boolean noExiste = true;
        for (int i = 0; i < numLibros && noExiste; i++) {
            if (arrayLibros[i].getIsbn() == (isbn)) {
                noExiste = false;

            }
        }

        return noExiste;

    }

    /**
     * Es un metodo para registrar nuevos usuarios .
     * 
     * @param nombreUsuario (String), el nombre del usuario a registrar .
     * @param dni           (String), el dni del usuario a registrar .
     * @param contrasenia   (String), la contrasenia del usuario a registrar .
     * @param admin         (boolean), el estado de persmisos admin del usuario a
     *                      registrar .
     */
    public void registrarUsuario(String nombreUsuario, String dni, String contrasenia, boolean admin) {
        Usuario usuario = new Usuario(null, null, null, false);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContrasenia(contrasenia);
        usuario.setDni(dni);
        usuario.setAdmin(admin);
        agregarUsuario(usuario);

    }

    /**
     * Es un metodo para ver la informacion de los usuarios .
     * 
     */
    public void mostrarInfUsuarioRegistrado() {
        boolean noExiste = true;
        for (int i = 0; i < getNumUsuarios(); i++) {
            arrayUsuarios[i].getDni();
            noExiste = false;
            System.out.print("El usuario con nombre " + arrayUsuarios[i].getNombreUsuario() + " y el dni "
                    + arrayUsuarios[i].getDni() + " tiene la contraseña " + arrayUsuarios[i].getContrasenia());

            if (arrayUsuarios[i].getAdmin() == true) {
                System.out.println(" (Es admin) ");
            } else {
                System.out.println(" (NO es admin) ");
            }
            System.out.println();

        }
        if (noExiste) {
            System.out.println("No existen usuarios para mostrar");
        }
    }

    /**
     * Es un metodo para agregar usuarios a la biblioteca .
     * 
     * @param usuario (Usuario), El usuario ha agregar.
     */
    public void agregarUsuario(Usuario usuario) {

        if (numUsuarios < this.arrayUsuarios.length) {
            this.arrayUsuarios[numUsuarios] = usuario;
            numUsuarios++;
        } else {
            System.out.println("No caben mas usuarios (Está lleno la biblioteca)");
        }

    }

    /**
     * Es un metodo para agregar libros nuevos a la biblioteca .
     * 
     * @param titulo    (String), El titulo del libro.
     * @param autor     (String), El autor del libro.
     * @param categoria (String), La categoria del libro.
     */
    public void AgregarLibroNuevo(String titulo, String autor, String categoria) {
        Libro libro = new Libro(titulo, autor, categoria);
        libro.setAutor(autor);
        libro.setCategoria(categoria);
        libro.setTitulo(titulo);
        if (numLibros < this.arrayLibros.length) {
            this.arrayLibros[numLibros] = libro;
            numLibros++;
        } else {
            System.out.println("No caben mas libros (Está lleno la biblioteca de libros)");
        }

    }

    /**
     * Es un metodo para mostrar libros disponibles en la biblioteca.
     *
     */
    public void mostrarLibrosDisponibles() {
        boolean noExiste = true;
        for (int i = 0; i < getNumLibros(); i++) {
            arrayLibros[i].getIsbn();
            noExiste = false;
            System.out.println("El libro con título " + arrayLibros[i].getTitulo() + " y el autor "
                    + arrayLibros[i].getAutor() + " tiene la categoría " + arrayLibros[i].getCategoria() + " y isbn "
                    + arrayLibros[i].getIsbn());

        }
        if (noExiste) {
            System.out.println("No existen libros para mostrar");
        }
    }

    /**
     * Es un metodo para bucar libros por isbn en la biblioteca.
     * 
     * @param isbn_introducido (int), el isbn del libro a busar.
     */
    public void buscarlibro(int isbn_introducido) {
        boolean noExiste = checkeadorArraysLibros(isbn_introducido);

        if (noExiste) {
            System.out.println("No existe el libro con el isbn " + isbn_introducido);
        } else {
            for (int i = 0; i < getNumLibros(); i++) {
                if (arrayLibros[i].getIsbn() == isbn_introducido) {
                    System.out.println("El libro con isbn " + arrayLibros[i].getIsbn() + " , el título "
                            + arrayLibros[i].getTitulo() + ", la categoría " + arrayLibros[i].getCategoria()
                            + " y el autor " + arrayLibros[i].getAutor() + " encontrado");

                }
            }
        }
    }

    /**
     * Es un metodo para eliminar libros por isbn en la biblioteca.
     * 
     * @param isbn (int), el isbn del libro a eliminar.
     */
    public void eliminarLibro(int isbn) {
        boolean noExiste = checkeadorArraysLibros(isbn);
        if (noExiste == true) {
            System.out.println("Error, no existe el libro a eliminar");
        } else {
            System.out.println("Eliminación realizada con éxito");
            if (getNumLibros() >= 1) {
                boolean encontrado = true;
                for (int i = 0; i < getNumLibros() && encontrado; i++) {
                    if (arrayLibros[i].getIsbn() == isbn) {
                        encontrado = false;
                        arrayLibros[i] = null;

                        for (int j = i; j < numLibros - 1; j++) {
                            arrayLibros[j] = arrayLibros[j + 1];
                        }

                        setNumLibros(getNumLibros() - 1);
                    }

                }

            } else {
                System.out.println("No se puede eliminar, no hay ningún libro en la biblioteca");

            }
        }

    }

    /**
     * Es una funcion que crear prestamos usuario x libro y lo devuevlve a un array
     * de prestamos,
     * si es null porque es una operacion imposible de realizar no se llegar a meter
     * null en el array.
     * 
     * @param isbn    (int), el isbn del libro a tomar prestado.
     * @param usuario (Usuario), el usuario que en ese momento tiene iniciado
     *                sesion.
     * @return devuelve el prestamo que representa el usuario por el libro.
     */
    public Prestamo tomarLibroPrestado(Usuario usuario, int isbn) {

        System.out.println(
                "La biblioteca procede a prestar el libro con isbn " + isbn + " al usuario "
                        + usuario.getNombreUsuario());

        boolean noExiste = checkeadorArraysLibros(isbn);

        if (noExiste == true) {
            System.out.println("ERROR: El libro con isbn: " + isbn + " no existe");
            return null;

        } else {
            System.out.println("Prestamo realizado con exito");

            estadisticas.setnPrestamosTotales(estadisticas.getnPrestamosTotales() + 1);
            estadisticas.setnPrestamosActivos(estadisticas.getnPrestamosActivos() + 1);

            usuario.setContadoPrestamosActivos(usuario.getContadoPrestamosActivos() + 1);

            Libro libroDetectado = null;

            boolean encontrado = true;

            for (int i = 0; i < getNumLibros() && encontrado; i++) {
                if (arrayLibros[i].getIsbn() == (isbn)) {
                    libroDetectado = arrayLibros[i];
                    encontrado = false;
                    arrayLibros[i] = null;

                    for (int j = i; j < numLibros - 1; j++) {
                        arrayLibros[j] = arrayLibros[j + 1];
                    }

                    setNumLibros(getNumLibros() - 1);
                }
            }

            libroDetectado.getContadorLibrosPrestados();
            libroDetectado.setContadorLibrosPrestados(libroDetectado.getContadorLibrosPrestados() + 1);
            Prestamo prestamos = new Prestamo(usuario, libroDetectado);
            return prestamos;

        }

    }

    /**
     * Es un metodo que devuelve libros prestados por isbn.
     * 
     * @param isbn    (int), el isbn del libro a tomar prestado.
     * @param usuario (Usuario), el usuario que en ese momento tiene iniciado
     *                sesion.
     * 
     */
    public void devolverLibroTomado(Usuario usuario, int isbn) {
        Libro libroDetectado = null;

        System.out.println(
                "El usuario " + usuario.getNombreUsuario() + " procede a devolver el libro con isbn " + isbn
                        + " a la biblioteca ");

        boolean noExiste = true;

        for (int i = 0; i < this.numPrestamos; i++) {
            if (this.arrayPrestamos[i].getLibro().getIsbn() == isbn) {
                noExiste = false;

            }

            if (!arrayPrestamos[i].getUsuario().getNombreUsuario().equals(usuario.getNombreUsuario())) {
                noExiste = true;

            }

        }

        if (!noExiste) {

            Prestamo cancelacionDevolucion = null;

            System.out.println("Devolución realizado con exito");
            estadisticas.setnPrestamosActivos(estadisticas.getnPrestamosActivos() - 1);
            usuario.setContadoPrestamosActivos(usuario.getContadoPrestamosActivos() - 1);

            boolean encontrado = true;
            for (int i = 0; i < numPrestamos && encontrado; i++) {
                if (arrayPrestamos[i].getLibro().getIsbn() == isbn) {

                    libroDetectado = arrayPrestamos[i].getLibro();
                    cancelacionDevolucion = arrayPrestamos[i];

                    encontrado = false;

                    arrayPrestamos[i] = arrayPrestamos[numPrestamos - 1];

                    arrayPrestamos[numPrestamos - 1] = null;

                    setNumPrestamos(getNumPrestamos() - 1);
                }
            }

            if (this.numLibros < this.arrayLibros.length) {
                this.arrayLibros[numLibros] = libroDetectado;
                this.numLibros++;

            } else {
                System.out.println("No caben mas libros (Está lleno la biblioteca de libros)");
                System.out.println("Cancelamiento de la transacción de libro");
                this.arrayPrestamos[numPrestamos] = cancelacionDevolucion;

                setNumPrestamos(getNumPrestamos() + 1);

            }

        } else {

            System.out.println("ERROR: el libro con isbn " + isbn + " no existe");

        }

    }

    /**
     * Es un metodo que muestra los libros prestados y los usuarios que lo tienen
     * tomado actualmente.
     * 
     */
    public void mostrarLibrosActualmentePrestados() {
        boolean noExiste = true;
        for (int i = 0; i < numPrestamos; i++) {
            noExiste = false;
            System.out.println("El libro prestado " + arrayPrestamos[i].getLibro().getTitulo()
                    + " esta tomado por el usuario " + arrayPrestamos[i].getUsuario().getNombreUsuario() + " con isbn: "
                    + arrayPrestamos[i]
                            .getLibro().getIsbn());
        }

        if (noExiste) {
            System.out.println("No hay prestamos que mostrar es decir, no hay prestamos activos");
        }
    }

    /**
     * Establece el arreglo de préstamos asociados al usuario.
     *
     * @param arrayPrestamos el arreglo de objetos `Prestamo` a establecer.
     */
    public void setArrayPrestamos(Prestamo[] arrayPrestamos) {
        this.arrayPrestamos = arrayPrestamos;
    }

    /**
     * Establece el número de préstamos realizados por el usuario.
     *
     * @param numPrestamos el número de préstamos a establecer.
     */

    public void setNumPrestamos(int numPrestamos) {
        this.numPrestamos = numPrestamos;
    }

    /**
     * Es un metodo que muestra las estadisticas de prestamos activos y totales.
     * 
     */
    public void mostrarNPTyA() {

        System.out.println("Número de  préstamos activos: " + estadisticas.getnPrestamosActivos());
        System.out.println("Número de préstamos totales: " + estadisticas.getnPrestamosTotales());

    }

    /**
     * Es un metodo que muestra el usuario con mas libros. Si hay empate es
     * indiferente.
     * 
     */
    public void mostrarUsuarioMasPrestamoActivo() {
        int usuarioMax = 0;
        usuarioMax = arrayUsuarios[0].getContadoPrestamosActivos();
        String nombreUsuario = arrayUsuarios[0].getNombreUsuario();
        for (int i = 0; i < numUsuarios; i++) {

            if (usuarioMax < arrayUsuarios[i].getContadoPrestamosActivos()) {
                usuarioMax = arrayUsuarios[i].getContadoPrestamosActivos();
                nombreUsuario = arrayUsuarios[i].getNombreUsuario();
            }

        }

        System.out.println("El usuario con mas prestamos activos es " + nombreUsuario
                + " con un numero de prestamos activos de " + usuarioMax);
    }

    /**
     * Es un metodo que muestra una lista de los libros prestados y su numero de
     * prestamos.
     * 
     */
    public void listarLibrosPrestados() {

        System.out.println("Libros listados");
        boolean noExiste = true;

        for (int i = 0; i < numLibros; i++) {
            noExiste = false;
        }

        if (noExiste) {
            System.out.println("Listando libros mas prestados");
        } else {

            for (int i = 0; i < numLibros; i++) {
                System.out.println(
                        arrayLibros[i].getTitulo() + " Nº Prestamos: " + arrayLibros[i].getContadorLibrosPrestados());
            }

            for (int i = 0; i < numPrestamos; i++) {
                System.out.println(
                        arrayPrestamos[i].getLibro().getTitulo() + " Nº Prestamos: "
                                + arrayPrestamos[i].getLibro().getContadorLibrosPrestados());
            }

        }

    }
}
