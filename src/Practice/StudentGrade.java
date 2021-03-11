package Practice;
import java.util.Scanner;

public class StudentGrade {
	
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();
		
		studentGrade(english, chemistry, computers, physics, maths);	
	}	
	public static void studentGrade(int eng, int chem, int com, int phy, int math)
	{
		float TotalMarks, Percentage;
		
		TotalMarks = eng + chem + com + phy + math;
	    Percentage = (TotalMarks / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + TotalMarks);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
  
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}

