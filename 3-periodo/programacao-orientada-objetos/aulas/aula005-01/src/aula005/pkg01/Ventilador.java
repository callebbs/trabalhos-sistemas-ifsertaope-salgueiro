package aula005.pkg01;

public class Ventilador {
    
    private int velocidade;
    
    // método set
    public void setVelocidade(int v){
        if (v >= 0 && v <= 3) {
            velocidade = v;
        } else {
            velocidade = 0;
        }
        
        //operador condicional ternário
        // velocidade = (v >= 0 && v <= 3)? v: 0;
    }
    
    // método get
    public int getVelocidade(){
        return velocidade;
    }
    
}
