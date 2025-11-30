package testes;

import estruturas.Vetor;
import estruturas.ArvoreBST;
import estruturas.ArvoreAVL;
import utils.Cronometro;

public class TesteInsercao {

    private static final int REPETICOES = 5;

    public static double testarVetor(int[] dados) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            Vetor vetor = new Vetor(dados.length);
            cronometro.iniciar();
            for (int valor : dados) {
                vetor.inserir(valor);
            }
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }

    public static double testarArvoreBST(int[] dados) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            ArvoreBST arvore = new ArvoreBST();
            cronometro.iniciar();
            for (int valor : dados) {
                arvore.inserir(valor);
            }
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }

    public static double testarArvoreAVL(int[] dados) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            ArvoreAVL arvore = new ArvoreAVL();
            cronometro.iniciar();
            for (int valor : dados) {
                arvore.inserir(valor);
            }
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }
}

