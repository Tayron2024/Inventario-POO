import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Operacion> operaciones;

    public Historial() {
        this.operaciones = new ArrayList<>();
    }

    public void registrarOperacion(Operacion operacion) {
        this.operaciones.add(operacion);
    }

    public void consultarHistorial() {
        for (Operacion operacion : operaciones) {
            System.out.println(operacion);
        }
    }
}
