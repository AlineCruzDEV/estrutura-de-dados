import java.util.Optional;

public class Lista {

    NoLista inicio;

    public Lista() {
        this.inicio = null;
    }

    public void inserirNoInicio(float valor) {
        if (this.inicio == null) {
            this.inicio = new NoLista(valor);
        } else {
            NoLista novoNo = new NoLista(valor);
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        }
    }

    public void inserirNoFim(float valor) {
        NoLista novoNo = new NoLista(valor);
        if (this.inicio == null) {
            this.inicio = new NoLista(valor);
        } else {
            NoLista atual = this.inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void inserirNoMeio(NoLista anterior, float valor) {
        NoLista novoNo = new NoLista(valor);
        novoNo.proximo = anterior.proximo;
        anterior.proximo = novoNo;
    }

    public Optional<NoLista> buscar(float valor) {
        if (this.inicio != null) {
            NoLista atual = this.inicio;
            while (atual.proximo != null) {
                if (atual.info == valor) {
                    return Optional.of(atual);
                }
                atual = atual.proximo;
            }
        }
        return Optional.empty();
    }

    public void imprimir() {
        for (NoLista atual = this.inicio; atual != null; atual = atual.proximo) {
            System.out.println(inicio.info + " ");
        }
    }

    public void insereOrdenado(float valor) {
        NoLista novoNo = new NoLista(valor);

        NoLista ant = null;
        NoLista p = this.inicio;

        while (p != null && p.info < valor) {
            ant = p;
            p = p.proximo;
        }
        if (ant == null) {
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        } else {
            novoNo.proximo = ant.proximo;
            ant.proximo = novoNo;
        }
    }

    //TODO - remover (inicio, fim e meio)

}

class NoLista {

    float info;
    NoLista proximo;

    public NoLista(float valor) {
        this.info = valor;
        this.proximo = null;
    }
}