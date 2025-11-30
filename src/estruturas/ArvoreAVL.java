package estruturas;

public class ArvoreAVL {
    private No raiz;
    private class No {
        int valor;
        int altura;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
            this. altura = 1;
            this.esquerda = null;
            this.direita = null;
        }       
    }

    //Ultilitários 
    private int altura(No N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int getFatorBalanceamento(No N) {
        if (N == null)
            return 0;
        return altura(N.esquerda) - altura(N.direita);
    }

    //Rotações
     private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;
        
        x.direita = y;
        y.esquerda = T2;

        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
     }

}