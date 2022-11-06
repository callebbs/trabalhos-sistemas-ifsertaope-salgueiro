package aula007.pkg01;

import java.util.Scanner;

// Getters e Setters - métodos específicos para que seja possível acessar
// e modificar os valores de variáveis com modificador de acesso private.

/*
    O propósito de um getter é obter o valor de uma variável declarada como private
    e permitir sua leitura a partir de fora da classe.

    Os métodos getters podem ser programados para exibir os dados em formatos
    a propriados.

    Um setter é um método que permite modificar o valor de um atributo da classe,
    geralmente um traibuto que seja privado (e que não seja acessível diretamente).
    Assim temos mais controle sobre como valores são atribuídos aos campos.

    Os métodos setters podem ser programados para validar seus argumentos e rejeitar
    quaisquer tentativa
*/

public class Aula00701 {
    
    public static void main(String[] args) {
        String time;
        Futebol torcida = new Futebol();
    
        Scanner texto = new Scanner(System.in);
    
        System.out.print("Para qual time você torce? ");
        time = texto.nextLine();
        
        torcida.setTime(time);
        torcida.mostrTime();
    
    }
    
}
