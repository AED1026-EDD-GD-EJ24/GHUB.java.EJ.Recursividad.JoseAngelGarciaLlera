package miPrincipal;

public class AppAlfabeto {
    public static void main(String[] args) {
        System.out.println("");
        metodoA('Z');
        System.out.println("");
    }
    static void metodoA(char c){
        System.out.println(c);
        if(c>'A')
        metodoB(c);
       // System.out.println(c);
    }

    static void metodoB(char c){
        metodoA(--c);
    }
    
}
