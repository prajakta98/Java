import java.util.*;
class SWAP
{
public static void main(String args[])
{
String str1,str2,t;
str1=(args[0]);
str2=(args[1]);
System.out.println("before swapping str1 is"+str1);
System.out.println("before swapping str2 is"+str2);
t=str1;
str1=str2;
str2=t;
System.out.println("after swapping str1 is"+str1);
System.out.println("after swapping str2 is"+str2);
}
}