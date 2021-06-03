package aula007.pkg01;

public class Futebol {
    
    private String nomeTime;
    
    public void setTime(String meuTime) {
        nomeTime = meuTime;
    }
    
    public String getTime() {
        return nomeTime;
    }
    
    public void mostrTime() {
        System.out.println("Seu time do coração é " + getTime());
    }
}
