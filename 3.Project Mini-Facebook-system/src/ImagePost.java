/**
 * This class is image post inherit text post class
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

import java.util.ArrayList;
import java.util.UUID;

public class ImagePost extends TextPost {
	public String imageFileName;
	public String resolution;
	
	public void setImageFileName(String imageFileName){
		 this.imageFileName = imageFileName;}
	 
	public String getImageFileName(){ 
		 return this.imageFileName; }
	/**
	 * This method is constructor of the ImagePost class.
	 * @param text This parameter is image post's text
	 * @param position This parameter is image post's  location information
	 * @param taggedList This parameter is image post's  tag list
	 * @param imageFileName This parameter is image post's name
	 * @param resolution This parameter is image post's resolution
	 * @param ID This parameter is image post's  ID
	 */
	public ImagePost(String text,Location position ,ArrayList<User> taggedList,String imageFileName,String resolution, UUID ID){
		super(text, position, taggedList,ID);
		this.imageFileName= imageFileName;
		this.resolution = resolution;
	}
	/**
	 *  This function creates to string method and given information about image post's
	 */
	public String toString(){
	    return this.text+" "+this.position +" "+this.taggedList+" " + this.imageFileName + " " + this.resolution;}
}
