import java.util.Date;

public class Movimiento {
    private String tipo;  // Entrada o Salida
    private Insumo insumo;
    private double cantidad;
    private Date fecha;

    // Constructor
    public Movimiento(String tipo, Insumo insumo, double cantidad, Date fecha) {
        this.tipo = tipo;
        this.insumo = insumo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "tipo='" + tipo + '\'' +
                ", insumo=" + insumo.getNombre() +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                '}';
    }
}
