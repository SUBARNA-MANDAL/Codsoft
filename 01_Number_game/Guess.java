import java.util.Scanner;
public class Guess {
      public static void main(String[] args) {
      int totattempt=0,correct=0;
      String k;
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to guess game!!!\nGuess a number between 0 - 100 within "+totattempt+"attempts!!");
      do{
         int count=0,totlim=5,guessnum;
         int randomnum = (int)(Math.random()*100) + 1;
         totattempt++;
         while(totlim>0){
            count++;
            totlim--;
            System.out.print("Guess a number -->> ");
            while(true){
               if(!sc.hasNextInt()){
                  String str = sc.next();
                  System.out.print("Invalid input!!\n\nEnter again -->> ");
               }
               else{
                  guessnum = sc.nextInt();
                  if(guessnum>=1 && guessnum<=100) break;
                  else  System.out.print("Invalid input!!\n\nEnter between 1 - 100 -->> ");
               }  
            }
            if(randomnum==guessnum){
               correct++;
               System.out.println("Hurrah !!! Correct Answer.");
               System.out.println("You took "+count+" moves to guess the number.");
               break;
            }
            else if(randomnum>guessnum)   System.out.print("\nYour entered number is too low.\n");
            else  System.out.print("\nYour entered number is too high.\n");

            if(totlim>0){
               System.out.println(totlim+" moves left to you.");
               System.out.println("Try again.\n");
            }
            else{
               System.out.println("\nBetter luck next time.");
            }
         }
         System.out.println("\n      *** You scored "+correct+" out of "+totattempt+". ***");
         System.out.print("\nIf u want to play again type y or Y else anything -->> ");
         k = sc.next();
      }while(k.toLowerCase().charAt(0)== 'y');
      sc.close();
    }
}