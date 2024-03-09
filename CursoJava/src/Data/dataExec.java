package Data;

import java.util.Scanner;

public class dataExec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        data D= new data();
        data Data = new data(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(D.obterdata());
        System.out.println(Data.obterdata());

    }
}
