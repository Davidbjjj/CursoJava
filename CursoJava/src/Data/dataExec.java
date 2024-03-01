package Data;

import java.util.Scanner;

public class dataExec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        data Data = new data();
        System.out.println("digite o Dia");
        Data.dia = sc.nextInt();
        System.out.println("digite o Mês");
        Data.mes = sc.nextInt();
        System.out.println("digite o Ano");
        Data.ano = sc.nextInt();

        System.out.println("A data digitada foi: "+Data.dia+"/"+Data.mes+"/"+Data.ano);

    }
}
