public class Fila {

    int inicio;
    int fim;
    int tamanho;
    int controleElementos;
    int[] fila;

    public Fila() {
        inicio = fim = -1;
        tamanho = 6;
        fila = new int[tamanho];
        controleElementos = 0;
    }

    public boolean estaVazia() {
        return controleElementos == 0;
    }

    public boolean estaCheia() {
        return controleElementos == tamanho - 1;
    }

    public void adicionaElemento(int elemento) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            fila[fim] = elemento;
            controleElementos++;
        } else {
            System.out.println("Limite atingido. Elemento " + elemento + " não foi adicionado à fila.");
        }
    }

    public void removeElemento() {
        if (!estaVazia()) {
            inicio++;
            controleElementos--;
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