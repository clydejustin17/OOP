
public class Main
{
	public static void main(String[] args) {
	 Student student1 = new Student();
	 student1.setId(342);
	 student1.setname("Azuria");
	 
	 System.out.println("Student Id: " + student1.getId());
	 	 System.out.println("Student Id: " + student1.getname());
	 	 
	 Book book1 = new Book();
	 book1.setbooknumber(1);
	 book1.setTitle("Blood, Sweat, and Pixels: The Triumphant");
	 book1.setname("Jason Schreier");
	 book1.setprice( 800.00f);
	 
	 System.out.println("Book number: " + book1.getBookNumber());
	 	 System.out.println("Book Title: " + book1.getTitle());
	 	 System.out.println("Author: " + book1.getAuthor());
	 	 	 	 System.out.println("Book Price: " + book1.getPrice());
	}
}

 
     

