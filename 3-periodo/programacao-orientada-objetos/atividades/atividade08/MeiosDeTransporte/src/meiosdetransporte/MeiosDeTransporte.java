package meiosdetransporte;

import br.edu.ifsertaope.meiostransporte.dominio.Bicicleta;
import br.edu.ifsertaope.meiostransporte.dominio.Veiculo;
import br.edu.ifsertaope.meiostransporte.dominio.Automovel;
import br.edu.ifsertaope.meiostransporte.dominio.Moto;
import br.edu.ifsertaope.meiostransporte.dominio.Carro;


public class MeiosDeTransporte {


    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta();
        Moto moto1 = new Moto();
        Carro carro1 = new Carro();
    
        bike1.imprimirInformacoes();
        
        moto1.imprimirInformacoes();
        
        carro1.setQtdPortas(4);
        
        carro1.imprimirInformacoes();
        
        carro1.acelerar(20);
        
        carro1.imprimirInformacoes();
    }
    
}
