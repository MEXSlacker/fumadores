package fumadores;

public class cliente implements Runnable{
    private int[] items;
    
    public Dealer dealer;
    public cliente(Dealer dealer){
        this.dealer = dealer;
        new Thread(this, "Cliente").start();
    }
    @Override
    public void run(){
        while(true){
            
            dealer.comprar();
            dealer.fumar();
        }
    }
}
