public class Reporte {
    private String nombreReporte;

    // Constructor
    public Reporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    // Método para generar el reporte
    public void generarReporte() {
        System.out.println("Generando reporte: " + nombreReporte);
    }

    // Método para exportar el reporte
    public void exportarReporte() {
        System.out.println("Exportando reporte: " + nombreReporte);
    }
}
