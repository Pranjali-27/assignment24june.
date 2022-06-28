import java.util.*;
class fibonacci
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 
  int a=0; 
  int b=1;
 System.out.println("Enter the Number");
  int n=sc.nextInt();
System.out.println(a +"");
 System.out.println(b +"");
 int i=3;
int c;
           while(i<=n)
           {
             c=a+b;
System.out.println(c +" ");
              a=b;
              b=c;
        i++;
}
    
}
}