import java.util.*;
class palindrome
{
public static void main(String[] args)
{
 Scanner sc =new Scanner(System.in);
   
   int rm,rev=0;
     System.out.print("Enter 4 digit number : ");
 int n=sc.nextInt();
   int i=n;
    while(i!=0)
     {
  
    rm=i%10;

    rev=rev*10+rm;
i=i/10;
}
  if(n==rev)
   System.out.println(" number is palindrome");
    else
      System.out.println(" number is not a palindrome");
}
}
