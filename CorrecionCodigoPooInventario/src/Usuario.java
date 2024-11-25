public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String rol;
    private String email;

    // Constructor con 5 parámetros
    public Usuario(String nombre, String apellido, int edad, String rol, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
        this.email = email;
    }

    // Método para registrar un usuario
    public void registrarUsuario() {
        System.out.println("Usuario registrado: " + nombre + " " + apellido + ", Rol: " + rol + ", Email: " + email);
    }

    // Getters y Setters si es necesario
    public String getNombre() {
        return nombre;
    }
}
