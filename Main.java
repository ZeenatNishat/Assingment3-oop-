/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeenatsultana;
/* Name: Zeenat Sultana Nishat
   ID: 2012020313
   Scetion: 5G
   email:cse_2012020313@lus.ac.bd
   date:16/09/21
*/

public class Main {
    
    public static void main(String[] args) {
       
    Player p1= new Player("Shakib",75);
    Cricket cricket= new Cricket ("International match", 20,p1);
    
    cricket.display();
    
    Football footbal = new Football();
    }
}

