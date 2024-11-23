import java.util.ArrayList;
import java.util.List;

public class GestionInventarioImpl implements GestionInventario {
    private List<Insumo> listaInsumos;
    private List<Salida> historialMovimientos;

    public GestionInventarioImpl() {
        listaInsumos = new ArrayList<>();
        historialMovimientos = new ArrayList<>();
    }

    @Override
    public void agregarInsumo(Insumo insumo) {
        listaInsumos.add(insumo);
    }

    @Override
    public void eliminarInsumo(Insumo insumo) {
        listaInsumos.remove(insumo);
    }

    @Override
    public Insumo buscarInsumo(String nombre) {
        for (Insumo insumo : listaInsumos) {
            if (insumo.getNombre().equals(nombre)) {
                return insumo;
            }
        }
        return null;
    }

    @Override
    public void actualizarInventario() {
        // Este método puede tener la lógica para actualizar el inventario (por ejemplo, recalcular valores).
        System.out.println("Inventario actualizado.");
    }

    @Override
    public double obtenerValorTotalInventario() {
        double valorTotal = 0;
        for (Insumo insumo : listaInsumos) {
            valorTotal += insumo.getPrecioUnitario() * insumo.getCantidadDisponible();
        }
        return valorTotal;
    }

    @Override
    public void generarAlertas() {
        for (Insumo insumo : listaInsumos) {
            if (insumo.getCantidadDisponible() <= insumo.getNivelReorden()) {
                System.out.println("ALERTA: El insumo " + insumo.getNombre() + " está por debajo del nivel de reorden.");
            }
        }
    }

    @Override
    public void registrarMovimiento(Salida movimiento) {
        historialMovimientos.add(movimiento);
        movimiento.registrarMovimiento();  // Llamar al método para actualizar la cantidad de insumos
    }
}
