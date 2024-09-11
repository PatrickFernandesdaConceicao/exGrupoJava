package cliente_endereco;

public class Teste {
    public static void main(String[] args) {
        Endereco_Cliente endCliente = new Endereco_Cliente("rua suecia","85906210");

        System.out.println("Endereco atual:" + endCliente.getEnderecoAtual());
        System.out.println("CEP atual:" + endCliente.getCEP());

        endCliente.setCEP("988888888888888");

        endCliente.editarEndereco();
        System.out.println("endereço atual: " + endCliente.getEnderecoAtual());
    }


}
