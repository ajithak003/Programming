package interviewProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import interviewProject.objectClass.Author;
import interviewProject.objectClass.Book;

public class DemoClass {
	
	

	public static void main(String[] args) {
		
		
		Map<String, Author> authors = new HashMap<>();
		 authors.put("Ajith",new Author("Ajith",1));
		 authors.put("Mani",new Author("Mani",2));
		 authors.put("Kumar",new Author("Kumar",3));
		 System.out.println("Author List :"+authors.toString());
	     List<Book> books = new CopyOnWriteArrayList<>();
		 
	     books.add(new Book(1,"velpari",List.of("Ajith","Mani")));
	     books.add(new Book(1,"ponniyin selvan",List.of("Mani","Kumar")));
	     books.add(new Book(1,"Thirukural",List.of("Ajith")));
	     books.add(new Book(1,"World of Economi",List.of("Mani")));
	     
	     System.out.println("Book List : "+books.toString());
	     
		  Scanner sc = new Scanner(System.in);

	     
	          //Add book
	     
			
				/*
				 * System.out.println("Kinldy enter book details.");
				 * System.out.println("1. Book Id"); int bookId = sc.nextInt(); sc.nextLine();
				 * // Consume the leftover newline character System.out.println("2. Book Name");
				 * String bookName = sc.nextLine(); System.out.println("3. Authors Names");
				 * String authorStr = sc.nextLine();
				 * 
				 * List<String> authorsList = List.of(authorStr.split(",")); Book addBook = new
				 * Book(bookId,bookName,authorsList); books.add(addBook);
				 * 
				 * Author addAuthor = null; for(String name : addBook.getAuthorName()) {
				 * addAuthor = new Author(name,addBook.getBookId());
				 * 
				 * if(!authors.containsKey(addAuthor.getAuthorName())) {
				 * authors.put(addAuthor.getAuthorName(),addAuthor);
				 * System.out.println("Newly Added Author Details :"+addAuthor); } }
				 * 
				 * System.out.println("Newly Added Book Details :"+books.get(books.indexOf(
				 * addBook))); System.out.println("Auther List : "+authors);
				 */
              //Delete Book
				/*
				 * System.out.println("Before delete book details : "+books);
				 * 
				 * System.out.println("Kindly mention deleted book name"); String
				 * deletedBookName = sc.nextLine();
				 * 
				 * for(Book book : books) {
				 * if(book.getBookName().equalsIgnoreCase(deletedBookName)) {
				 * books.remove(book); } }
				 * 
				 * System.out.println("After delete book details : "+books);
				 */

			  
		  //Search Book
		  System.out.println("Type your Book name");
		  String searchBookName = sc.next();
		  
		  for(Book book : books) {
			 if(book.getBookName().equalsIgnoreCase(searchBookName)) {
				 System.out.println("Book Id : "+book.getBookId());
				 System.out.println("Book name : "+book.getBookName());
				 
				Set<String> authornames = authors.keySet();

				for(String name :book.getAuthorName()) {
					if(authornames.contains(name)) {
						System.out.println("Author Id: "+authors.get(name).getAuthor());
						System.out.println("Author name: "+authors.get(name).getAuthorName());

					}
				}
				
			 }
		  }
		  
	}

	

}
