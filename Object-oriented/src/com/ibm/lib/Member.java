package com.ibm.lib;
/**
 * 
 * Members of library are described here
 * 
 * @author 002UOK744
 *
 */
public class Member {
	private String name;
	private Book book;
		
	public Member (String name) {
		this.name=name;
	}
	public String getName() {
		 return name;
    }
	  public void status() {
		  if(book==null)
			  System.out.println("No book issued by"+name);
		  else
			  System.out.println(name+"has issued"+book.getTitle());
	}
	  public Book getBook() {
		  return book;
	  }
	  public void setBook(Book book) {
		  this.book=book;
	  }
}

