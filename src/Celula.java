public class Celula {

    private Object elemento;
    private Celula proximo;

    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }
}

//criação do objeto