class Room{
int length;
int breadth;
Room(intx,int y)

{
length=x;
breadth=y;}
int area()
{
return(length*breadth);
}}
class Bedroom extends Room
{
int height;
Bedroom( intx,inty,int z)
{
super(x,y);
height=z;
}
int volume()
{
return(length*breadth*height);
}}
class Single
{
public static void main(String args[] )
{
Bedroom room1 = new Bedroom(14,12,10);
int area=room1.area();
int volume=room1.volume();
System.out.println(&quot;Area=&quot;+area);
System.out.println(&quot;Volume=&quot;+volume);
}
}