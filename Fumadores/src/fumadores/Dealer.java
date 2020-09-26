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
    public synchronized void comprar(int item, int numCliente){
        if(vendiendo){
            try {
                System.out.println("Fumando...");
                wait();
            } catch (InterruptedException ex) {
            }
        }
        n++;
        vendiendo = true;
        switch(item){
            case 0:{
                System.out.println("Cliente: "+numCliente+" comprando Tabacco");
                break;
            }
            case 1:{
                System.out.println("Cliente: "+numCliente+" comprando papel forjador");
                break;
            }
            case 2:{
                System.out.println("Cliente: "+numCliente+" comprando cerillos");
                break;
            }
        }        
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
