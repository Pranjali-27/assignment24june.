import java.util.*;
class sumofnumbers
{
public static void main(String[]args)
{
long a=34567834;
long reminder=0;
long i=a;
long sum=0;
       while(i!=0)
       {
           reminder=i%10;
       System.out.print("The number is =34567834");
       System.out.println("reminder ");
       i=i/10;
       sum=sum+reminder;

        }
          System.out.println("The sum is="+sum);
          System.out.println(" the value of i="+i);

}
}

