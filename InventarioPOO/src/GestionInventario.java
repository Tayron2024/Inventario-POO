public interface GestionInventario {
    // Métodos a implementar en las clases que gestionen el inventario
    void agregarInsumo(Insumo insumo);
    void eliminarInsumo(Insumo insumo);
    Insumo buscarInsumo(String nombre);
    void actualizarInventario();
    double obtenerValorTotalInventario();
    void generarAlertas();
    void registrarMovimiento(Salida movimiento);
}
