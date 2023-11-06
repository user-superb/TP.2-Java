public class Editorial
{
    private String nombre;
    private int cantidadPremios;
    private Libro[] librosMasVendidos = new Libro[5];
    
    public Editorial(String nombre, int cantidadPremios) {
        this.nombre = nombre;
        this.cantidadPremios = cantidadPremios;
    }
    
    public Editorial(String nombre, int cantidadPremios, Libro[] librosMasVendidos) {
        this.nombre = nombre;
        this.cantidadPremios = cantidadPremios;
        this.librosMasVendidos = librosMasVendidos;
    }
    
    public Editorial() {
        
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getCantidadPremios() {
        return this.cantidadPremios;
    }
    
    public Libro[] getLibrosMasVendidos() {
        return this.librosMasVendidos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidadPremios(int cantidadPremios) {
        this.cantidadPremios = cantidadPremios;
    }
    
    
    public double calcularPrecio() {
        double sumaMonto = 0;
        
        for (int i = 0; i < 5; i++) {
            sumaMonto+= librosMasVendidos[i].obtenerPrecioDescuento();
        }
        
        return sumaMonto;
    }
    
    public String toString() {
        String texto_a_retornar;
        
        texto_a_retornar = "[NOMBRE EDITORIAL]: " + this.nombre + "\n[CANTIDAD DE PREMIOS] : " + this.cantidadPremios + "\n[Libros]\n";
        
        for (int i = 0; i < 5; i++) {
            texto_a_retornar += librosMasVendidos[i].toString();
            texto_a_retornar += "\n----------------------------------\n";
        }
        
        texto_a_retornar += "[SUMA DE TODOS LOS MONTOS]: " + calcularPrecio();
        
        return texto_a_retornar;
    }
    
}
