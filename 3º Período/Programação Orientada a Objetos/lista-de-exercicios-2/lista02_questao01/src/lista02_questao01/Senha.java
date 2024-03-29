package lista02_questao01;

import java.util.ArrayList;
import java.util.Random;


public class Senha {  
    
    public static String gerarSenha(int tamanho) {
        ArrayList chars = new ArrayList();
        Random rand = new Random();
    
        char[] caracteres ={'0','1','2','3','4','5','6','7','8','9','a','b',
            'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
            't','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for (int i = 0; i < tamanho; i++) {
            int valor = rand.nextInt(caracteres.length);
            chars.add(caracteres[valor]);
        }
        String senha = chars.toString().replaceAll("\\[|\\]", "").replaceAll(", ", "");
        return senha;
    }    
}