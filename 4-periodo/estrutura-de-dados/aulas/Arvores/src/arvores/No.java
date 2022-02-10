package arvores;

public class No {
    
    public int valor;
    public No esq;
    public No dir;
    public No pai;

    public No(int valor) {
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
        this.pai = pai;
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }
    
}
