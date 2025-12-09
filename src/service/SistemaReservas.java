package service;
import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    private ArrayList<Reserva> reservas;

    public SistemaReservas() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada exitosamente: ID " + r.getId());
    }

    public void eliminarReserva(int id) throws Exception {
        for (Reserva r : reservas) {
            if (r.getId() == id) {
                reservas.remove(r);
                System.out.println("Reserva eliminada correctamente: ID " + id);
                return;
            }
        }
        throw new Exception("No existe una reserva con el ID " + id);
    }

    public void listarReservas() {
        System.out.println("\n=== LISTA DE RESERVAS ===");

        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        for (Reserva r : reservas) {
            r.mostratInfor();
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
