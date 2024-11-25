import java.util.Date;

public class Alerta {
    private String mensaje;
    private Date fecha;
    private String tipo;

    public Alerta(String mensaje, Date fecha, String tipo) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public void generarAlerta() {
        System.out.println("Alerta generada: " + mensaje + " - Tipo: " + tipo);
    }

    public void enviarNotificacion() {
        System.out.println("Notificación enviada: " + mensaje);
    }
}
