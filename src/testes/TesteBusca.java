package testes;

import estruturas.ArvoreBST;
import estruturas.ArvoreAVL;
import busca.BuscaSequencial;
import busca.BuscaBinaria;
import utils.Cronometro;

public class TesteBusca {

    private static final int REPETICOES = 5;

    public static double testarBuscaSequencial(int[] dados, int valor) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            cronometro.iniciar();
            BuscaSequencial.buscar(dados, valor);
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }

    public static double testarBuscaBinaria(int[] dadosOrdenados, int valor) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            cronometro.iniciar();
            BuscaBinaria.buscar(dadosOrdenados, valor);
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }
}