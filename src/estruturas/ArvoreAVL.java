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

     private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        
        y.esquerda = x;
        x.direita = T2;

        
        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    public void inserir(int valor) {
    raiz = inserirRecursivo(raiz, valor);
}
    // Inserção
    private No inserirRecursivo(No no, int valor) {
        if (no == null)
        return new No(valor);

        if (valor < no.valor)
        no.esquerda = inserirRecursivo(no.esquerda, valor);
        else if (valor > no.valor)
        no.direita = inserirRecursivo(no.direita, valor);
        else
        return no;

        no.altura = 1 + max(altura(no.esquerda), altura(no.direita));

        int balanceamento = getFatorBalanceamento(no);

        if (balanceamento > 1 && valor < no.esquerda.valor)
        return rotacaoDireita(no);

        if (balanceamento < -1 && valor > no.direita.valor)
        return rotacaoEsquerda(no);

        if (balanceamento > 1 && valor > no.esquerda.valor) {
        no.esquerda = rotacaoEsquerda(no.esquerda);
        return rotacaoDireita(no);
    }

    if (balanceamento < -1 && valor < no.direita.valor) {
        no.direita = rotacaoDireita(no.direita);
        return rotacaoEsquerda(no);
    }

    return no;
}


}