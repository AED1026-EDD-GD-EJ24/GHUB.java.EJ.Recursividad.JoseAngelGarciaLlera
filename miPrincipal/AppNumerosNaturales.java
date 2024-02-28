package miPrincipal;

import java.util.Scanner;

public class AppNumerosNaturales {
    public static void menu(){
        System.out.println("*************************");
        System.out.println("NUMEROS NATURALES");
        System.out.println("*************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona un número:");
        int numero = sc.nextInt();
        System.out.println("VERSION ITERATIVA");
        mostrarNumerosITE(numero);
        System.out.println("");
        System.out.println("VERSION RECURSIVA");
        mostrarNumerosREC(numero);


    }
    public static void mostrarNumerosITE(int numero){
        for(int i=1; i<=numero; i++){
            System.out.print(i+"  ");
        }
    }
    public static void mostrarNumerosREC(int numero){
        if(numero>0){
            mostrarNumerosREC(numero-1);
            System.out.print(numero+"  ");
        }
    }
}
