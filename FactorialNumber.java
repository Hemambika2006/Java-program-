import java.util.Scanner;
public class FactorialNumber {
        public static void main(String[] args) {
               Scanner scanner=new Scanner(System.in);

               System.out.println("enter first number:");
               int num1=scanner.nextInt();

               int factorial=1;
	       for (int i=1; i<=num1; i++) {
    		   factorial*=i;
               }    
                   System.out.println("the factorial of"+num1+"is"+factorial);
       
       }
}