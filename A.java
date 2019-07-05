import java.util.*;
class Test
{
void test()
{
System.out.print("no parameters");
}
void test(int a)
{
System.out.print("a is"+a);
}
void test(int a,int b)
{
System.out.print("a and b is"+a+"+b");
}
double test(double a)
{
System.out.print("a is"+a);
return a;
}
}
class A
{
public static void main(String args[])
{
Test q=new Test();
q.test();
q.test(10);
q.test(10,20);
double d=q.test(10.0);
System.out.print("d is"+a);
}
}