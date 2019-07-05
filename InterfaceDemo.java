 /* W.A.P to display Volume of Sphere & Hemisphere.

    Make use of interface to define the template of methods
    to be there in the derived classes. 
 */
 
 import java.util.*;

 interface Base
 {
   public void read(float x);
   public void calculate();
   public void display();
 }

 class Sphere implements Base
 {
   protected float r,vol;

   public void read(float x)
   {
    r=x;
   }

   public void calculate()
   {
    vol=3.14f*r*r*r*4/3;
   }

   public void display()
   {
    System.out.println("Volume="+vol);
   }
 }

 class Hemisphere implements Base
 {
  protected float r,vol;

  public void read(float x)
  {
   r=x;
  } 

  public void calculate()
  {
   vol=3.14f*r*r*r*2/3;
  }

  public void display()
  {
   System.out.println("Volume="+vol);
  }
 }

 class InterfaceDemo
 {
  public static void main (String args[]) 
  {
  float x;
  Scanner sc = new Scanner (System.in);

  System.out.println("Enter the radius:");
  x=sc.nextFloat();

  Sphere s=new Sphere();
  s.read(x);
  s.calculate();
  System.out.println("Sphere:");
  s.display();

  Hemisphere h=new Hemisphere();
  h.read(x);
  h.calculate();
  System.out.println("Hemisphere:");
  h.display();
}
}
