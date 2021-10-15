/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeenatsultana;
/*Name: Zeenat Sultana Nishat
Id:2012020313 
section:5G
Email:cse_2012020313@lus.ac.bd
Date:16-9-21*/

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    
public Cricket(String matchType,int over,Player player)
{
    this.matchType = matchType;
    this.over=over;
    this.player = player;
}
void display(){
    
    System.out.println("Match Type : "+matchType);   
    System.out.println("Over : "+over); 
    System.out.println("Name of player : "+player.playerName); 
    System.out.println("Jersey Number : "+player.jerseyNumber); 
  
}
}