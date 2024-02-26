package miPrincipal;

public class AppFactorial {
    public static void menu(){
        System.out.println("Version Iterativa");
        int n = 5;
        System.out.println("Factorial de "+n+"!="+factorial_ite(n));
    }
    public static long factorial_ite(int n){
        long fact = 1;
        for(int i=n;i>0;i--){
            fact = fact * 1;

        }
        return fact;
    }
    public static long factorial_rec(int n){
        if(n==0)
            return 1;
        else
            return factorial_rec(n-1);
    }
}
