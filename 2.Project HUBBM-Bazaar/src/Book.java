/**
 * This class is about the book from office supplies.This class holds the values and  methods of the book.
 * @author User
 *	
 */
public class Book extends OfficeSupplies {
    String publisherName;
    String author;
    int pageNumber;
    
    /**
     *  Class constructor without parameters.
     */
    public Book(){	
    }
    /**
     * Class constructor with parameter.
     * @param itemID This parameter gives the ID of book.
     * @param itemName This parameter gives the name of book
     * @param itemCost This parameter gives the cost of book
     * @param releaseDate This parameter gives the release date of book
     * @param publisherName This parameter gives the publisher name of book
     * @param coverTitle This parameter gives the cover title of book
     * @param author This parameter gives the author of book
     * @param pageNumber This parameter gives the page number of book
     */
    public Book(int itemID,String itemName, int itemCost, String releaseDate, String publisherName,
    			String coverTitle, String author, int pageNumber){
    	super.itemID= itemID;
        super.itemName = itemName;
        super.itemCost = itemCost;
        super.releaseDate = releaseDate;  
        this.publisherName = publisherName;
        this.coverTitle = coverTitle;
        this.author = author;
        this.pageNumber = pageNumber;
        
}
    /**
     *Publisher name  for getter method
	 *Publisher name the book.
     * @return The current value of book's publisher name.
     */
public String getPublisherName() {
    return publisherName;}
	/**
	 * Publisher name  for setter method
	 * Changes the publisher name of this book.
	 * @param publisherName  A new value for the publisher name.
	 */
public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;}
	/**
	 * Author for getter method
	 * Author the book
	 * @return The current value of book's author
	 */
public String getAuthor() {
    return author;}
	/**
	 * Author for setter method
	 * Changes the author of this book.
	 * @param author A new value for the author .
	 */
public void setAuthor(String author) {
    this.author = author;}
	/**
	 * Page number for getter method.
	 * Page number of the book.
	 * @return The current value of book's page number
	 */
public int getPageNumber() {
    return pageNumber;}
	/**
	 *  Page number for setter method.
	 *  Changes the page number of this book.
	 * @param pageNumber A new value for the page number.
	 */
public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;}
	/**
	 * This function creates to string method and given information about book's
	 */
public String toString(){
    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.releaseDate+" "+this.publisherName+" "+
    		this.coverTitle+" "+this.author+" "+this.pageNumber;}

}


