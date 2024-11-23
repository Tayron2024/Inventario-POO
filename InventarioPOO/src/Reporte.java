import java.util.List;

public class Reporte {

    public void generarReportePedidos(List<Pedido> pedidos) {
        System.out.println("==========================================");
        System.out.println("Reporte de Pedidos");
        System.out.println("==========================================");

        for (Pedido pedido : pedidos) {
            System.out.println("ID del Pedido: " + pedido.getId());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Fecha: " + pedido.getFecha());
            System.out.println("Estado: " + pedido.getEstado());
            System.out.println("Platos:");

            for (Plato plato : pedido.getListaPlatos()) {
                System.out.println("- " + plato.getNombre() + " - $" + plato.getPrecio());
            }

            System.out.println("------------------------------------------");
        }
    }
}
