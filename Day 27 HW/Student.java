import java.util.Scanner;
class Student
{
	
	String name;
	int rollno;
	int mark;
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NAME : ");
		String n=sc.nextLine();
		System.out.print("ENTER THE ROLLNO : ");
		int r=sc.nextInt();
		System.out.print("ENTER THE MARK : ");
		int m=sc.nextInt();
		Student s=new Student();
		s.name=n;
		s.rollno=r;
		s.mark=m;
		System.out.print(s.name+" "+s.rollno+" "+s.mark);
	}
	
}