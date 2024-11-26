public class Bodega {
    private String nombre;
    private double cantidadUtileria;
    private double cantidadCondimentos;
    private double cantidadVerduras;
    private double cantidadCarnes;

    public Bodega(String nombre) {
        this.nombre = nombre;
    }

    public void almacenar(String tipo, double cantidad) {
        switch (tipo) {
            case "Utileria" -> cantidadUtileria += cantidad;
            case "Condimentos" -> cantidadCondimentos += cantidad;
            case "Verduras" -> cantidadVerduras += cantidad;
            case "Carnes" -> cantidadCarnes += cantidad;
        }
    }
}
