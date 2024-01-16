
package com.mycompany.game;


public class Player {
    
    //atribute
    String name;
    int speed,healthPoint,damage,armor,health;
    
    //method or function 
    
    void run(){
        System.out.println(name+" Is Running");
        System.out.println("");
        System.out.println("Speed"+speed);
    }
   
    void attack() {
        healthPoint-=damage;
        System.out.println("============");
        System.out.println(name+" menyerang "+damage);
        System.out.println("kerusakan"+damage);
    }
        
    
    void defend() {
        damage-=armor;
        System.out.println("");
        System.out.println(name+" is Defends "+armor);
        System.out.println("Defend"+armor);
    }
    void healthPoint(){

        System.out.println("sisa hp mu ="+healthPoint);
    }

   boolean isDead(){
        if(healthPoint<=0) return true;
            return false;
        
    }
    
}
    
    

