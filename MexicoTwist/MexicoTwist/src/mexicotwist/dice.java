/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mexicotwist;

import java.util.Random;

/**
 *
 * @author Student
 */
public class dice {
    // declaring the die variable
        public int roll ;
    // this methods generates the die
    public void rollDice(){
        Random rand = new Random();
        roll = rand.nextInt(6) + 1 ;
        
    }
    // this method returns the die generated
    public int getdiceRoll() {
        return roll ;
    }
    
}


    

