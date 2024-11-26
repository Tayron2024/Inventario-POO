import java.util.List;

public class Producto {
    private String nombre;
    private double precio;
    private List<Insumo> insumos;

    public void crearPlato() {};
    public void actualizarPlato() {};
    public void calcularCostoPlato() {};

    public Producto(String nombre, double precio, List<Insumo> insumos) {
        this.nombre = nombre;
        this.precio = precio;
        this.insumos = insumos;
    }

    public double calcularCosto() {
        double costoTotal = 0;
        for (Insumo insumo : insumos) {
            costoTotal += insumo.getPrecioUnitario();
        }
        return costoTotal;
    }
}
