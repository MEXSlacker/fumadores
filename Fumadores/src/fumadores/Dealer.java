package fumadores;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Dealer {
    private boolean vendiendo;
    private int n; 
    public Dealer(){
        n=0;
        vendiendo = false;
    }
    public synchronized void comprar(){
        if(vendiendo){
            try {
                System.out.println("Fumando...");
                wait();
            } catch (InterruptedException ex) {
            }
        }
        n++;
        vendiendo = true;
        System.out.println("Vendiendo...");
        vendiendo = false;
        notify();
    }
    
    public synchronized void fumar(){
        while(vendiendo || n<1){
            try{
                wait();
            }catch(InterruptedException ex){
            }
        }
        vendiendo=true;
        n--;
        System.out.println("Fumando . . .");
        vendiendo=false;
        notify();
    }
}
