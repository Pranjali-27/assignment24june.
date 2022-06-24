import java.util.*;

class Yearofintrest3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Principle Amount : ");
double A = sc.nextDouble();
System.out.print("Enter Rate of Interest : ");
double R = sc.nextDouble();
double T = 5;
int n = 1;
while(n<=3)
{
if(n==1)
{
System.out.println(" 1 Year  :");
double sn = (A*R*1)/100;
System.out.println(" Amount is = " +A);
System.out.println("Rate is= " +R);
System.out.println("Time is = " +T);
System.out.println("Interest is = " +sn);
double pay = A+sn;
System.out.println(" Total payable amount = " +pay);
				
}

else if(n==2)
{
System.out.println("2 Year :");
double sn = (A*R*2)/100;
System.out.println(" Amount is = " +A);
System.out.println("Rate is = " +R);
System.out.println("Time is = " +T);
System.out.println("Interest is = " +sn);
double pay = A+sn;
System.out.println("Total payable amount = " +pay);

}	
	
else if(n==3 )
{
System.out.println("3 Year :");
double sn = (A*R*3)/100;
System.out.println(" Amount is = " +A);
System.out.println("Rate  is = " +R);
System.out.println("Time is = " +T);
System.out.println("Interest is = " +sn);
double pay = A+sn;
System.out.println("Total payable amount = "+pay);
}
n++;
}
}
}


C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>javac Yearofintrest3.jav
a

C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>java Yearofintrest3.java

Enter Principle Amount : 5000
Enter Rate of Interest : 4
 1 Year  :
 Amount is = 5000.0
Rate is= 4.0
Time is = 5.0
Interest is = 200.0
 Total payable amount = 5200.0
2 Year :
 Amount is = 5000.0
Rate is = 4.0
Time is = 5.0
Interest is = 400.0
Total payable amount = 5400.0
3 Year :
 Amount is = 5000.0
Rate  is = 4.0
Time is = 5.0
Interest is = 600.0
Total payable amount = 5600.0

C:\Users\AT SYSTEMS\SkyDrive\Documents\24juneassignment>