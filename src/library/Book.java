/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author melda_000
 */
public class Book{
	private String callNo; 
	private String bookName;
	private String author;
	private String publisher;
	private int quantity;
        private int issued;
	private String issueDate;
        private String addDate;
        private String ID;
        private String returnDate;
	
        public Book(String ID,String callNo, String bookName, String author, String publisher, int quantity,int issued ,String addDate){
	this.ID=ID;
        this.callNo=callNo;
	this.bookName=bookName;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
        this.issued=issued;
        this.addDate=addDate;
    
	}
        public Book(){
            
        }
	public void printBook() {
		System.out.println(callNo + " " + bookName+ " " + author + " " + publisher + " "+ quantity);
	}
	
	public String getCallNo() {
		return callNo;
	}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public void issueBook(){
        quantity--;
        issued++;
    }

    public int getIssued() {
        return issued;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getID() {
        return ID;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    public void returnBook(){
        quantity++;
        issued--;
    }
    public void addQuantity(int quantity){
        this.quantity =  this.quantity + quantity;
        
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
	
	
}
	

