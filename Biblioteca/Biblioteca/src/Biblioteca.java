
    public class Biblioteca {
        private int numLibros;
        private int numUsuarios;
        private Usuario[] arrayUsuarios;
        private Libro[] arrayLibros;
        private Libro[] arraylibrosPrestados;
        private int nLibrosPrestados;
        
        /* constructor */
        public Biblioteca(int numLibros, int numUsuarios, Usuario[] arrayUsuarios, Libro[] arrayLibros, 
                int nLibrosPrestados, Libro[] arraylibrosPrestados) {
            this.numLibros = numLibros;
            this.numUsuarios = numUsuarios;
            this.arrayUsuarios = arrayUsuarios;
            this.arrayLibros = arrayLibros;
             this.arraylibrosPrestados=arraylibrosPrestados;
            this.nLibrosPrestados= nLibrosPrestados;
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

        // cambio
        // gfrhggjhjh
        // hffhhfue
        // fhje
        // ffhhgj
    }

