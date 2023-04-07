    
package Entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidaAcual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidaAcual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidaAcual = capacidaAcual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidaAcual() {
        return capacidaAcual;
    }

    public void setCapacidaAcual(int capacidaAcual) {
        this.capacidaAcual = capacidaAcual;
    }
    
}
