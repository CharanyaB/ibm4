package com.ibm.lib;
/**Book details
 * 
 * @author 002UOK744
 *
 */
public class Book {
	private String title;
	private Member mbr;
	
	public Book (String title) {
		this.title=title;
	}
	public String getTitle() {
	return title;
	}
	public void status() {
	if(mbr==null)
		System.out.println(title+"is not issued to any member");
	else
		System.out.println(title+"is issued to"+mbr.getName());
     }
	public void issueBook(Member m) {
	}
	public void returnBook(Member m) {
	}
}

