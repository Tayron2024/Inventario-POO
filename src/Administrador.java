public class Administrador extends Usuario {
    private String revision;
    private String control;
    public Administrador(String nombre, String apellido, int edad, String rol, String email) {
        super(nombre, apellido, edad, rol, email);
    }

    public void crearReporte(ReporteConsumo reporte) {
        System.out.println("Reporte de consumo creado por " + getNombre());
        reporte.generarReporte();
    }
}
