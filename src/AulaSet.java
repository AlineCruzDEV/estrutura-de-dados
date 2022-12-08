import java.util.*;

public class AulaSet {

    public static void main(String[] args) {

        List<Produto> listProduto = new ArrayList<>();
        Set<Produto> setDeProduto = new HashSet<>();

        AnalisadorDePreco analisador = new AnalisadorDePreco();

        Orcamento orcamento = new Orcamento(50f, 500f);

        Produto p1 = new Produto("mouse", "mouse", 70f);
        Produto p2 = new Produto("teclado", "teclado", 200f);
        Produto p3 = new Produto("monitor", "monitor", 1700f);

        listProduto.add(p1);
        listProduto.add(p2);
        listProduto.add(p3);

        setDeProduto.add(p1);
        setDeProduto.add(p2);
        setDeProduto.add(p3);

        System.out.println("Lista de Orçamento utilizando List");
        List<Produto> listOrcamentoFinal = analisador.analisar(listProduto, orcamento);

        for (Produto prod : listOrcamentoFinal)
            System.out.println(prod.nome);

        System.out.println("\nLista de Orçamento utilizando Set");
        List<Produto> setOrcamentoFinal = analisador.analisar(listProduto, orcamento);

        for (Produto prod : setOrcamentoFinal)
            System.out.println(prod.nome);

    }
}

class Produto {
    String nome;
    String descricao;
    Float preco;

    public Produto(String nome, String descricao, Float preco) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }
}

class Orcamento {
    Float min;
    Float max;

    public Orcamento(Float min, Float max) {
        this.min = min;
        this.max = max;
    }
}

class AnalisadorDePreco {

    private boolean cabeNoOrcamento(Produto prod, Orcamento orcamento) {
        return orcamento.max >= prod.getPreco() && prod.getPreco() >= orcamento.min;
    }

    public List<Produto> analisar(Collection<Produto> produtos, Orcamento orcamento) {
        List<Produto> listOrcamento = new ArrayList<>();
        for (Produto prod : produtos) {
            if (cabeNoOrcamento(prod, orcamento)) listOrcamento.add(prod);
        }
        return listOrcamento;
    }
}