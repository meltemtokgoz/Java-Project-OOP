import java.util.ArrayList;
import java.util.UUID;

/**
 * This class is video post inherit text post class
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

public class VideoPost extends TextPost {
	public int maxvideolength; 
	public String videoFileName;
	
	/**
	 * This method is constructor of the VideoPost class.
	 * @param text This parameter is video post's text
	 * @param position  This parameter is video post's location information
	 * @param taggedList  This parameter is video post's tag list 
	 * @param videoFileName  This parameter is video post's name
	 * @param maxvideolength  This parameter is video post's length
	 * @param ID  This parameter is video post's ID
	 */
	public VideoPost(String text,Location position ,ArrayList<User> taggedList,String videoFileName,int maxvideolength, UUID ID){
		super(text, position, taggedList,ID);
		this.videoFileName = videoFileName;
		this.maxvideolength = maxvideolength;
	}
	/**
	 * This function creates to string method and given information about video post's
	 */
	public String toString(){
	    return this.text+" "+this.position +" "+this.taggedList+" " + this.videoFileName + " " + this.maxvideolength;}
}
