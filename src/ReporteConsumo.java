public class ReporteConsumo {
    private String tipo;
    private String periodoInicio;
    private String periodoFin;
    private String datos;


    public ReporteConsumo(String tipo, String periodoInicio, String periodoFin, String datos) {
        this.tipo = tipo;
        this.periodoInicio = periodoInicio;
        this.periodoFin = periodoFin;
        this.datos = datos;
    }

    public void generarReporte() {
        System.out.println("Generando reporte de consumo tipo: " + tipo);
    }

    public void exportarReporte() {
        System.out.println("Exportando reporte de consumo...");
    }
}
