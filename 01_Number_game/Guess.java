import java.util.Scanner;
public class Guess {
      public static void main(String[] args) {
      int totattempt=0,correct=0;
      String k;
      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t|-----------------------------------------|");
      System.out.print("\n\t|<<<<<<<   Welcome to guess game   >>>>>>>|\n");
      System.out.println("\t|-----------------------------------------|");
      System.out.println("\nGuess the number between 0 - 100 within 5 attempts!!");
      do{
         int count=0,totlim=5,guessnum;
         int randomnum = (int)(Math.random()*100) + 1;
         totattempt++;
         while(totlim>0){
            count++;
            totlim--;
            System.out.print("* Guess the number -->> ");
            while(true){
               if(!sc.hasNextInt()){
                  String str = sc.next();
                  System.out.print("Invalid input!!\n\nEnter again -->> ");
               }
               else{
                  guessnum = sc.nextInt();
                  if(guessnum>=1 && guessnum<=100) break;
                  else  System.out.print("Invalid input!!\n\n* Enter between 1 - 100 -->> ");
               }  
            }
            if(randomnum==guessnum){
               correct++;
               System.out.println("\n\t>>\t Hurrah !!! Correct Guess.\t<<");
               System.out.print("\t>> You took "+count+" moves to guess the number.<<");
               break;
            }
            else if(randomnum>guessnum)   System.out.println("\nYour entered number is too ->'low'.");
            else  System.out.println("\nYour entered number is too ->'high'.");

            if(totlim>0){
               
               System.out.println(totlim+" moves left to you.\n");
            }
            else{
               System.out.println("\nBetter luck next time.");
            }
         }
         System.out.println("\n\t|-----------------------------------------|");
         System.out.println("\t\t   You scored "+correct+" out of "+totattempt+".");
         System.out.println("\t|-----------------------------------------|");
         System.out.print("\n* If u want to play again type y or Y else anything -->> ");
         k = sc.next();
      }while(k.toLowerCase().charAt(0)== 'y');
      sc.close();
    }
}