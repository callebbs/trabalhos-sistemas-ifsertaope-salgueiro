package aula008.pkg01;

public class Ponto2D {
    
    private int x; 
    private int y;
    
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String toString() {
        return "("+x+","+y+")";
    }

}
