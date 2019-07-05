import java.util.Scanner;
 
class BubbleSort
{
  public static void main(String args[])
  {
    int n,c,d,swap,array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements to sort");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (int i= 0; i< n; i++)

      array[i] = in.nextInt();

for(int i=0;i<(n-1);i++)
{
 for (int j=0; j< n-i-1; j++)
{
if(array[j]>array[j+1])
{
swap=array[j];
array[j]=array[j+1];
array[j+1]=swap;
}
}
}
System.out.println(" The sorted ascending order is");
for(int i=0;i<n;i++)
{
System.out.print(array[i]);
}
}
}


  

    