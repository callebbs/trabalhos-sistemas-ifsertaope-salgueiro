package pagamento;

public interface Operadora {
    
    public Boolean autorizar(Autorizavel autorizavel, Cartao cartao);

    }
