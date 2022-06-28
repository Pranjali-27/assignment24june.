import java.util.*;
class HCF
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 int i;
 int hf=0;
 System.out.println("Enter first Number");
  int a=sc.nextInt();
System.out.println("Enter second Number");
 int b=sc.nextInt();
System.out.println("Enter Third Number");
 int c=sc.nextInt();


      i=1;
      while(i<=a || i<b || i<c)
{
   if(a%i==0 && b%i==0 && c%i==0)
     hf=i;
  i++;
}
System.out.println("HCF of three number is:"+hf);
}
}