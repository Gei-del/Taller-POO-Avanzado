package app;
import model.Reserva;
import service.SistemaReservas;


public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        // Crear reservas
        Reserva r1 = new Reserva(1, "Lorena", "2025-02-15", 2);
        Reserva r2 = new Reserva(2, "Carlos", "2025-02-16", 3);

        // Agregar al sistema
        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        // Modificar usando un setter
        System.out.println("\n Modificando datos de la reserva 1...");
        r1.setCliente("Lore ponton");

        // Listar reservas actuales
        sistema.listarReservas();

        // Intento de eliminación con manejo de excepciones
        System.out.println("\nIntentando eliminar reserva con ID 2...");
        try {
            sistema.eliminarReserva(2);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Intento de eliminar una reserva no existente
        System.out.println("\nIntentando eliminar reserva con ID 99...");
        try {
            sistema.eliminarReserva(99);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Listar nuevamente
        sistema.listarReservas();

        // Conteo final
        System.out.println("\nTotal de reservas activas: " + sistema.contarReservas());
    }
}
