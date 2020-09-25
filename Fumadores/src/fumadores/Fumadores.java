/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fumadores;

import java.util.Random;

/**
 *
 * @author grave
 */
public class Fumadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int items[]= new int[3];
        while(true){
            items[1] = random.nextInt(3);
            System.out.println(items[1]);
        }
        
        
        /*
        Dealer dealer = new Dealer();
        new cliente(dealer);
        new cliente(dealer);
        new cliente(dealer);*/
    }
    
}
