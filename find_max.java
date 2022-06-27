import java.util.*;
class find_max
{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
   System.out.print("Enter no:");
    int n=sc.nextInt();
    int k=0;
    int rem=0;
    

        while(n!=0)
         {
          rem = n%10;
            if(rem>k)
             { 
          k=rem;
         n=n/10;
}
  System.out.println("maximum no is :"+k);
}
}
}