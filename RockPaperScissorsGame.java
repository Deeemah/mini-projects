/*
 * Name: Deemah Almusbeh
 * 
 */
package rock.paper.scissors.game;

/**
 *
 * @author deema
 */

import java.util.Random;  //Needed for random 
import java.util.Scanner; //Needed for Scanner class
        
public class RockPaperScissorsGame {

   //this method compares rock 
    public static void Rock(String userPlay,String compPlay){
         
        if ("rock".equals(compPlay) && "scissors".equals(userPlay)) {
            System.out.println("Rock smashes the Scissors, Computer wins!");
        }
          else if ("rock".equals(userPlay) && "scissors".equals(compPlay)) {
                System.out.println("Rock smashes the Scissors, you win!");
                    }
    }
    //this method compares scissors
    public static void Scissors(String userPlay,String compPlay){
        if ("scissors".equals(compPlay) && "paper".equals(userPlay)) {
                System.out.println("Scissors cuts paper, computer wins!");
                    }
            else if ("scissors".equals(userPlay) && "paper".equals(compPlay)) {
                System.out.println("Scissors cuts paper, you win!");
                    }
    }
    //this method compares paper
    public static void Paper(String userPlay,String compPlay){
        if ("paper".equals(compPlay) && "rock".equals(userPlay)) {
                System.out.println("Paper wraps rock, computer wins!");
                    }       
           else if ("paper".equals(userPlay) && "rock".equals(compPlay)) {
                System.out.println("Paper wraps rock, you win!");
                    }
    }
    /*if user and computer make the same choice this method displays a message
    that prompts user to enter choice again*/
    public static void sameChoice(String userPlay,String compPlay){
        if (compPlay.equals(userPlay)) {
           System.out.println("You made the same choice, game must be played"
                       + " again to determine the winner \n");
        }
    }
    
    //prints menu
     public static void menu(){
        
        System.out.println("Please, enter your choice of the following:");
        System.out.println("\"rock\", \"paper\", or \"scissors\"");
     }
    public static void main(String[] args) {
        //initilizing variables
        String compPlay="1"; //holds computer play
        String userPlay="1"; //holds user play
        int computerPick; //hold value for choice of computer
        
        //creates random object
        Random rand = new Random();
        //creates scanner object
        Scanner keyboard = new Scanner(System.in);
        //prints welcome message
        System.out.println("Welcome to Rock, Paper, Scissors game:");
        
        //while loop to repeat the game if both players make the same choice
        while(compPlay.equals(userPlay)) {
        //using random to make computer pick 
        computerPick=rand.nextInt(3)+1;
       
        //if computer picked 1 then it picked rock
       if (computerPick==1) {
          compPlay="rock"; 
        }
       //if computer picks 2 then it picked paper
        else if (computerPick==2){
         compPlay="paper";
        }
        else {
       //if computer picks 3 then it picked scissors
         compPlay="scissors";
        }
             
       //calling menu method which also prompts user for choice
        menu();
        //stores user input in userPlay
        userPlay = keyboard.nextLine();
        //displays computer choice 
        System.out.println("Computer picked "+compPlay);
        //displays user choice
        System.out.println("You picked "+userPlay);
        
            //methods calling
             Rock(userPlay,compPlay);
             Scissors(userPlay,compPlay);
             Paper(userPlay,compPlay);
             sameChoice(userPlay,compPlay);
      
    }
}
}

    
