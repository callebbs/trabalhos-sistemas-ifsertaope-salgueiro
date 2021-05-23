package atividade06_questao08;

public class Matematica {
    
    static boolean multiplo;
    static int resultado;
    
    static boolean isMultiplo(int n, int m) {
        if (n % m == 0) {
            multiplo = true;
        } else {
            multiplo = false;
        }
        return multiplo;
    }
}
