import java.util.*;
class sumofevenodd
{
public static void main(String []args)
{
          long n=34567834;
           long rem= 0;
          long i=n; 
          long sum=0;
          long evens=0;
          long odds=0;
          while(i!=0)
            {
           rem=i%10;

          if(rem%2==0)
          {
          evens=evens+rem;
         System.out.print("rem");
            }
           else

        odds=odds+rem;
           
         i=i/10;

         sum=sum+rem;

       }
        System.out.println("sum of even no="  +evens);
        System.out.println("sum of odd no="   +odds);
        System.out.println("sum of number= "  +sum);
        System.out.println("value of i=  "     +i);
}
}


ouput:



C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>javac sumofevenodd.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>java sumofevenodd
remremremremsum of even no=22
sum of odd no=18
sum of number= 40
value of i=  0

C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>