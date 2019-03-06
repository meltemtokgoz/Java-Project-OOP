/**
 * 
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public abstract class  Post implements PostInterface{

	public String text;
	public Date date;
	public static ArrayList<User> taggedList = new ArrayList<User>();
	public UUID ID;
	public UUID randomUUID(){
		return ID;}
	public Location position;

	
	public void setText(String iText){
		 this.text = iText;}
	 
	public String getText(){ 
		 return this.text; }
	 
	public Date getDate(){
		 return this.date;}
	 
	public Location getLocation(){ 
		 return this.position; }
	 
	public void setLocation(Location position){
		 this.position = position;}
	 
	public  ArrayList<User> getTaggedList() {
	    return taggedList ;}
	
	public void setTaggedListAdd(User k) {
		   Post.taggedList.add(k);}
	
	public UUID getID(){ 
		 return this.ID;}
	 
	/**
	 * 
	 * @param text This parameter is post's text
	 * @param position This parameter is post's location
	 * @param taggedList This parameter is post's tag list
	 * @param ID This parameter is post's ID
	 */
	public Post(String text ,Location position ,ArrayList<User> taggedList, UUID ID){
		this.ID = randomUUID();
		this.text = text;
		this.position= position;
		Post.taggedList= taggedList;
	}
	/**
	 * 
	 * @param p post acting
	 */
	public abstract void ShowTaggedUsers(Post p);
	/**
	 * 
	 * @param p post acting
	 */
	public abstract void ShowPostLocation(Post p);
	
}
