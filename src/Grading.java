import java.util.Scanner;
public class Grading 
{
	String name;
	Integer roll;
	float mark1,mark2,mark3,tot,avg;
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		Grading g=new Grading();
		
		System.out.println("Enter name,roll,mark1-3:");
		g.name=i.next();
		//System.out.println("Enter roll Number");
		g.roll=i.nextInt();
		//System.out.println("Enter the make1");
		g.mark1=i.nextFloat();
		//System.out.println("Enter the make2");
		g.mark2=i.nextFloat();
		//System.out.println("Enter the make3");
		g.mark3=i.nextFloat();
		
		g.tot=g.mark1+g.mark2+g.mark3;
		g.avg=g.tot/3;
		if(g.avg>=80)
		{
			System.out.println("grade S  in class 1");
		}
		else if(g.avg>=75)
		{
			System.out.println("grade A  in class 2");
		}
		else if(g.avg>=60)
		{
			System.out.println("grade B  in class 3");
		}
		else
		{
			System.out.println("grade F  reexam");
		}
		System.out.println("Name: "+g.name);
		System.out.println("Roll: "+g.roll);
		System.out.println("Mark 1: "+g.mark1);
		System.out.println("Mark 2: "+g.mark2);
		System.out.println("Mark 3: "+g.mark3);
		System.out.println("Total: "+g.tot);
		System.out.println("Average: "+g.avg);
	}
	
	

}
