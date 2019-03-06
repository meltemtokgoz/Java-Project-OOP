/**
 * This class is user class
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class User {
	public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static ArrayList<User> friendList = new ArrayList<User>();
	public static ArrayList<User> blockList = new ArrayList<User>();
	public static ArrayList<Post> postList = new ArrayList<Post>();
	public static ArrayList<VideoPost> videopostList = new ArrayList<VideoPost>();
	public static ArrayList<ImagePost> imagepostList = new ArrayList<ImagePost>();
	public static ArrayList<TextPost> textpostList = new ArrayList<TextPost>();
	public static int totalNumberOfUsers;
	public final int USER_ID;
	private String password;
	private String name;
	private String username; 
	private Date date;
	private String schoolGraduated;
	private Date lastLogin;
	public boolean signedIn;
	
	/**
	 * @return The current value of user's ID
	 */
	public  int getUserID() {
	    return USER_ID;}
	
	/**
	 * This method accesses to the user password.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;}
	
	/**
	 * This method assigns new password to the user.
	 * 
	 * @param password
	 *            user password
	 */
	public void setPassword(String password) {
		this.password = password;}
	
	/**
	 * 
	 * @param name userName A new value for the user's name
	 */
	public void setName(String name) {
		this.name = name;}
	
	/**
	 * 
	 * @return The current value of  user name 
	 */
	public String getName() {
	    return name;}
		
	/**
	 * This method accesses the user name.
	 * 
	 * @return user name
	 */
	public String getUserName() {
		return username;}
	
	/**
	 * This method assigns new user username to the User.
	 * @param username  userName A new value for the user's name
	 */
	public void setUserName(String username) {
		this.username = username;}
		
	/**
	 * This method accesses the user birth date.
	 * 
	 * @return user birth date
	 */
	public Date getDate() {
		return date;}

	/**
	 * This method assigns new user birth date.
	 * @param date  user's birth date
	 */
	public void setDate(Date date) {
		this.date = date;}
	
	/**
	 * This method accesses the user school graduated name.
	 * 
	 * @return user school graduated name
	 */
	public String getSchoolGraduated() {
		return schoolGraduated;}

	/**
	 * This method assigns new user school graduated to the User.
	 * @param schoolGraduated school graduated name
	 */
	public void setSchoolGraduated(String schoolGraduated) {
		this.schoolGraduated = schoolGraduated;}
	
	/**
	 * This method accesses the user last login
	 * 
	 * @return user last login
	 */
	public Date getLatLogin() {
		return  lastLogin;}

	/**
	 * This method assigns new user last login
	 * @param lastLogin  user last login
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin =  lastLogin;}
	
	/**
	 * This method accesses the user signed in
	 * 
	 * @return user signed in
	 */
	public boolean getSignedIn() {
		return  signedIn;}
		
	/**
	 * 
	 * @param signedIn user sign in boolean
	 */
	public void setLastLogin(boolean  signedIn) {
		this. signedIn =  signedIn;}
	
	/**
	 * 
	 * @return User friendList arraylist
	 */
	public  ArrayList<User> getFriendList() {
	    return friendList ;}
	
	/**
	 * 
	 * @param k user to add to the friendlist
	 */
	public void setFriendList(User k) {
		   User.friendList.add(k);}
	/**
	 * 
	 * @return blocklist arraylist
	 */
	public  ArrayList<User> getBlockList() {
	    return blockList ;}
	/**
	 * 
	 * @param k user to add to the blocklist
	 */
	public void setBlockList(User k) {
		   User.blockList.add(k);}
	
	/**
	 * 
	 * @return videopost arraylist
	 */
	public  ArrayList<VideoPost> getVideoPostList() {
	    return videopostList ;}
	/**
	 * 
	 * @param p post to add to the video post list
	 */
	public void setVideoPostList(VideoPost p) {
		   User.videopostList.add(p);}
	/**
	 * 
	 * @param p post to add to the image post list
	 */
	public void setImagePostList(ImagePost p) {
		   User.imagepostList.add(p);}
	/**
	 * 
	 * @return imagepost arraylist
	 */
	public  ArrayList<ImagePost> getImagePostList() {
	    return imagepostList ;}
	/**
	 * 
	 * @param p post to add to the text post list
	 */
	public void setTextPostList(TextPost p) {
		   User.textpostList.add(p);}
	/**
	 * 
	 * @return textpost arraylist
	 */
	public  ArrayList<TextPost> getTextPostList() {
	    return textpostList ;}
	/**
	 * 
	 * @param p post to remove to the text post list
	 */
	public void setTextPostListRemove(Post p) {
		   User.textpostList.remove(p);}
	/**
	 * 
	 * @param p post to remove to the image post list
	 */
	public void setImagePostListRemove(Post p) {
		   User.imagepostList.remove(p);}
	/**
	 * 
	 * @param p post to remove to the video post list
	 */
	public void setVideoPostListRemove(Post p) {
		   User.videopostList.remove(p);}
	/**
	 * 
	 * @param p post to add to the post list
	 */
	public void setPostListAdd(Post p) {
		   User.postList.add(p);}
	/**
	 * 
	 * @param p post to remove to the post list
	 */
	public void setPostListRemove(Post p) {
		   User.postList.remove(p);}
	/**
	 * 
	 * @return postlist arraylist
	 */
	public  ArrayList<Post> getPostList() {
	    return postList ;}
	
	/**
	 * 
	 * @param name 
	 * 				This parameter is user name
	 * @param username
	 * 				This parameter is user unique username
	 * @param password
	 * 				This parameter is user password
	 * @param date
	 * 				This parameter is user date of birth
	 * @param schoolGraduated
	 * 				This parameter is user school graduated name
	 * @param friendList
	 * 				This parameter is user friends list
	 * @param blockList
	 * 				This parameter is user blocked list
	 * @param postList
	 * 				This parameter is user posts list
	 * @param imagepostList
	 * 				This parameter is user image post list
	 * @param videopostList
	 * 				This parameter is user video post list
	 * @param textpostList
	 * 				This parameter is user text post list
	 * @param USER_ID
	 * 				This parameter is user user ID
	 * @param postList
	 * 				This parameter is user post list
	 */
	public User(String name,String username,String password,Date date,String schoolGraduated,
					int USER_ID, ArrayList<User> friendList, ArrayList<User> blockList, ArrayList<VideoPost> videopostList,
					ArrayList<ImagePost> imagepostList, ArrayList<TextPost> textpostList, ArrayList<Post> postList){
		this.USER_ID = USER_ID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.date = date;
		this.schoolGraduated = schoolGraduated;
		User.friendList = friendList;
		User.blockList = blockList;
		User.videopostList = videopostList;
		User.imagepostList= imagepostList;
		User.textpostList= textpostList;
		User.postList = postList;
	}
	
	
	/**
	 * This funtion is give signin boolean
	 * @param a The user who provided the system login conditions
	 */
	public void SignIn(User a){
		a.signedIn = true;
	}
	
	/**
	 * This funtion is give signout boolean
	 * @param b User to logout the system
	 */
	public void SignOut(User b){
				b.signedIn = false;
		System.out.println("You have successfully signed out.");
	}
	
	/**
	 * 
	 *	This function is user's update profile
	 * @param newName
	 * 				This parameter is user updated name
	 * @param newDate
	 * 				This parameter is user updated date of birth
	 * @param newSchoolGraduated
	 * 				This parameter is user updated school graduated name
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void UpdateProfile(String newName, Date newDate, String newSchoolGraduated, User k ){
			k.setName(newName);
			k.setDate(newDate);
			k.setSchoolGraduated(newSchoolGraduated);
			System.out.println("Your user profile has been successfully updated.");
		}
	
	/**
	 * This function is user's change password
	 * @param oldPassword
	 * 				This parameter is user old password
	 * @param newPassword
	 * 				This parameter is user new password
	 * @param k 
	 * 			The user who is online in the system
	 */
	public  void ChangePassword(String oldPassword , String newPassword, User k){
			if(k.getPassword() == oldPassword){
				k.setPassword(newPassword);}
			if(!k.getPassword().equals(oldPassword)){
				System.out.println("Password mismatch! Please, try again.");
			}}
		
	/**
	 * This function is user's add friend
	 * @param addUserName
	 * 				This parameter is username of the user to adds
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void AddFriend(String addUserName, User k){
		boolean foundusername = false;
		for(User u :  UserCollection.userList){
			if(addUserName.equals(u.getUserName())){
				if(k.getFriendList().contains(u) == false){
				k.setFriendList(u);
				System.out.println(addUserName+" has been successfully added to your friend list.");
				return;}
				if(k.getFriendList().contains(u) == true){
					System.out.println("This user is already in your friend list!");}
				foundusername = true;}}
			if(!foundusername){
	    		System.out.println("No such user!");}
			}
	
	/**
	 * This function is user's remove friend
	 * @param removeUserName
	 * 				This parameter is username of the user to remove
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void RemoveFiend(String removeUserName,User k){
		boolean foundusername = false;
		for(User u :  UserCollection.userList){
			if(removeUserName.equals(u.getUserName())){
				if(k.getFriendList().contains(u) == true){
					k.getFriendList().remove(u);
					System.out.println(removeUserName+" has been successfully removed from your friend list.");
					return;}
				if(k.getFriendList().contains(u) == false){
					System.out.println("No such friend!");}
				foundusername = true;}}
		if(!foundusername){
    		System.out.println("No such friend!");}
	}
	
	
	/**
	 * This function adds text post 
	 * @param textContent
	 * 				This parameter is the contents of the text post's to be adds
	 * @param longitude
	 * 				This parameter is the longitude of the text post's to be adds
	 * @param latitude
	 * 				This parameter is the latitude of the text post's to be adds
	 * @param tagUserName
	 * 				This parameter is the friends of the text post's to be tags
	 * @param k 
	 * 			The user who is online in the system
	 *
	 */
	public void AddTextPost(String textContent,String  longitude, String latitude,String tagUserName,User k){
		
		double a =Double.parseDouble(longitude);
		double b= Double.parseDouble(latitude);
		Location  newLocationPost = new Location(a,b);
		Location position = newLocationPost;
		
		TextPost newtextPost = new TextPost(textContent, position, Post.taggedList, UUID.randomUUID());
		
		String[] types = tagUserName.split(":");
		for(int i=0; i<types.length; i++){
			boolean tagusername = false;
			for(User u : k.getFriendList()){
			if(types[i].equals(u.getUserName())){
				newtextPost.setTaggedListAdd(u);
				tagusername = true;}}
			if(! tagusername){
				System.out.println("Username "+types[i]+" is not your friend, and will not be tagged!");}
				}
		
		k.setTextPostList(newtextPost);
		k.setPostListAdd(newtextPost);
		System.out.println("The post has been successfully added.");
		
	}
	/**
	 *  This function adds image post 
	 * @param textContent
	 * 				This parameter is the contents of the image post's to be adds
	 * @param longitude
	 * 				This parameter is the longitude of the image post's to be adds
	 * @param latitude
	 * 				This parameter is the latitude of the image post's to be adds
	 * @param tagUserName
	 * 				This parameter is the friends of the image post's to be tags
	 * @param filePath
	 * 				This parameter is the file path of the image post's to be adds
	 * @param resolution
	 * 				This parameter is the resolution of the image post's to be adds
	 * @param k 
	 * 			The user who is online in the system
	 *
	 */
	public void AddImagePost(String textContent,String longitude,String latitude,
							String tagUserName,String filePath,String resolution,User k){
		
		double a =Double.parseDouble(longitude);
		double b= Double.parseDouble(latitude);
		Location  newLocationPost = new Location(a,b);
		Location position = newLocationPost;
		
		ImagePost newimagePost = new ImagePost(textContent, position, Post.taggedList ,filePath,resolution, UUID.randomUUID());
		
		String[] types = tagUserName.split(":");
		
		for(int i=0; i<types.length; i++){
			boolean tagusername = false;
			for(User u : k.getFriendList()){
			if(types[i].equals(u.getUserName())){
				newimagePost.setTaggedListAdd(u);
				tagusername = true;}}
			
			if(!tagusername){
				System.out.println("Username "+types[i]+" is not your friend, and will not be tagged!");}}
		
		
		k.setImagePostList(newimagePost);
		k.setPostListAdd(newimagePost);
		
		System.out.println("The post has been successfully added.");
	}
		
	/**
	 *  This function adds video post 
	 * @param textContent
	 * 				This parameter is the contents of the video post's to be adds
	 * @param longitude
	 * 				This parameter is the contents of the video post's to be adds
	 * @param latitude
	 * 				This parameter is the latitude of the video post's to be adds
	 * @param tagUserName
	 * 				This parameter is the friends of the video post's to be tags
	 * @param filePath
	 * 				This parameter is the file path of the video post's to be adds
	 * @param videoDuration
	 * 				This parameter is the video duration of the video post's to be adds
	 * @param k 
	 * 			The user who is online in the system
	 *
	 */
	public void AddVideoPost(String textContent,String longitude,String latitude,
								String tagUserName,String filePath,int videoDuration,User k){
		
		double a =Double.parseDouble(longitude);
		double b= Double.parseDouble(latitude);
		Location  newLocationPost = new Location(a,b);
		Location position = newLocationPost;
		
		if(videoDuration <= 10){
		VideoPost newvideoPost = new VideoPost(textContent, position, Post.taggedList,filePath,videoDuration, UUID.randomUUID());
		
		String[] types = tagUserName.split(":");
		for(int i=0; i<types.length; i++){
			boolean tagusername = false;
			for(User u : k.getFriendList()){
			if(types[i].equals(u.getUserName())){
				newvideoPost.setTaggedListAdd(u);
				tagusername = true;}}
			if(! tagusername ){
				System.out.println("Username "+types[i]+" is not your friend, and will not be tagged!");}}
		
		
		k.setVideoPostList(newvideoPost);
		k.setPostListAdd(newvideoPost);
		System.out.println("The post has been successfully added.");}
		if(videoDuration >= 10){
			System.out.println("Error: Your video exceeds maximum allowed duration of 10 minutes.");}}
	
	/**
	 * @param k 
	 * 			The user who is online in the system
	 *  This function removes last post 
	 */
	public void RemovePost(User k){
		if(k.getPostList().size() != 0){
		int a = k.getPostList().size();
		Post b = k.getPostList().get(a-1); 
		k.setPostListRemove(b);
		if(b.getText().endsWith("text post")){
		k.setTextPostListRemove(b);}
		if(b.getText().endsWith("image post")){
			k.setImagePostListRemove(b);}
		if(b.getText().endsWith("video post")){
			k.setVideoPostListRemove(b);}
		System.out.println("Your last post has been successfully removed.");}
		if(k.getPostList().size() == 0){
			System.out.println("Error: You don't have any posts.");}
		}
	
	/**
	 *  This function block user 
	 * @param blockUserName
	 * 			This parameter is username of the user to block
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void Block(String blockUserName, User k){
		boolean foundusername = false;
		for(User u :  UserCollection.userList){
			if(blockUserName.equals(u.getUserName())){
				k.setBlockList(u);
				System.out.println(blockUserName+" has been successfully blocked.");
				foundusername = true;}}
		if(!foundusername){
    		System.out.println("No such user!");}}
	
	/**
	 *  This function unblock user
	 * @param unblockUserName
	 * 			This parameter is username of the user to unblock
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void UnBlock(String unblockUserName, User k){
		boolean foundusername = false;
		for(User u :  UserCollection.userList){
			if(unblockUserName.equals(u.getUserName())){
				if(k.getBlockList().contains(u) == true){
					k.getBlockList().remove(u);
					System.out.println( unblockUserName+" has been successfully unblocked.");
				return;}
				if(k.getBlockList().contains(u) == false){
					System.out.println("No such user in your blocked users list!");}
				foundusername = true;}}
		if(!foundusername){
    		System.out.println("No such user in your blocked users list!");}}
	
	/**
	 *  This function lists friend
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void ListFriends(User k){
		for(User t: k.getFriendList()){
			System.out.println("Name : "+t.getName()+"\nUsername :"+t.getUserName()
								+"\nDate of Birth: "+df.format(t.getDate())+""+"\nSchool: "+
								t.getSchoolGraduated()+"\n---------------------------");}}
	
	/**
	 *  This function adds list users
	 */
	public void ListUsers(){
		for(User u: UserCollection.userList){
			System.out.println("Name : "+u.getName()+"\nUsername :"+u.getUserName()
			+"\nDate of Birth: "+df.format(u.getDate())+""+"\nSchool: "+u.getSchoolGraduated()+"\n---------------------------");}}
	
	/**
	 *  This function shows block friend
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void ShowBlockedFriend(User k){
		if(k.getBlockList().isEmpty() == false){
		for(User u: k.getBlockList()){
				if(k.getFriendList().contains(u) == true){
					System.out.println("Name : "+u.getName()+"\nUsername :"+u.getUserName()
					+"\nDate of Birth: "+df.format(u.getDate())+""+"\nSchool: "+u.getSchoolGraduated()+"\n---------------------------");}}}
				
		if(k.getBlockList().isEmpty() == true){
			System.out.println("You havent blocked any users yet!");}
	}
			
	/**
	 *  This function shows block user
	 * @param k 
	 * 			The user who is online in the system
	 */
	public void ShowBlockedUsers(User k){
		if(k.getBlockList().isEmpty() == false){
			for(User u: k.getBlockList()){
				System.out.println("Name : "+u.getName()+"\nUsername :"+u.getUserName()
				+"\nDate of Birth: "+df.format(u.getDate())+""+"\nSchool: "+u.getSchoolGraduated()+"\n---------------------------");
			}}
		if(k.getBlockList().isEmpty() == true){
			System.out.println("You havent blocked any users yet!");}
	}
	
	/**
	 * This function creates to string method and given information about user's
	 */
	public String toString(){
	    return this.name+" "+this.username +" "+this.date+" " + this.password + " " + this.schoolGraduated+" "+this.USER_ID;}
}


