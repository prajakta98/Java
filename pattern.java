import java.util.*;
class pattern
{
public static void main(String args[])
 {
int i,n,j;
char x='A';
System.out.println("enter no. of rows");
Scanner x=new Scanner(System.in);
n=x.nextInt();
  {
for(i=1;i<=n;i++)
   {
for(j=1;j<=i;j++)
    {
System.out.print(x);
x++;
    }
System.out.println(" ");
}
x='A';
}
}
}
