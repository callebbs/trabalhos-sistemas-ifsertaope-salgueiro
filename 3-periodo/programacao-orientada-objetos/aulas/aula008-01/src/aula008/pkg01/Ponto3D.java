package aula008.pkg01;

public class Ponto3D extends Ponto2D {
    private int z;
    
    public Ponto3D(int x, int y, int z) {
        super(x, y);
        setZ(z);
    }
    
    public int getZ() {
        return z;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    
    public String toString() {
        return "("+getX()+", "+getY()+", "+z+")";
    }
}
