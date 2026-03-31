import java.util.Scanner;
import java.util.ArrayList;
class Library
{
	int bookid;
	String title;
	String author;
	boolean available;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Library> l=new ArrayList<>();
		boolean res=true;
		do
		{
			System.out.println("----------------------------------");
			System.out.println("           LIBRARY MENU           ");
			System.out.println("----------------------------------");
            System.out.println("1. ADD BOOK");
            System.out.println("2. DISPLAY BOOKS");
            System.out.println("3. BORROW BOOKS");
            System.out.println("4. RETURN BOOKS");
            System.out.println("5. EXIT");
            System.out.print("ENTER OPTION: ");
            int op = sc.nextInt();
			if(op==1)
			{
				System.out.print("ENTER THE BOOK ID :");
				int id=sc.nextInt();
				System.out.print("ENTER THE BOOK TITILE :");
				String title=sc.nextLine();
				System.out.print("ENTER THE AUTHOR NAME : ");
				String author=sc.nextLine();
				l.add(new Library(id, title, author));
				System.out.println("BOOK DETAILS ADDED SUCCESSFULLY");
			}
			else if(op==2)
			{
				if(l.isEmpty())
				{
					System.out.println("NO BOOK AVAILABLE");
				}
				else
				{
					for(Library b : l)
						b.display();
				}
			}
			else if(op==3)
			{
				System.out.print("ENTER THE BOOK ID TO  BORROW : ");
				int borrowId=sc.nextInt();
				boolean foundBorrow=false;
				for(Library b : l)
				{
					if(b.bookid==borrowId)
					{
						b.borrowBook();
						foundBorrow =true;
					}
				}
				if(!foundBorrow)
				{
					System.out.println("BOOK IS NOT FOUND");
				}
			}
			else if(op==4)
			{
				System.out.print("ENTER THE BOOK ID TO RETURN : ");
				int returnId=sc.nextInt();
				boolean foundReturn = false;
				for(Library b:l)
				{
					if(b.bookid==returnId)
					{
						b.returnBook();
						foundReturn=true;
					}
				}
				if(!foundReturn)
				{
					System.out.println("BOOK IS NOT FOUND");
				}
			}
			else
			{
				res=false;
			}
		}while(res);
	}
	Library(int bookid,String title,String author)
	{
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.available=true;	
	}
	void display()
	{
		System.out.println("ID : "+bookid);
		System.out.println("TITILE : "+title);
		System.out.println("AUTHOR : "+author);
		System.out.println("AVAILABLE : "+(available ? "AVAILABLE":"BORROWED"));
	}
	void borrowBook()
	{
		if(available)
		{
			available=false;
			System.out.println("BOOK BORROWED SUCCESSFULLY");
		}
		else
		{
			System.out.println("BOOK IF ALREADY BORROWED ");
		}
	}
	void returnBook()
	{
		if(!available)
		{
			available=true;
			System.out.println("BOOK RETURNED SUCCESSFULLY");
		}
		else
		{
			System.out.println("BOOK IS ALREADY RETURNED");
		}
	}
}