import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        int totsub,sub1;
        double totmark=0,avg,sub;
        String grade,str;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter the total no of Subject --->> ");
            if(sc.hasNextInt()){
                totsub = sc.nextInt();
                break;
            }
            else{
                System.out.println("Invalid total number of subject !!.\nEnter again a integer value !!!\n");
                str = sc.nextLine();
            }
        }

        for(int i=0;i<totsub;i++){
            while(true){
                System.out.print("Enter marks of "+(i+1)+" no subject --->> ");
                if(sc.hasNextDouble()){
                    sub = sc.nextDouble();
                    if(checkrange(sub)){
                        totmark +=sub;
                        break;
                    }
                    else{
                        System.out.println("\nInvalid !!\nEnter between 0 to 100 !!\n");
                        str = sc.nextLine();
                    }
                }
                else{
                    str = sc.nextLine();
                    System.out.println("Invalid !!\nEnter a integer value!!\n");
                    
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

        System.out.println("\nYou got  "+totmark+" out of "+(totsub*100)+".\nAverage percentage is "+avg+"%\nGrade is : "+grade);
        sc.close();
    }
    private static boolean checkrange(double k){
        if(k>=0 && k<=100)  return true;
        return false;
    }
}


/*

------------------  TASK 2  STUDENT GRADE CALCULATOR  ------------------------------
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
    average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user


 */