/**
 * This class is about the users from object.This class holds the values and  methods of the users.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 


public class Users extends Object{
	 String userName; 
	 String name;
	 String mail;
	 String birthDate;
	/**
	 *  Class constructor without parameters.
	 */
	public Users(){
	}
	/**
	 * 
	 * @return The current value of user type.For instance ADMIN
	 */
	public String getUserName() {
	    return userName;}
	/**
	 * 
	 * @param userName A new value for the user's type
	 */
	public void setUserName(String userName) {
	    this.userName = userName;}
	/**
	 * 
	 * @return The current value of  user name 
	 */
	public String getName() {
	    return name;}
	/**
	 * 
	 * @param name A new value for the user's name
	 */
	public void setName(String name) {
	    this.name = name;}
	/**
	 * 
	 * @return The current value of  user mail
	 */
	public String getMail() {
	    return mail;}
	/**
	 * 
	 * @param mail A new value for the user's mail
	 */
	public void setMail(String mail) {
	    this.mail = mail;}
	/**
	 * 
	 * @return  The current value of user birh date 
	 */
	public String getBirthDate() {
	    return birthDate;}
	/**
	 * 
	 * @param birthDate A new value for the user's birth date
	 */
	public void setBirthDater(String birthDate) {
	    this.birthDate = birthDate;}
	
}