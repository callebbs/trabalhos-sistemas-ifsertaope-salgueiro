public class Ventilador {
    
    private int velocidade;
    
    Ventilador(){
        velocidade = 0;
    }
    
    void aumentarVelocidade(int vel){
        if(vel >= 0 && vel <= 3){
            velocidade = vel;
        } else {
            velocidade = 0;
        }
    }
    
    int consultarVelocidade(){
        return velocidade;
    }
}