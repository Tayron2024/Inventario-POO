public class Categoria {
    private String nombre;
    private String descripcion;

    // Constructor con dos parámetros
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Método para registrar categoría
    public void registrarCategoria() {
        System.out.println("Categoría registrada: " + nombre + " - " + descripcion);
    }
}
