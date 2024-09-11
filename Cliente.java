package exGrupoJava;

public class Cliente {
    private int codigo;
    private String nome;
    private String CPF;
    private String telefone;

    public Cliente(int codigo, String nome, String CPF, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != "") {
            this.nome = nome;
        } else{
            System.out.println("Nome Inválido")
        }

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(CPF.lenght < 11) {
            System.out.println("CPF Inválido")
        } else {
            this.CPF = CPF;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(CPF.lenght < 11) {
            System.out.println("CPF Inválido");
        } else {
            this.telefone = telefone;
        }
    }

    public void cadastrarEndereco(){
        System.out.println("Cadastrando Endereço");
    }

    public void realizarPedido(){
        System.out.println("Realizando Pedido");
    }
    public void editar(){
        System.out.println("Editando");
    }
    public void exlcuir(){
        System.out.println("Cadastrando Endereço");
    }
    public void listar(){
    System.out.println("listando")
    }
}
