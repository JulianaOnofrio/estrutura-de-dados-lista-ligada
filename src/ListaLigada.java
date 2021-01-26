public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElemtos = 0;

    public void adiciona(Object elemento) { //adiciona no começo
        Celula nova = new Celula(elemento);

        if (primeira == null) {
            primeira = nova;
            ultima = nova;
        } else {
            ultima.setProximo(nova);
            ultima = nova;
        }

        this.totalDeElemtos++;
    }

    @Override
    public String toString() {
        if (this.totalDeElemtos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;

        while (atual != null) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) { //adiciona no meio
        return posicao >= 0 && posicao < totalDeElemtos;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inexistente.");
        }

        Celula atual = primeira;
        int i = 0;

        while (atual != null) {
            if (i++ == posicao) {
                break;
            }

            atual = atual.getProximo();

        }

        return atual;
    }

    public void adiciona(int posicao, Object elemento) { //adiciona no final
        Celula atual = primeira;
        Celula last = null;
        Celula novo = new Celula(elemento);
        int i = 0;

        while (atual != null) {
            atual = atual.getProximo();

            if (i == posicao) {
                last.setProximo(novo);
                novo.setProximo(atual);

                break;
            }

            i++;
            last = atual;
        }

        this.totalDeElemtos++;
    }

    public Object pega(int posicao) { //método pega
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco() { //remove do começo 
        if (this.totalDeElemtos == 0) {
            throw new IllegalAccessError("Lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        this.totalDeElemtos--;

        if (this.totalDeElemtos == 0) {
            this.ultima = null;
        }
    }

    public void remove(int posicao) {
    }

    public int tamanho() { // tamanho
        return this.totalDeElemtos;
    }

    public boolean contem(Object o) {
        return false;
    }
}

//suas funções