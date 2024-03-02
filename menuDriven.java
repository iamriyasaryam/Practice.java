import java.util.*;
public class menuDriven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter your marks out of 100");
            int marks = sc.nextInt();
            if(marks>=90){
               System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }
            else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
             }
            else{
                System.out.println("INVALID");
            }
                System.out.println("You want to continue ? enter 1 other wise enter 0");
                n = sc.nextInt();
        } while(n==1);
        
    
        
    }
}
