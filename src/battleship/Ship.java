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
public class Ship {
    private int fire;
    private int crit;
    private int damage;
    
    public Ship(){
    fire = 1;
    crit = (int) (Math.random() * 6);
    damage = 30000;
}
    /**
     * 
     * @return fire
     */
    public int getFire(){
        return fire;
    }
    /**
     * 
     * @return crit
     */
    public int getCrit(){
        crit = (int) (Math.random() * 6);
        return crit;
    }
/**
 * 
 * @return damage
 */
    int getDamage() {
       return damage;
    }
}