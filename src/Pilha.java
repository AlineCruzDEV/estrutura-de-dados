public class Pilha {
    int tamanhoPilha = 5;
    int controleElementos = 0;
    int[] pilha = new int[tamanhoPilha];

    public void adicionaElemento(int elemento) {
        if (controleElementos < tamanhoPilha) {
            pilha[controleElementos] = elemento;
            controleElementos++;
        } else {
            System.out.println("Limite atingido. Elemento " + elemento + " não foi adicionado à pilha.");
        }
    }

    public void exibePilha() {
        String elementos = "";

        for (int i = 0; i < controleElementos; i++) {
            elementos += pilha[i] + " ";
        }
        System.out.println("Pilha: " + elementos);
    }

    public void removeElemento() {
        if (controleElementos != 0) {
            controleElementos--;
        }
    }

//    Atividade simulando uma inversão de pilha usando a implementação de lista
//    public Pilha inverte(Pilha p) {
//        Pilha invertida = new Pilha();
//        No aux;
//        while (!p.topo == null){
//            aux = pop(p);
//            push(invertida, aux);
//        }
//        return invertida;
//    }
}
