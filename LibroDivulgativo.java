public class LibroDivulgativo extends Libro
{
    private String tipo;
    
    public LibroDivulgativo(String ISBN, String nombre, int cantidadPaginas, double precio, String tipo) {
        super(ISBN, nombre, cantidadPaginas, precio);
        this.tipo = tipo;
    }
    
    public LibroDivulgativo(String ISBN, String nombre, int cantidadPaginas, double precio, String fechaPublicacion, Autor autor, String tipo) {
        super(ISBN, nombre, cantidadPaginas, precio, fechaPublicacion, autor);
        this.tipo = tipo;
    }
    
    public LibroDivulgativo() {
        
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString() {
        return super.toString() + "\n\t[TIPO DE DIVULGACIÓN]: " + this.tipo;
    }
    
    
    public double obtenerPrecioDescuento() {
        String fecha = super.getFechaPublicacion();
        Autor autor = super.getAutor();
        
        double precio = super.getPrecio();
        double descuento = 0;
        
        if ((fecha.compareTo("15/03/2020") <= 0) && (fecha.compareTo("15/12/2022") > 0)) { // Desconozco como funciona A.compareTo(B), puede devolver -1 si A < B, 0 si A = B, 1 si A > B
            descuento += 6.5;
        }

        if (autor.getNacionalidad().equals("Argentino") || autor.getNacionalidad().equals("Argentina")) {
            descuento += 10;
        }
        
        if (descuento != 0) {
            return precio - ((descuento * precio) / 100);
        } else {
            return precio;
        }
    }
}
