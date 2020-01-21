/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mexicotwist;


public class player {
    
    // declaring the player name variable
        public String name;
        // declaring the player life variable
        public int Life ;
        
    // this method sets player name and life
    public  player(){
        name = "" ;
        Life = 0 ;
        
        
    }
      // this method sets player name and life as an argument
        public player(String n , int l){
            name = n ;
            Life = l ;
            
        }
      // sets players name
       public void setName(String nam){
           name = nam ;
           
       }
       // returns player name
       public String getName (){
           return name; 
       }
     //  sets player life
       public void setLife(int L) {
           Life = L ;
       }
       // returns player life
       public int getLife(){
         return Life;
        

    
}


}

