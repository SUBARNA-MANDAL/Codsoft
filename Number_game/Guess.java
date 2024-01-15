import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
      int guessnum,randomnum,count=0,totlim=5,totattempt=0,correct=0;
      char k='y';
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to guess game!!!");
      do{
         randomnum = (int)(Math.random()*100);
         totattempt++;
         while(totlim>0){
            count++;
            totlim--;
            System.out.print("Guess a number : ");
            guessnum = sc.nextInt();

            if(randomnum==guessnum){
               correct++;
               System.out.println("Hurrah !!! Correct Answer.");
               System.out.println("You took "+count+" moves to guess the number.");
               break;
            }
            else if(randomnum>guessnum)   System.out.print("Your entered number is too low.\n");
            else  System.out.print("Your entered number is too high.\n");
            
            if(totlim>=1){
               System.out.println(totlim+" moves left to you.");
               System.out.println("Try again.You can ...\n");
            }
            else{
               System.out.println("\nBetter luck next time.");
            }
         }

         count=0;
         totlim=5;
         System.out.println("\n      *** You scored "+correct+" out of "+totattempt+". ***");
         System.out.print("\nIf u want to play again type y else anything : ");
         k = sc.next().charAt(0);
         System.out.println("");
      }while(k=='y');
      sc.close();

    }
}



/*

1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
   is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
   You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

*/