package ba.unsa.etf.rpr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static  int sumaCifara(int a){
        int suma  = 0;
        int pom;
        while (a != 0){
            pom = a%10;
            suma += pom;
            a = a/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("To su brojevi: ");
        for(int i = 2; i < n; i++){
            if(i % sumaCifara(i) == 0){
                System.out.println(i);
            }
        }
	// write your code here
    }
}
