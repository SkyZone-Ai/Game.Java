
package com.mycompany.game;

// import java.util.Scanner;

public class Game {
    
   

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        
       //buat objek
       Player hero = new Player();
       player2 enemy = new player2();
       
       
       
       
       
       
       hero.name = "Adi";
       hero.speed = 60;
       hero.healthPoint = 100;
       hero.damage = 50;
       hero.armor = 15;
       
       hero.run();
        
//       String pilih = input.nextLine();
        
       hero.attack();
       hero.defend();
       hero.healthPoint();
       
       if(hero.isDead()){
           System.out.println("Game Over "); 
       }
       
       //Enemy Stats
       
        System.out.println("");
        System.out.println("==================");
        System.out.println("");
       
       enemy.name = "Tanzilur";
       enemy.speed = 75;
       enemy.healthPoint2 = 100;
       enemy.damage2 = 50;
       enemy.armor2 = 25;
           
           enemy.run2();
           
           enemy.attack2();
           enemy.defend2();
           enemy.healthPoint2();
           
           if(enemy.isDead()){
           System.out.println("You Win");
           

        
           
          
    
}{}}}
          
