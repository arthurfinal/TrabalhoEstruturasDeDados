package utils;

public class Cronometro {
    private long inicio;
    private long fim;

    public void iniciar() {
        this.inicio = System.nanoTime();
    }

    public void parar() {
        this.fim = System.nanoTime();
    }

    public double getTempoEmMilissegundos() {
        return (double) (fim - inicio) / 1_000_000.0;
    }
}

