
package com.mycompany.game;


public class player2 {
    
    String name;
    int speed,healthPoint2,damage2,armor2,health,healthPoint,damage,armor;
    
    //method or function 
    
    void run2(){
        System.out.println(name+" Is Running");
        System.out.println("");
        System.out.println("Speed"+speed);
    }
    
        
    void attack2() {
        healthPoint2-=damage2;
        System.out.println("");
        System.out.println(name+" menyerang "+damage2);
        System.out.println("kerusakan"+damage2);
        if (healthPoint2==0){
            System.out.println("Hero Win");
        }
        
        
    }
    void defend2() {
        damage2-=armor;
        System.out.println("");
        System.out.println(name+" is Defends "+armor2);
        System.out.println("Defend"+armor2);
    }
    void healthPoint2(){

        System.out.println("sisa hp mu ="+healthPoint2);
    }
    boolean isDead(){
        if(healthPoint2<=0) return true;
            return false;
        
    }
    
    
    //method or function 
//    
//    void run(){
//        System.out.println(name+" Is Running");
//        System.out.println("");
//        System.out.println("Speed"+speed);
//    }
//   
//    void attack() {
//        healthPoint2-=damage;
//        System.out.println("============");
//        System.out.println(name+" menyerang "+damage);
//        System.out.println("kerusakan"+damage);
//    }
//        
//    
//    void defend() {
//        damage-=armor;
//        System.out.println("");
//        System.out.println(name+" is Defends "+armor);
//        System.out.println("Defend"+armor);
//    }
//    void healthPoint(){
//
//        System.out.println("sisa hp mu ="+healthPoint);
//    }

    
    
}
