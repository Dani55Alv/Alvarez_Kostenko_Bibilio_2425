public class App {


    public static void login() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|         Bienvenidos a la biblioteca.          |");
        System.out.println("|                ¡Inicia sesion!                |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                   Log-in                      |");
        System.out.println("|                                               |");
        System.out.println("|           ¿Usuario  o Administrador?          |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------------");

    }

    public static void menu() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|         Bienvenidos a la biblioteca           |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                                               |");
        System.out.println("|         1.-Gestión de libros                  |");
        System.out.println("|         2.-Gestión de usuarios                |");
        System.out.println("|         3.-Gestión de prestamos               |");
        System.out.println("|         4.-Estadísticas                       |");
        System.out.println("|         5.-Salir                              |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------------");

    }

    public static void submenu1() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|       Bienvenidos a la gestión de libros      |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                                               |");
        System.out.println("|    1.-Agregar libros nuevos (admin)           |");
        System.out.println("|    2.-Eliminar libros existentes (admin)      |");
        System.out.println("|    3.-Buscar libros                           |");
        System.out.println("|    4.-Todos los libros disponibles            |");
        System.out.println("-------------------------------------------------");

    }

    public static void submenu2() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|       Bienvenidos a la gestión de usuarios    |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                                               |");
        System.out.println("|     1.-Registrar nuevos usuarios (admin)      |");
        System.out.println("|     2.-Consultar informacion usuarios (admin) |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------------");

    }

    public static void submenu3() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|      Bienvenidos a la gestión de préstamos    |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                                               |");
        System.out.println("|      1.-Realizar préstamos de libros          |");
        System.out.println("|      2.-Devolver libros prestados             |");
        System.out.println("|      3.-Libros actualmente prestados (admin)  |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------------");

    }

    public static void submenu4() {

        System.out.println(" _______________________________________________");
        System.out.println("|                                               |");
        System.out.println("|      Bienvenidos a las estadísticas           |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");

        System.out.println("-------------------------------------------------");
        System.out.println("|                                               |");
        System.out.println("|    1.-Numeros de préstamos totales y activos  |");
        System.out.println("|    2.-Libros más prestados                    |");
        System.out.println("|    3.-Usuario con más préstamos activos       |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------------");

    }

    public static void main(String[] args) {



        // Creacion de objetos

        // Arrays con limite 15
        Libro[] arrayLibros = new Libro[15];
        Libro[] arrayLibrosPrestados = new Libro[15];
        Libro[] arrayLibrosTomados = new Libro[15];

        // Usuarios
        Usuario[] arrayUsuarios = new Usuario[15];
        Usuario daniel = new Usuario("dani55", "1234", "13");
        Usuario elena = new Usuario("elena55", "1111", "13");

        Biblioteca biblioteca = new Biblioteca(0, 0, arrayUsuarios, arrayLibros, 0, arrayLibrosPrestados);

        // Libro
        Libro don_Quijote = new Libro("Don_Quijote", "Miguel de Cervantes", "Comedia", "12");
        Libro el_Conde_Monte_Cristo = new Libro("El Conde de Montecristo", "Alexandre Dumas", "Aventura", "13");
        Libro crimen_y_Castigo = new Libro("Crimen y Castigo", "Fiódor Dostoievski", "Drama psicológico", "14");
        Libro mil_novecientos_ochenta_y_cuatro = new Libro("1984", "George Orwell", "Ciencia ficción distópica", "15");





      


    }
}
