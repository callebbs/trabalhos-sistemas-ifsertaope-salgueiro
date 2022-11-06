
package lista02_questao02;

import java.util.ArrayList;
import java.util.Random;

public class Jogos {
    
    public static String gerarJogo() {
        ArrayList numerosJogo = new ArrayList();
        Random rand = new Random();
        
        char[] numeros ={'0','1','2','3','4','5','6','7','8','9'};
        
        for (int i = 0; i < 12; i++) {
        int indice = rand.nextInt(numeros.length);
        numerosJogo.add(numeros[indice]);
        }
        String jogoMega = numerosJogo.toString().replaceAll("\\[|\\]", "").replaceAll(", ", "");
        return jogoMega;
    }   
}
