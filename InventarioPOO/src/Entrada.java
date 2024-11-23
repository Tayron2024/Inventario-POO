import java.util.Date;

public class Entrada {
    private int id;
    private Insumo insumo; // Asegúrate de que la clase Insumo esté definida
    private int cantidad;
    private Date fechaRegistro;
    private Proveedor proveedor; // Asegúrate de que la clase Proveedor esté definida
    private double costoTotal;

    public Entrada(int id, Insumo insumo, int cantidad, Date fechaRegistro, Proveedor proveedor) {
        this.id = id;
        this.insumo = insumo;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.proveedor = proveedor;
        this.costoTotal = calcularCostoTotal();
    }

    private double calcularCostoTotal() {
        return insumo.getPrecioUnitario() * cantidad; // Asegúrate de que getPrecioUnitario esté definido en Insumo
    }

    public void registrarEntrada() {
        // Lógica para registrar la entrada
    }

    public String obtenerHistorial() {
        // Lógica para obtener el historial de entradas
        return "Historial de entrada para: " + insumo.getNombre(); // Asegúrate de que getNombre esté definido en Insumo
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", insumo=" + insumo +
                ", cantidad=" + cantidad +
                ", fechaRegistro=" + fechaRegistro +
                ", proveedor=" + proveedor +
                ", costoTotal=" + costoTotal +
                '}';
    }
}
