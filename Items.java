import exercicio09.Produto;

import java.util.Scanner;

public class Items {
    private Integer quantidade;
    private Double valor;
    private Produto produto;

    public Items(Integer quantidade, Double valor, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de produtos no item?");
        quantidade = scanner.nextInt();
        if(quantidade > 0) {
            return quantidade;
        } else {
            System.out.println("Quantidade invalida.");
            return 0;
        }
    }

    public Double getValor() {
        valor = (quantidade * produto.preco);
        return valor;
    }

    public Produto getProduto() {
        return produto;
    }

    void editarItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a nova quantidade de itens?");
            quantidade = scanner.nextInt();
    }

    void excluirItem(){
        produto.nome = "";
    }

    void listarItem(){
        System.out.println("Produto: " + produto.nome + " Quantidade: " + quantidade + "Valor do item: " + valor);
    }
    
    @Override
    public String toString() {
        return "Produto: " + produto.nome + " Quantidade: " + quantidade + "Valor do item: " + valor;
    }
}


