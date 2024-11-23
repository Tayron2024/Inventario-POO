import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> registros;

    public Historial() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public List<String> obtenerRegistros() {
        return registros;
    }

    public void mostrarHistorial() {
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
}
