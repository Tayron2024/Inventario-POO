import java.util.Date;

public class Operacion {
    private Date fechaRegistro;
    private double cantidad;
    private double costoTotal;
    private String motivo;
    private String tipo; // "Entrada" o "Salida"

    public Operacion(Date fechaRegistro, double cantidad, double costoTotal, String motivo, String tipo) {
        this.fechaRegistro = fechaRegistro;
        this.cantidad = cantidad;
        this.costoTotal = costoTotal;
        this.motivo = motivo;
        this.tipo = tipo;
    }

    public void registrarOperacion(Historial historial) {
        historial.registrarOperacion(this);
        System.out.println(tipo + " registrada: " + motivo + " | Cantidad: " + cantidad);
    }
}
