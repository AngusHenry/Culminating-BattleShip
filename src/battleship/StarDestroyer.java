/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author anhen3335
 */
public class StarDestroyer extends Ship{
    private int health;
    private int segments;
    private int damage; 
    private String Ship;
    public StarDestroyer(){
        health = 100;
        segments = 2;
        damage = 15;
        Ship = "StarDestroyer";
    }
    /**
     * 
     * @return damage
     */
    public int getDamage(){
        return damage;
    }
    /**
     * 
     * @return Ship
     */
    public String getShip (){
       return Ship;
       }
    /**
     * 
     * @return health
     */
            public int getHealth (){
        return health;
       }
            /**
             * 
             * @return segments
             */
        public int getSegments (){
        return segments;
       }
}