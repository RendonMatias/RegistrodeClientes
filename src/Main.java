public class Main {
}

public class Main {
    public static void main(String[] args) {

        // Crear tres clientes
        Cliente cliente1 = new Cliente("Ana Perez", "ana@correo.com");
        Cliente cliente2 = new Cliente("Matias", "matias@correo.com");
        Cliente cliente3 = new Cliente("Carlos", "carlos@correo.com");

        // Mostrar datos
        System.out.println("REGISTRO DE CLIENTES");

        System.out.println("CLIENTE 1");
        System.out.println("ID: " + cliente1.getId());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo: " + cliente1.getCorreo());
        System.out.println("Activo: " + cliente1.isActivo());

        System.out.println("CLIENTE 2");
        System.out.println("ID: " + cliente2.getId());
        System.out.println("Nombre: " + cliente2.getNombre());
        System.out.println("Correo: " + cliente2.getCorreo());
        System.out.println("Activo: " + cliente2.isActivo());

        System.out.println("CLIENTE 3");
        System.out.println("ID: " + cliente3.getId());
        System.out.println("Nombre: " + cliente3.getNombre());
        System.out.println("Correo: " + cliente3.getCorreo());
        System.out.println("Activo: " + cliente3.isActivo());

        // Desactivar cliente
        cliente2.desactivar();

        System.out.println("DESPUES DE DESACTIVAR");
        System.out.println("Cliente 2 activo: " + cliente2.isActivo());

        // Activar nuevamente
        cliente2.activar();

        System.out.println("DESPUES DE ACTIVAR");
        System.out.println("Cliente 2 activo: " + cliente2.isActivo());

        // Total de clientes
        System.out.println("Total de clientes: "
                + Cliente.getTotalClientes());
    }
}
