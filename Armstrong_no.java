import java.util.*;
class Armstrong_no
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n,i;
int sum=0;
int rem;
   System.out.print("Enter number: ");
      n=sc.nextInt();
      i=n;
  while(i!=0)
{
  rem=i%10;
sum=sum+(rem*rem*rem);
i=i/10;
}
  if(sum==n)
{
System.out.println("number is Armstrong number");
} 
else
{
System.out.println("number is not Armstong number");
}
}
}