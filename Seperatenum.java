import java.util.*;
class Seperatenum
{

         public static void main(String args[])
          {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Number : ");
           		int n = sc.nextInt();

			int p=56789, i, rem;
			i=p;

              while(i!=0)
              {
                 rem=i%10;

                    System.out.println("rem + ");
                 i=i/10;
               }
		}
}