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
        Dealer dealer = new Dealer();
        new cliente(dealer, 1);
        new cliente(dealer, 2);
        new cliente(dealer, 3);
    }
    
}
