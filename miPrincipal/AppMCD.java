package miPrincipal;

public class AppMCD {
    public static void main(String[] args) {
        System.out.println(mcd(6,124));
        System.out.println(mcd(8,64));
    }
    public static int mcd(int m, int n){
        if(n<=m && m%n ==0)
            return n;
        else if(m<n)
            return mcd(m, n);
        else
            return mcd(n,m%n);
    }
}
