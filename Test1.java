import java.util.*;
class Test
{
private String name;
private String idnum;
private int age;
public int getage()
{
return age;
}
public String getidnum()
{
return idnum;
}
public String getname()
{
return name;
}
public void setage(int newage)
{
age=newage;
}
public void setname(String newname)
{
name=newname;
}
public void setidnum(String newidnum)
{
idnum=newidnum;
}
}
class Test1
{
public static void main(String[] args)
{
Test obj=new Test();
obj.setage(25);
obj.setname("abcd");
obj.setidnum("12345");
System.out.println("Student Age:"+obj.getage());
System.out.println("Student Name:"+obj.getname());
System.out.println("Student IdNum:"+obj.getidnum());
}
}
