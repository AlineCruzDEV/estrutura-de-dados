public class Fila {

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    int[] fila;

    public Fila() {
        inicio = fim = -1;
        tamanho = 6;
        fila = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() {
        return qtdeElementos == 0;
    }

    public boolean estaCheia() {
        return qtdeElementos == tamanho - 1;
    }

    public void adicionaElemento(int e) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            fila[fim] = e;
            qtdeElementos++;
        } else {
            System.out.println("Limite atingido. Elemento " + e + " não foi adicionado à fila.");
        }
    }

    public void removeElemento() {
        if (!estaVazia()) {
            inicio++;
            qtdeElementos--;
        }
    }

    public void exibeFila() {
        StringBuilder elementos = new StringBuilder();
        if (!estaVazia()) {
            for (int i = inicio; i <= fim; i++) {
                elementos.append(fila[i]).append(" ");
            }
            System.out.println("Fila: " + elementos);
        } else {
            System.out.println("Fila vazia");
        }

    }

}