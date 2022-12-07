public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Exercicio Fila - Aula Estrutura de Dados");

            Fila exemploFila = new Fila();
            exemploFila.exibeFila();
            exemploFila.adicionaElemento(10);
            exemploFila.adicionaElemento(20);
            exemploFila.adicionaElemento(30);
            exemploFila.exibeFila();
            exemploFila.adicionaElemento(40);
            exemploFila.adicionaElemento(50);
            exemploFila.exibeFila();
            exemploFila.adicionaElemento(60);
            exemploFila.exibeFila();
            exemploFila.removeElemento();
            exemploFila.exibeFila();
        }

        {
            System.out.println("\nExercicio Pilha - Aula Estrutura de Dados");

            Pilha exemplo = new Pilha();
            exemplo.exibePilha();
            exemplo.adicionaElemento(10);
            exemplo.adicionaElemento(20);
            exemplo.adicionaElemento(30);
            exemplo.exibePilha();
            exemplo.adicionaElemento(40);
            exemplo.adicionaElemento(50);
            exemplo.exibePilha();
            exemplo.adicionaElemento(60);
            exemplo.exibePilha();
            exemplo.removeElemento();
            exemplo.exibePilha();
        }
    }
}