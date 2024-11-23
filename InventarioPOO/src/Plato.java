public class Plato {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible; // Indica si el plato está disponible

    // Constructor
    public Plato(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = true; // Inicialmente, el plato está disponible
    }

    // Getters y Setters



    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar la información del plato
    public String mostrarPlato() {
        return "ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: $" + precio + ", Disponible: " + disponible;
    }
}



