import java.util.Date;

public class Insumo {
    private String nombre;
    private int cantidadDisponible;
    private String unidadMedida;
    private int nivelReorden;
    private Date fechaVencimiento;
    private double precioUnitario;
    private String ubicacion;

    public Insumo(String nombre, int cantidadDisponible, String unidadMedida, int nivelReorden, Date fechaVencimiento, double precioUnitario, String ubicacion) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.unidadMedida = unidadMedida;
        this.nivelReorden = nivelReorden;
        this.fechaVencimiento = fechaVencimiento;
        this.precioUnitario = precioUnitario;
        this.ubicacion = ubicacion;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public int getNivelReorden() {
        return nivelReorden;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Métodos adicionales
    public double calcularValorTotal() {
        return cantidadDisponible * precioUnitario;
    }

    public boolean necesitaReorden() {
        return cantidadDisponible <= nivelReorden;
    }
}
