public interface GestionInventario {
    public void agregarItem(Insumo insumo);
    public void eliminarItem(Insumo insumo);
    public void buscarItem(String nombre);
    public void actualizarInventario();
}
