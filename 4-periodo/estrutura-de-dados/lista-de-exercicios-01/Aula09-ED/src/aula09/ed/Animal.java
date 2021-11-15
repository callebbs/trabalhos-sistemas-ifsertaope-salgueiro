package aula09.ed;

public class Animal {
    
    private String nome;
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
      
    
}
