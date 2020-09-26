package fumadores;

import java.util.Random;

public class cliente implements Runnable{
    private int clienteNum=0;
    public Dealer dealer;
    public cliente(Dealer dealer, int clienteNum){
        this.dealer = dealer;
        this.clienteNum = clienteNum;
        new Thread(this, "Cliente").start();
    }
    
    @Override
    public void run(){
        Random random = new Random();
        int items=0;        
        items = random.nextInt(3);
        System.out.println(items);
        while(true){       
            dealer.comprar(items, clienteNum);
            dealer.fumar();
        }
    }
}
