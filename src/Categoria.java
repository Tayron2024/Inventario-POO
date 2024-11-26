public class Categoria {
    private String nombre;
    private String descripcion;

    public void registrarCategoria(String nombre, String descripcion) {};
    public void actualizarCategoria(String nombre, String descripcion) {};
    public void consultarCategoria(String nombre, String descripcion) {};

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
