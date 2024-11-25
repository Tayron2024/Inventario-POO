import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String descripcion;
    private Date fecha;
    private ArrayList<Insumo> insumos;

    public Pedido(String descripcion, Date fecha, ArrayList<Insumo> insumos) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.insumos = insumos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public ArrayList<Insumo> getInsumos() {
        return insumos;
    }

    public void realizarPedido() {
        System.out.println("Pedido realizado: " + descripcion + " en la fecha: " + fecha);
        for (Insumo insumo : insumos) {
            System.out.println("Incluye el insumo: " + insumo.getNombre());
        }
    }
}
