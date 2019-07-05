import java.util.*;
import java.lang.*;
class Roots
{
public static void main(String args[])
{
Roots X=new Roots();
X.Test();
}
void Test()
{
System.out.println("quadratic equation ax^2+bx+c=0.enter a,b,c");
Scanner S=new Scanner(System.in);
int a=S.nextInt();
int b=S.nextInt();
int c=S.nextInt();
double Y=((b*b)-4*a*c);
if(Y==0)
{
System.out.println("Roots are real and unequal");
double Z=-b/(2*a);
System.out.println("Roots are"+Z);
}
else if(Y>0)
{
System.out.println("Roots are real and unequal");
double d=Math.sqrt(((b*b)-4*a*c));
double Z1=((-b+d)/(2*a));
double Z2=((-b-d)/(2*a));
System.out.println("Roots"+Z1);
System.out.println("Roots"+Z2);
}
else if(Y<0)
{
System.out.println("Roots are not real and unequal");
double d=Math.sqrt(-((b*b)-4*a*c));
double P=(-b/(2*a));
double Q=(d/(2*a));
System.out.println("Roots"+P+"+i"+Q);
System.out.println("Roots"+P+"-i"+Q);
}
}
}