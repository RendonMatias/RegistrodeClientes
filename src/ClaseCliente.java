
public class Cliente {

    private int id;
    private String nombre;
    private String correo;
    private boolean activo;

    private static int contadorClientes = 0;

    // Constructor
    public Cliente(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }

    // Metodos para activar y desactivar
    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    // Metodo static
    public static int getTotalClientes() {
        return contadorClientes;
    }
}

