package miPrincipal;

public class AppFibRecursivode40a50{

public static void menu(){
    System.out.printl("******************************************");
    System.out.println("==== Optimizando Fibonacci Recursivo ====");
    System.out.printl("******************************************");
    //Instaciamos Performace para tomar mediciones

    Perfomance p = new Perfomance();

    int desde = 40;
    int hasta = 50;
    double ant = -1;
    for(int i=desde;i<=hasta;i++){
        //comenzamos tomando el tiempo
        p.start();
        //Invocamos a la funcion recursiva
        double f = AppFibonacci.FibonacciRec(i);
        //detenemos el tiempo
        p.stop();
        System.out.println("f"+);
    }

    }
}