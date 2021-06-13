package meiosdetransporte;

import br.edu.ifsertaope.meiostransporte.dominio.Bicicleta;
import br.edu.ifsertaope.meiostransporte.dominio.Veiculo;
import br.edu.ifsertaope.meiostransporte.dominio.Automovel;
import br.edu.ifsertaope.meiostransporte.dominio.Moto;

public class MeiosDeTransporte {


    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta();
        Moto moto1 = new Moto();
    
        bike1.imprimirInformacoes();
        
        moto1.imprimirInformacoes();
    }
    
}
