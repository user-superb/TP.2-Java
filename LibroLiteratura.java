public class LibroLiteratura extends Libro
{
    private String genero;
    private boolean edicionBolsillo;

    public LibroLiteratura(String ISBN, String nombre, int cantidadPaginas, double precio, String genero, boolean edicionBolsillo) {
        super(ISBN, nombre, cantidadPaginas, precio);
        this.genero = genero;
        this.edicionBolsillo = edicionBolsillo;
    }
    
    public LibroLiteratura(String ISBN, String nombre, int cantidadPaginas, double precio, String fechaPublicacion, Autor autor, String genero, boolean edicionBolsillo) {
        super(ISBN, nombre, cantidadPaginas, precio, fechaPublicacion, autor);
        this.genero = genero;
        this.edicionBolsillo = edicionBolsillo;
    }
    
    public LibroLiteratura() {
        this.genero = "";
        this.edicionBolsillo = false;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public boolean getEdicionBolsillo() {
        return this.edicionBolsillo;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setEdicionBolsillo(boolean edicionBolsillo) {
        this.edicionBolsillo = edicionBolsillo;
    }
    
    public String toString() {
        return super.toString() + "\n\t[GENERO]: " + this.genero + "\n\t[EDICIÓN DE BOLSILLO]: " + this.edicionBolsillo;
    }
    
    
    public double obtenerPrecioDescuento() {
        double precio = super.getPrecio();
        double descuento = 0;
        
        if (this.edicionBolsillo) {
            descuento += 15;
        }
        if (this.genero.equals("Novela") || this.genero.equals("Cuento")) {
            descuento += 5;
        }
        
        if (descuento != 0) {
            return (precio - ((descuento * precio) / 100));
        } else {
            return precio;
        }
    }
}
