import java.text.DecimalFormat;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        int totsub;
        double totmark=0,avg;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of Subject --->> ");
        while(true){
            if(!sc.hasNextInt()){
                System.out.print("Invalid total number of subject !!.\n\nEnter again a integer value -->> ");
                String str = sc.next();
            }
            else{
                totsub = sc.nextInt();
                break;
            }
        }
        for(int i=0;i<totsub;i++){
            System.out.print("Enter marks of "+(i+1)+" no subject --->> ");
            while(true){
                if(sc.hasNextDouble()){
                    double sub = sc.nextDouble();
                    if(sub>=0 && sub<=100){
                        totmark +=sub;
                        break;
                    }
                    else    System.out.print("\nInvalid number !!\n\nEnter between 0 to 100 --->> ");
                }
                else{
                    String str = sc.next();
                    System.out.print("Invalid !!\n\nEnter a integer value --->> ");
                }
            }
        }
        avg = (totmark/totsub);
        if(avg>90 && avg<=100) grade = "O";
        else if(avg>80 && avg<=90) grade = "A+";
        else if(avg>70 && avg<=80) grade = "A";
        else if(avg>60 && avg<=70) grade = "B+";
        else if(avg>50 && avg<=60) grade = "B";
        else if(avg>40 && avg<=50) grade = "C+";
        else grade = "D";
        System.out.println("\nYou got  "+totmark+" out of "+(totsub*100)+".\nAverage percentage is "+df.format(avg)+"%\nGrade is : "+grade);
        sc.close();
    }
}