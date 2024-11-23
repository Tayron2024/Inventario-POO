import java.util.ArrayList;
import java.util.List;

public class Bodega {
    private List<Insumo> insumos;

    public Bodega() {
        this.insumos = new ArrayList<>();
    }

    public void agregarInsumo(Insumo insumo) {
        this.insumos.add(insumo);
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void imprimirInsumos() {
        for (Insumo insumo : insumos) {
            System.out.println(insumo.getNombre() + ": " + insumo.getCantidadDisponible() + " " + insumo.getUnidadMedida());
        }
    }
}
