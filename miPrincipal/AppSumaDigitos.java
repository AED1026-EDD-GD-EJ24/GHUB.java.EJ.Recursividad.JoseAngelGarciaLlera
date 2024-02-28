package miPrincipal;

import java.util.Scanner;

public class AppSumaDigitos {
    public static void menu(){
         System.out.println("*************************");
        System.out.println("NUMEROS NATURALES");
        System.out.println("*************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona un número:");
        int numero = sc.nextInt();
        System.out.println("VERSION ITERATIVA");
        sumaITE(numero);
        System.out.println("");
        System.out.println("VERSION RECURSIVA");
        sumaREC(numero);


    }

    public static void  sumaITE(int numero){
        int suma=0;
        while (numero>0) {
            suma= suma+ numero%10;
            numero=numero/10;

            
        }
       
    }
    
    public static void sumaREC(int numero){
        if(numero<=0){
            mostrarNumerosREC(numero-1);
            System.out.print(numero+"  ");
        }
    }
    
}
