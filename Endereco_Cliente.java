package cliente_endereco;

import java.util.Scanner;

public class Endereco_Cliente {
    private  String enderecoAtual;
    private  String CEP;

    public Endereco_Cliente(String enderecoAtual, String CEP) {
        this.enderecoAtual = enderecoAtual;
        this.CEP = CEP;
    }

    public void editarEndereco(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe  o novo endereco : ");
        String novoEndereco = scanner.nextLine();
        enderecoAtual = novoEndereco;

    }


    public String getEnderecoAtual() {
        return enderecoAtual;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        if (CEP.length()!=8){
            System.out.println("CEP invalido");
        }else{
            this.CEP = CEP;
        }
    }

    @Override
    public String toString() {
        return "Endereço_Cliente{" +
                "enderecoAtual='" + enderecoAtual + '\'' +
                ", CEP='" + CEP + '\'' +
                '}';
    }
}
