/**
 * This class is User Collection
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class UserCollection {
	public static List<User> userList = new ArrayList<User>();
	/**
	 * This UserCollection class constructor without parameter  
	 */
	public UserCollection(){
	}
	
	/**
	 * This function adds new user in mini Facebook system.
	 * @param name
	 * 			This parameter the name of the new user to add
	 * @param username
	 * 			This parameter the username of the new user to add
	 * @param password
	 * 			This parameter the password of the new user to add
	 * @param dateOfBirth
	 * 			This parameter the date of birth of the new user to add
	 * @param schoolGraduated
	 * 			This parameter the school graduated name of the new user to add
	 * @param userList
	 * 			This parameter user array list
	 * @param userID
	 * 			This parameter the user ID of the new user to add
	 * @return If this function correct works, this function returns true.
	 * 			 
	 */
	public static boolean addUser(String name,String username,String password,Date dateOfBirth,String schoolGraduated,
			                      List<User> userList, int userID){
		 
		Main.userID++;
		User newUser = new User(name, username,  password, dateOfBirth , schoolGraduated, Main.userID,
								User.friendList, User.blockList , User.videopostList, User.imagepostList, User.textpostList,
								User.postList);
		userList.add(newUser);
		return true;}
	
	/**
	 * This function removes user in mini Facebook system.
	 * @param userID
	 * 			This parameter the user ID of the new user to remove
	 * @param userList
	 * 			This parameter user array list
	 * @return This function returns true.
	 */
	public static boolean removeUser(int userID, List<User> userList){
		boolean founduser = false;
		User usr = null;
		for(User u: userList){
    		if( userID == u.getUserID() ){
    			usr = u;
    			founduser = true;
    			System.out.println("User has been successfully removed.");}}
    			userList.remove(usr);
    		if(!founduser){
				System.out.println("No such user!");
				return false;}
		return true;}
	
	/**
	 * This function sign in user with user name and password in mini Facebook system 
	 * @param username
	 * 				This parameter shows the username of the user to sign in
	 * @param password
	 * 				This parameter shows the password of the user to sign in
	 * @param userList
	 * 			This parameter user array list
	 * @return This function returns true.
	 */
	public static boolean signIn(String username, String password, List<User> userList){
		boolean founduser = false;
		for(User u: userList){
    		if( username.equals(u.getUserName())){
    			if(password.equals(u.getPassword())){
    				System.out.println("You have successfully signed in.");
    				u.SignIn(u);}
    			if(! password.equals(u.getPassword())){
    				System.out.println("Invalid username or password! Please try again.");}
    				founduser = true;}}
			if(!founduser){
				System.out.println("No such user!");
				return false;}
		return true;		
	}
	/**
	 * This function show post user in username
	 * @param username
	 * 				This parameter shows the username of the user to show post
	 * @return This function returns true.
	 */
	public static boolean showPost(String username){
		for(User u : userList){
			if(username.equals(u.getUserName())){
				System.out.println("**************\n"+u.getUserName()+"'s Posts"+"\n**************");
				for(TextPost p: u.getTextPostList()){
					System.out.println(p.getText()+"\nDate: "+p.getDate()+"\nLocation: ");
					p.ShowPostLocation(p);
					System.out.println("Friends tagged in this post: ");
				p.ShowTaggedUsers(p);
				System.out.println("\n----------------------");}
				for(ImagePost p: u.getImagePostList()){
					System.out.println(p.getText()+"\nDate: "+p.getDate()+"\nLocation: ");
					p.ShowPostLocation(p);
					System.out.println("Friends tagged in this post: ");
					p.ShowTaggedUsers(p);
					System.out.println("\nImage: "+p.getImageFileName()+"\nImage resolution: "+p.resolution+"\n----------------------");}
				for(VideoPost p: u.getVideoPostList()){
					System.out.println(p.getText()+"\nDate: "+p.getDate()+"\nLocation: ");
					p.ShowPostLocation(p);
					System.out.println("Friends tagged in this post: ");
					p.ShowTaggedUsers(p);
			System.out.println("\nVideo: "+p.videoFileName+"\nVideo duration: "+p.maxvideolength+" minutes");}}
		}
		return true;
	}
	
}
