import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Inventario
        Inventario inventario = new Inventario();

        // *** Registrar Insumos ***
        System.out.println("=== Registro de Insumos ===");
        Insumo insumo1 = new Insumo("Harina", 50, "kg", 10, obtenerFecha(2024, 11, 30), 25.5, "A1");
        Insumo insumo2 = new Insumo("Azúcar", 100, "kg", 20, obtenerFecha(2024, 10, 25), 30.0, "A2");
        inventario.agregarInsumo(insumo1);
        inventario.agregarInsumo(insumo2);

        // *** Gestión de Inventario ***
        System.out.println("\n=== Entrada de Insumos ===");
        Insumo insumo3 = new Insumo("Leche", 30, "litros", 5, obtenerFecha(2024, 12, 5), 18.0, "B1");
        inventario.agregarInsumo(insumo3);

        System.out.println("\n=== Salida de Insumos ===");
        inventario.eliminarInsumo("Harina");

        System.out.println("\n=== Actualización de Inventario ===");
        System.out.println("Valor total del inventario: $" + inventario.obtenerValorTotalInventario());

        System.out.println("\n=== Generar Alertas ===");
        inventario.generarAlertas();

        System.out.println("\n=== Generación de Reportes ===");
        Reporte reporte = new Reporte("Reporte General");
        reporte.generarReporte();
        reporte.exportarReporte();

        System.out.println("\n=== Gestión de Categorías ===");
        Categoria categoria = new Categoria("Alimentos", "Productos comestibles");
        categoria.registrarCategoria();

        System.out.println("\n=== Gestión de Pedidos ===");
        Pedido pedido = new Pedido("Pedido de Harina", obtenerFecha(2024, 11, 15), new ArrayList<>());
        pedido.realizarPedido();

        System.out.println("\n=== Gestión de Usuarios ===");
        Usuario usuario = new Usuario("usuario1", "apellido1", 30, "admin", "user@correo.com");
        usuario.registrarUsuario();

        System.out.println("\n=== Fin del Programa ===");
    }

    private static Date obtenerFecha(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }
}
