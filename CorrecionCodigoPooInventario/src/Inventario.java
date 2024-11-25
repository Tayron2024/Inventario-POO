import java.util.ArrayList;

public class Inventario {
    private ArrayList<Insumo> insumos;

    public Inventario() {
        this.insumos = new ArrayList<>();
    }

    public void agregarInsumo(Insumo insumo) {
        insumos.add(insumo);
        System.out.println("Insumo agregado: " + insumo.getNombre());
    }

    public void eliminarInsumo(String nombre) {
        insumos.removeIf(insumo -> insumo.getNombre().equals(nombre));
        System.out.println("Insumo eliminado: " + nombre);
    }

    public double obtenerValorTotalInventario() {
        return insumos.stream().mapToDouble(Insumo::calcularValorTotal).sum();
    }

    public void generarAlertas() {
        for (Insumo insumo : insumos) {
            if (insumo.necesitaReorden()) {
                System.out.println("Alerta: El insumo " + insumo.getNombre() + " necesita reorden.");
            }
        }
    }
}
