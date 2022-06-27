import java.util.*;
class factorial_no
{
public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
     int n;
     int fact=1;
     System.out.println("Enter number: ");
      n =sc.nextInt();
       while(n<=1)
      {
        fact = fact*n;
       
         n++;
            
        }
          System.out.println("factorial of a number: " +fact);
       }
       
       }