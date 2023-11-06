public class Autor
{
    private int DNI;
    private String nombreApellido;
    private String nacionalidad;
        
    public Autor(int DNI, String nombreApellido, String nacionalidad) {
        this.DNI = DNI;
        this.nombreApellido = nombreApellido;
        this.nacionalidad = nacionalidad;
    }
    
    public Autor() {
        this.DNI = -1;
        this.nombreApellido = "?";
        this.nacionalidad = "?";
    }
    
    public int getDNI() {
        return this.DNI;
    }
    
    public String getNombreApellido() {
        return this.nombreApellido;
    }
    
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String toString() {
        return "\n\t\t[NOMBRE]: " + this.nombreApellido + "\n\t\t[DNI]: " + this.DNI + "\n\t\t[NACIONALIDAD]: " + this.nacionalidad;
    }
    
}
