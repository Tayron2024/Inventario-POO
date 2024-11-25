public class ReporteBodega {
    private String tipo;
    private String datos;

    public ReporteBodega(String tipo, String datos) {
        this.tipo = tipo;
        this.datos = datos;
    }

    public void generarReporte() {
        System.out.println("Generando reporte de bodega para: " + tipo);
    }

    public void actualizarReporte(String nuevosDatos) {
        this.datos = nuevosDatos;
        System.out.println("Reporte actualizado.");
    }
}
