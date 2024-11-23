import java.util.ArrayList;
import java.util.List;

public class GestionInventarioCompleto {
    private List<Insumo> listaInsumos;
    private List<Categoria> listaCategorias;
    private List<Proveedor> listaProveedores;

    public GestionInventarioCompleto() {
        listaInsumos = new ArrayList<>();
        listaCategorias = new ArrayList<>();
        listaProveedores = new ArrayList<>();
    }

    // Agregar un insumo a la lista
    public void agregarInsumo(Insumo insumo) {
        listaInsumos.add(insumo);
    }

    // Eliminar un insumo de la lista
    public void eliminarInsumo(Insumo insumo) {
        listaInsumos.remove(insumo);
    }

    // Buscar un insumo por nombre
    public Insumo buscarInsumo(String nombre) {
        for (Insumo i : listaInsumos) {
            if (i.getNombre().equals(nombre)) {
                return i;
            }
        }
        return null; // No se encontró el insumo
    }

    // Método para actualizar el inventario
    public void actualizarInventario() {
        // Lógica para actualizar el inventario
        for (Insumo insumo : listaInsumos) {
            // Convertir el valor calculado en double a float antes de usarlo
            insumo.setCantidadDisponible((float) Math.round(insumo.getCantidadDisponible()));
        }
    }

    // Obtener el valor total del inventario (precio total de los insumos)
    public double obtenerValorTotalInventario() {
        double valorTotal = 0;
        for (Insumo i : listaInsumos) {
            valorTotal += i.getPrecioUnitario() * i.getCantidadDisponible();
        }
        return valorTotal;
    }

    // Generar alertas cuando la cantidad de un insumo está por debajo del nivel de reorden
    public void generarAlertas() {
        for (Insumo insumo : listaInsumos) {
            if (insumo.getCantidadDisponible() <= insumo.getNivelReorden()) {
                System.out.println("Alerta: El insumo " + insumo.getNombre() + " está por debajo del nivel de reorden.");
            }
        }
    }

    // Registrar un movimiento de entrada o salida
    public void registrarMovimiento(Salida salida) {
        salida.registrarMovimiento();
    }

    // Otros métodos para manejar entradas y salidas, etc.
}
