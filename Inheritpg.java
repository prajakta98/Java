import java.lang.*;
import java.util.Scanner;
class Staff {
   String code, name, address;
       Staff (String nm, String c, String add )
 	{	
 	name = nm;
	code = c;
	address = add;
	}	

 void  display()
       {
 	System.out.println( "\n Name: " + name +"\n Staff Code: "+code+"\n Address: "+ address);
        }

	} //class Staff

class Teacher extends Staff {
 String sub, pub;
     Teacher (String nm, String c, String add, String su, String pb )
 	{   	
	super (nm, c, add); 
	sub  = su;	
	pub  = pb;
	
   	 }
 void  display()
{
	super.display();
	System.out.print( " Subject undertaken: "+ sub+ "\n Publisher of Book: "+pub);
	
}
} //class Teacher

class Officer extends Staff {
 String grade;
Officer (String nm, String c, String add, String gr )
 	{   	
 	super (nm, c, add); 
 	  grade  = gr;	
 	   }
 void  display()
	{
	super.display();
	System.out.print( "Grade of Staff "+ grade);
	
	}
	
}//class  officer

class Typist extends Staff {
float speed;
 Typist (String nm,  String cd, String add, float spd)
    	{ 
	 super (nm, cd, add); 
 	 speed=  spd;	
 	   }
 void  display()
	{
	super.display();
	System.out.print( "Speed of Typing: "+ speed);
	
	}

} //class Typist

class Regular extends Typist {
 double sal;
 Regular(String nm,  String cd, String add, float spd, double sl)
         {	  
	super (nm, cd, add, spd);
	sal= sl;
           }
	public void  display()
	{
	super.display();
	System.out.print( "The Salary of Regular Typist:  "+ sal);
	
	}

} //class Regular

class Casual extends Typist {
 double wages;
 Casual (String nm,  String cd, String add, float spd, double wg)
    	{  
	 super (nm, cd, add, spd);
 	wages = wg;	
 	   }
	public void  display()
	{
	super.display();
	System.out.print( "The Daily Wages  of Causal Typist:  "+ wages);
	
	}

  } //class Casual


 class Inheritpg {
public static void main(String arg[]) 
{
 Scanner br = new Scanner(System.in);
String code, name, address, sub, pub, grade;
float speed;
double wages, sal;
int value;
System.out.print("\n 1. Teacher \n 2. Reguar Typist \n 3. Casual Typist \n 4. Officer\n Enter yor Choice: ");
  value = Integer.parseInt();

	System.out.print("Enter Name: ");
 	name = br.nextLine();
	System.out.print("Enter Staff Code: ");
	code = br.nextLine();
	System.out.print("Enter Address: ");
	address = br.nextLine(); 
 switch (value)
{
case 1:
      {	
	System.out.print("Enter Subject: ");
	sub  = br.nextLine();	
	System.out.print("Enter publisher: ");
	pub  = br.nextLine();
	Teacher t= new Teacher(name, code, address, sub, pub);
	
	t.display();
	break;
     }

case 2:
 	{	 
	System.out.print("Enter Speed of typing: ");
	speed = Float.parseFloat(); 
	System.out.print("Enter the Salary of Regular Typist: ");
	sal  =  Double.parseDouble();	

	Regular r= new Regular(name, code, address, speed, sal);
	
	r.display();
	break;

    }

case 3:
{	 
	System.out.print("Enter Speed of typing: ");
	speed = Float.parseFloat(); 
	System.out.print("Enter the Daily Wages  of Causal Typist: ");
	wages =  Float.parseFloat();
	 
	Casual c= new Casual(name, code, address, speed, wages);
	
	c.display();
	break;
}
case 4:
{ 	System.out.print("Enter the Grade: A/ B/ C : ");
	grade  = br.nextLine();

	Officer o= new Officer(name, code, address, grade);
	
	o.display();
	break;
}
}// Switch
}//main
}//class Inherit
