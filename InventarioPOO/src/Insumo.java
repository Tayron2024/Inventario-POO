public class Insumo {
    private String nombre;
    private float cantidadDisponible;
    private String unidadMedida;
    private float precioUnitario;
    private float nivelReorden; // Nivel de reorden para el insumo

    // Constructor
    public Insumo(String nombre, float cantidadDisponible, String unidadMedida, float precioUnitario, float nivelReorden) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.unidadMedida = unidadMedida;
        this.precioUnitario = precioUnitario;
        this.nivelReorden = nivelReorden;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public float getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(float cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    // Obtener el nivel de reorden
    public float getNivelReorden() {
        return nivelReorden;
    }

    public void setNivelReorden(float nivelReorden) {
        this.nivelReorden = nivelReorden;
    }
}
