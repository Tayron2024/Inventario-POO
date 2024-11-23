class Alerta {
    private Insumo insumo;
    private String mensaje;
    private String fecha;
    private String tipoAlerta;

    // Constructor
    public Alerta(Insumo insumo, String mensaje, String fecha, String tipoAlerta) {
        this.insumo = insumo;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.tipoAlerta = tipoAlerta;
    }

    // Getters y Setters
    public Insumo getInsumo() {
        return insumo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    // Métodos
    public void generarAlerta() {
        // Lógica para generar la alerta (puede incluir envío de notificaciones, etc.)
    }

    public void enviarNotificacion() {
        // Lógica para enviar la notificación de la alerta
    }
}
