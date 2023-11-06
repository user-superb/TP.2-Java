public abstract class Libro {
    private String ISBN;
    private String nombre;
    private int cantidadPaginas;
    private double precio;
    private String fechaPublicacion;
    private Autor autor;
    
    public Libro(String ISBN, String nombre, int cantidadPaginas, double precio) {
        this.fechaPublicacion = "00/00/0000";
        this.autor = new Autor();
        
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
        this.precio = precio;
    }
    
    public Libro(String ISBN, String nombre, int cantidadPaginas, double precio, String fechaPublicacion, Autor autor) {
        this(ISBN, nombre, cantidadPaginas, precio);
        
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }
    
    public Libro() {
        this.fechaPublicacion = "00/00/0000";
        this.autor = new Autor();
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getCantidadPaginas() {
        return this.cantidadPaginas;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }
    
    public Autor getAutor() {
        return this.autor;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String toString() {
        String texto_a_retornar;
        
        texto_a_retornar = "\t[TITULO]: " + this.nombre + "\n\t[ISBN]: " + this.ISBN + "\n\t[CANTIDAD DE PAGINAS]: " + this.cantidadPaginas + "\n\t[PRECIO]: " + this.precio + "\n\t[PRECIO CON DESCUENTO]: " + this.obtenerPrecioDescuento() + "\n\t[FECHA DE PUBLICACIÓN]: " + this.fechaPublicacion + "\n\t[AUTOR]: " + this.autor.toString();
    
        return texto_a_retornar;
    }
    
    
    public abstract double obtenerPrecioDescuento();
    
}