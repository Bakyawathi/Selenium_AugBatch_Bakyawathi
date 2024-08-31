package week2.assignment;

public class Library {
	public String addBook(String bookTitle)
	{
		System.out.println("Book " +bookTitle +" added successfully");
		return bookTitle;
	
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library L1 = new Library();
		
		L1.addBook("Ponniyin Selvan");
		L1.issueBook();

	}

}

