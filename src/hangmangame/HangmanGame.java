
package hangmangame;
import java.util.Scanner;

import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Random random = new Random();
       
        String[] words = {"Boolean", "String", "Switch", "Coconut", "Random"};
        
        System.out.println("Welcome to the game of hangman!");
       
        
        int randomNumber = random.nextInt(5);
        
        String wordToGuess =(words[randomNumber]); 
        wordToGuess = wordToGuess.toLowerCase();
        char[] characters = wordToGuess.toCharArray();
        char [] userAnswer = new char[characters.length];
        
        for (int i=0; i<characters.length;i++ ){
            userAnswer[i] = '?';
        }
        boolean finished = false;
        int lives = 6;
        while (finished ==false){
            System.out.println("---------");
            System.out.println("Enter a letter");
            String userGuess = input.next();
            // check that the user input = valid.
            while (userGuess.length() != 1 || Character.isDigit(userGuess.charAt(0))){
                System.out.println("Wrong input, try again");
                userGuess = input.next();
            }
            // chack if the letter entered is in the word
            boolean found = false;
            for (int i=0; i<characters.length;i++){
                if (userGuess.charAt(0)== characters[i]){
                    userAnswer[i] = characters[i];
                    found = true;
                }
            
            }
            if (!found){
                lives--;
                System.out.println("incorrect letter!");
            }
            boolean done = true;
            for (int i = 0; i< userAnswer.length;i++){
                if (userAnswer [i] =='?'){
                    System.out.print(" _");
                    done = false;
                }
                else {
                    System.out.print(" " + userAnswer[i]);
                }
            }
            System.out.println("\n" + "Lives left: " + lives);
            drawHangman(lives);
            
            if(done){
                System.out.println("Congrats you have found the word");
                finished = true;
            }
            if(lives <=0){
                System.out.println("YOU HAVE DIED!");
                finished = true;
                
            }
           
       
     
        }
       
    }
  public static void drawHangman(int lives) {
        switch (lives) {
            case 6:
                System.out.println("|----------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 1:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            default:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
        }
  }
}
 
        
      
        
      
        
        
                
    
        
       
   
        
    
          
           
            
        
       
        
        
        
     
       
                
  