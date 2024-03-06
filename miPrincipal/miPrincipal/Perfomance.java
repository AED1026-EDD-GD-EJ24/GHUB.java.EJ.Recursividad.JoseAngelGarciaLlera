package miPrincipal;

public class Perfomance {
    private long ti;
    private long tf;
    private boolean stoped;
    public Perfomance(){
        start();
    }
    public void start(){
        ti=System.currentTimeMillis();
        stoped=false;
    }
    public void stop(){
        tf=System.currentTimeMillis();
        stoped=false;
    }
}
