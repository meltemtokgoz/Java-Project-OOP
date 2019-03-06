/**
 * This class is text post inherit abstract post class
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */
import java.util.ArrayList;
import java.util.UUID;


public class TextPost extends Post{
	/**
	 * This method is constructor of the TextPost class.
	 * @param text This parameter is text post's text
	 * @param position This parameter is text post's location
	 * @param taggedList This parameter is text post's tag list
	 * @param ID This parameter is text post's ID
	 */
	public TextPost(String text,Location position ,ArrayList<User> taggedList, UUID ID){
		super(text, position,taggedList, ID);
	}
	/**
	 * This function shows post's tag list list with give post parameter
	 * 
	 */
	public void ShowTaggedUsers(Post p){
		for(User u: p.getTaggedList()){
			System.out.print(u.getUserName());
		}
	}
	/**
	 * This function shows post location information with give post parameter
	 */
	public void ShowPostLocation(Post p){
		System.out.println(p.getLocation());
	}
	/**
	 * This function creates to string method and given information about text post's
	 */
	public String toString(){
	    return this.text+" "+this.position +" "+this.taggedList;}
}
