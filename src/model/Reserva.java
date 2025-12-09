package model;

public class Reserva {
    private int id;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva(int id, String cliente, String fecha, int duracionHoras) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    public int getId() {
        return id;
    }
    public String getCliente(){
        return cliente;
    }
    public String getFecha(){
        return fecha;
    }
    public int getDuracionHoras(){
        return duracionHoras;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setDuracionHoras(int duracionHoras){
        this.duracionHoras = duracionHoras;
    }
    public void mostratInfor(){
        System.out.println(
                "Reserva ID: " + id +
                        " | Cliente: " + cliente +
                        " | Fecha: " + fecha +
                        " | Duración: " + duracionHoras + "h"
        );

    }
}
