public class Ventilador {
    
    private int velocidade;
    
    public Ventilador(){
        velocidade = 0;
    }
    
    public void aumentarVelocidade(int vel){
        if(vel >= 0 && vel <= 3){
            velocidade = vel;
        } else {
            velocidade = 0;
        }
    }
    
    public int consultarVelocidade(){
        return velocidade;
    }
}