package exGrupoJava;

public class Produto {
        private String nome;
        private double preco;
        private String descricao;
        private int quantidade;

        public Produto(String nome, double preco, String descricao, int quantidade){
            this.nome= nome;
            this.preco= preco;
            this.descricao= descricao;
            this.quantidade=quantidade;
        }

        public String getNome(){
            return nome;
        }
        public double getPreco(){
            return preco;
        }
        public String getDescricao(){
            return descricao;
        }
        public int getQuantidade(){
            return quantidade;
        }


        public void setNome(String nome){
            if(nome==null){
                System.out.println("Nome iiiiinválido");
            }else {
                this.nome = nome;
            }
        }
        public void setPreco(double preco){
            if(preco<=0){
                System.out.println("Preço onválido");
            }else {
                this.preco = preco;
            }
        }
        public void setDescricao(String descricao){
            if(descricao==null){
                System.out.println("Descrição inválida");
            }else {
                this.descricao = descricao;
            }
        }
        public void setQuantidade(int quantidade){
            if(quantidade<=0){
                System.out.println("Quantidade Inválida");
            }else {
                this.quantidade = quantidade;
            }
        }
        public void cadastrarProduto(){
            System.out.println("Cadastrando produto");
        }
        public void excluirProduto(){
            System.out.println("Excluindo produto");
        }
    }

