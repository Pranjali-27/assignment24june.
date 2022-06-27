import java.util.*;
class find_c
{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
    int C=0;
    int rem;
    
System.out.print("Enter no: ");
 int n =sc.nextInt();
  
System.out.println("Enter no.to find : ");
  int s =sc.nextInt();
    
     while(n!=0)
    {
    rem = n%10;

     if(rem==s)
     C++;
    
    n=n/10;
}
    if(C>0)

  System.out.println("count the no finding" +C);

else

  System.out.println("number is not found");
}
}

