public class Programa
{
    private static Autor crearAutor(int DNI, String nombreApellido, String nacionalidad) {
        Autor autor = new Autor(DNI, nombreApellido, nacionalidad);
        return autor;
    }
    
    public static void main() {
        
        LibroLiteratura cuento = new LibroLiteratura("001", "CUENTO_A", 50, 1000, "12/02/2021", crearAutor(43434343, "Robert", "Argentino"), "Cuento", false);
        LibroLiteratura novela = new LibroLiteratura("002", "NOVELA_A", 1000, 20, "15/5/2015", crearAutor(30303030, "Laura", "Española") , "Novela", true);
        LibroLiteratura poemario = new LibroLiteratura("003", "POEMARIO_A", 50, 100, "Poema", false);
        LibroDivulgativo divulgacion = new LibroDivulgativo("004", "DIVULGACION_A", 10000, 100, "13/05/2021", crearAutor(20202020, "Esteban", "Argentino"), "Divulgacion cientifica");
        LibroDivulgativo biografia = new LibroDivulgativo("005", "DIVULGACION_B", 0, 50, "Biografia");
        
        Libro[] libros = {cuento, novela, poemario, divulgacion, biografia};
        
        Editorial editorial = new Editorial("Tutucas", 3, libros);
        System.out.printf("%s\n\n[FIN DEL PROGRAMA]", editorial.toString());
    }
}
