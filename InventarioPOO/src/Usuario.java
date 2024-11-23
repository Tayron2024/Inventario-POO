public class Usuario {
    private String nombre;
    private String email;

    // Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el email
    public String getEmail() {
        return email;
    }

    // Método para establecer el email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para mostrar información del usuario
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
}
