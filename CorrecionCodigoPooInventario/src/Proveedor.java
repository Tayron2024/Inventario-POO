public class Proveedor {
    private String email;
    private String direccion;
    private String contacto;

    public Proveedor(String email, String direccion, String contacto) {
        this.email = email;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public void registrarProveedor() {
        System.out.println("Proveedor registrado: " + contacto);
    }

    public void actualizarProveedor(String nuevoContacto) {
        this.contacto = nuevoContacto;
        System.out.println("Contacto actualizado: " + nuevoContacto);
    }
}
