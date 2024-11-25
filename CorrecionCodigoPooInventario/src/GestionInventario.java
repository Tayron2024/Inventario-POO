public interface GestionInventario {
    void agregarItem(Insumo insumo);
    void eliminarItem(Insumo insumo);
    Insumo buscarItem(String nombre);
    void actualizarInventario();
}
