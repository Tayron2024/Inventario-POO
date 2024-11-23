import java.util.Date;

public class Salida {
    private int id;
    private Insumo insumo;
    private float cantidad;
    private Date fechaRegistro;
    private TipoMovimiento tipoMovimiento; // "Entrada" o "Salida"
    private Proveedor proveedor; // Solo para entradas
    private float costoTotal; // Solo para entradas

    // Constructor para entradas
    public Salida(int id, Insumo insumo, float cantidad, Date fechaRegistro, Proveedor proveedor, float costoTotal) {
        this.id = id;
        this.insumo = insumo;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.tipoMovimiento = TipoMovimiento.ENTRADA;
        this.proveedor = proveedor;
        this.costoTotal = costoTotal;
    }

    // Constructor para salidas
    public Salida(int id, Insumo insumo, float cantidad, Date fechaRegistro) {
        this.id = id;
        this.insumo = insumo;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.tipoMovimiento = TipoMovimiento.SALIDA;
    }

    // Método para registrar el movimiento
    public void registrarMovimiento() {
        if (tipoMovimiento == TipoMovimiento.ENTRADA) {
            insumo.setCantidadDisponible(insumo.getCantidadDisponible() + cantidad);
            System.out.println("Entrada registrada: " + cantidad + " " + insumo.getUnidadMedida() + " de " + insumo.getNombre());
        } else if (tipoMovimiento == TipoMovimiento.SALIDA) {
            if (insumo.getCantidadDisponible() >= cantidad) {
                insumo.setCantidadDisponible(insumo.getCantidadDisponible() - cantidad);
                System.out.println("Salida registrada: " + cantidad + " " + insumo.getUnidadMedida() + " de " + insumo.getNombre());
            } else {
                System.out.println("Error: No hay suficiente cantidad de " + insumo.getNombre() + " en el inventario.");
            }
        }
    }

    // Método para mostrar detalles del movimiento
    public void mostrarDetalles() {
        System.out.println("Movimiento ID: " + id);
        System.out.println("Insumo: " + insumo.getNombre());
        System.out.println("Cantidad: " + cantidad + " " + insumo.getUnidadMedida());
        System.out.println("Fecha: " + fechaRegistro);
        System.out.println("Tipo de Movimiento: " + tipoMovimiento);
        if (tipoMovimiento == TipoMovimiento.ENTRADA) {
            System.out.println("Proveedor: " + proveedor.getNombre());
            System.out.println("Costo Total: " + costoTotal);
        }
    }

    // Enum para el tipo de movimiento
    public enum TipoMovimiento {
        ENTRADA, SALIDA
    }
}
