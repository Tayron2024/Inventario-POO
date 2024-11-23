import java.util.List;
import java.util.ArrayList;
class Pedido {
    private int id;
    private String cliente;
    private List<Plato> listaPlatos;
    private String fecha;
    private String estado;

    // Constructor
    public Pedido(int id, String cliente, String fecha, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.listaPlatos = new ArrayList<>(); // Inicializa la lista
        this.fecha = fecha;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    // Métodos
    public void realizarPedido() {
        if (estado.equals("Pendiente")) {
            // Lógica para realizar el pedido
            estado = "Realizado";
        } else {
            // Manejar el caso de que el pedido ya esté realizado
        }
    }

    public void cancelarPedido() {
        if (estado.equals("Pendiente")) {
            // Lógica para cancelar el pedido
            estado = "Cancelado";
        } else {
            // Manejar el caso de que el pedido ya esté cancelado
        }
    }

    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
    }

}
