package Soma;

import java.util.Scanner;

public class SomaExec {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite dois números");
        int resultado = soma.Somar(sc.nextInt(), sc.nextInt());
        System.out.println("Resultado: "+resultado);

        
    }
}

