import java.util.Scanner;
 
class selectionsort
{
  public static void main(String args[])
  {
    int n,c,d,swap,position,array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements to sort");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (int i= 0; i< n; i++)

      array[i] = in.nextInt();
 
   for ( c = 0 ; c < ( n - 1 ) ; c++ )
   {
      position = c;
 
      for ( d = c + 1 ; d < n ; d++ )
      {
         if ( array[position] > array[d] )
            position = d;
      }
      if ( position != c )
      {
         swap = array[c];
         array[c] = array[position];
         array[position] = swap;
      }
   }
 
  System.out.println("Sorted list in ascending order:\n");
 
   for ( c = 0 ; c < n ; c++ )
   System.out.print(array[c]);
 

}
}
