
public class Biblioteca {
    private int numLibros;
    private int numUsuarios;
    private Usuario[] arrayUsuarios;
    private Libro[] arrayLibros;
    private Prestamo[] arrayPrestamos;
    private int numPrestamos;

    /* constructor */
    public Biblioteca(int numLibros, int numUsuarios, Usuario[] arrayUsuarios, Libro[] arrayLibros,
            int numPrestamos, Prestamo[] arrayPrestamos) {
        this.numLibros = numLibros;
        this.numUsuarios = numUsuarios;
        this.arrayUsuarios = arrayUsuarios;
        this.arrayLibros = arrayLibros;
        this.arrayPrestamos = arrayPrestamos;
        this.numPrestamos = numPrestamos;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public int getNumUsuarios() {
        return numUsuarios;
    }

    public void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    public Usuario[] getArrayUsuarios() {
        return arrayUsuarios;
    }

    public void setArrayUsuarios(Usuario[] arrayUsuarios) {
        this.arrayUsuarios = arrayUsuarios;
    }

    public Libro[] getArrayLibros() {
        return arrayLibros;
    }

    public void setArrayLibros(Libro[] arrayLibros) {
        this.arrayLibros = arrayLibros;
    }

    public Prestamo[] getArrayPrestamos() {
        return arrayPrestamos;
    }

    public int getNumPrestamos() {
        return numPrestamos;
    }

    private boolean checkeadorArraysLibros(int isbn) {
        boolean noExiste = true;
        for (int i = 0; i < numLibros && noExiste; i++) {
            if (arrayLibros[i].getIsbn() == (isbn)) {
                noExiste = false;

            }
        }

        return noExiste;

    }

    public void registrarNuevoUsuario(Usuario usuario) {

        if (numUsuarios < this.arrayUsuarios.length) {
            this.arrayUsuarios[numUsuarios] = usuario;
            numUsuarios++;
        } else {
            System.out.println("No caben mas usuarios (Está lleno la biblioteca de usuarios)");
        }

    }

    public void registrarUsuario(String nombreUsuario, String dni, String contrasenia) {
        Usuario usuario = new Usuario(null, null, null);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContrasenia(contrasenia);
        usuario.setDni(dni);

        agregarUsuario(usuario);
    }

    public void mostrarInfUsuarioRegistrado() {
        boolean noExiste = true;
        for (int i = 0; i < getNumUsuarios(); i++) {
            arrayUsuarios[i].getDni();
            noExiste = false;
            System.out.println("El usuario con nombre " + arrayUsuarios[i].getNombreUsuario() + " y el dni "
                    + arrayUsuarios[i].getDni() + " tiene la contraseña " + arrayUsuarios[i].getContrasenia());

        }
        if (noExiste) {
            System.out.println("No existen usuarios para mostrar");
        }
    }

    public void agregarUsuario(Usuario usuario) {

        if (numUsuarios < this.arrayUsuarios.length) {
            this.arrayUsuarios[numUsuarios] = usuario;
            numUsuarios++;
        } else {
            System.out.println("No caben mas usuarios (Está lleno la biblioteca)");
        }

    }

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
            Prestamo prestamos = new Prestamo(usuario, libroDetectado);
            return prestamos;

        }

    }

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

            System.out.println("Devolución realizado con exito");
            boolean encontrado = true;
            for (int i = 0; i < numPrestamos && encontrado; i++) {
                if (arrayPrestamos[i].getLibro().getIsbn() == isbn) {

                    libroDetectado = arrayPrestamos[i].getLibro();

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

            }

        } else {

            System.out.println("ERROR: el libro con isbn " + isbn + " no existe");

        }

    }

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

    public void setArrayPrestamos(Prestamo[] arrayPrestamos) {
        this.arrayPrestamos = arrayPrestamos;
    }

    public void setNumPrestamos(int numPrestamos) {
        this.numPrestamos = numPrestamos;
    }

}
