import java.util.Date;

class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        GestionInventarioCompleto gestionInventario = new GestionInventarioCompleto();

        // Crear insumos
        Insumo insumo1 = new Insumo("Harina", 100, "kg", 1.5f, 20);
        Insumo insumo2 = new Insumo("Aceite", 50, "litros", 3.0f, 10);

        // Registrar los insumos en el inventario
        gestionInventario.agregarInsumo(insumo1);
        gestionInventario.agregarInsumo(insumo2);

        // Mostrar el valor total del inventario
        System.out.println("Valor total del inventario: " + gestionInventario.obtenerValorTotalInventario());

        // Crear un proveedor
        Proveedor proveedor1 = new Proveedor(1, "Proveedor A", "Juan Pérez", "123456789", "juan@proveedora.com", "Calle Ficticia 123", 4.5);

        // Registrar una entrada de insumo (compra)
        Date fechaEntrada = new Date();
        Salida entrada = new Salida(1, insumo1, 50, fechaEntrada, proveedor1, 75.0f);
        gestionInventario.registrarMovimiento(entrada);

        // Actualizar el inventario después de la entrada
        gestionInventario.actualizarInventario();
        System.out.println("Cantidad disponible de " + insumo1.getNombre() + ": " + insumo1.getCantidadDisponible() + " " + insumo1.getUnidadMedida());

        // Crear una salida de insumo (uso)
        Date fechaSalida = new Date();
        Salida salida = new Salida(2, insumo1, 30, fechaSalida);
        gestionInventario.registrarMovimiento(salida);

        // Actualizar el inventario después de la salida
        gestionInventario.actualizarInventario();
        System.out.println("Cantidad disponible de " + insumo1.getNombre() + " después de la salida: " + insumo1.getCantidadDisponible() + " " + insumo1.getUnidadMedida());

        // Generar alertas de reorden
        gestionInventario.generarAlertas();

        // Mostrar el historial de movimientos
        entrada.mostrarDetalles();
        salida.mostrarDetalles();
    }
}
