package atividade07_questao01;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    // get e set do atributo nome
    public void setNome(String nomePessoa) {
        nome = nomePessoa;
    }
    
    public String getNome() {
        return nome;
    }
    
    //get e set do atributo endereço
    public void setEndereco(String enderecoPessoa) {
        endereco = enderecoPessoa;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    //get e set do atributo telefone
    
    public void setTelefone(String telefonePessoa) {
        telefone = telefonePessoa;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void imprimir() {
        System.out.println(" ------ Dados ------");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("--------------------------");
    }
    
}
