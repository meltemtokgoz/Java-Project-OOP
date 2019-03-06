/**
 * This class is about the senior from technicians.This class holds the values and methods of the senior.
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Senior extends Technicians {
	/**
	 *  Class constructor without parameters.
	 */
	public Senior(){
		
	}
	/**
	 * Class constructor with parameter.
	 * @param userName This parameter is senior's type
	 * @param name This parameter is senior's name
	 * @param mail This parameter is senior's mail 
	 * @param birthDate This parameter is senior's birthdate
	 * @param salary This parameter is senior's salary
	 */
	public Senior(String userName,String name,String mail,String birthDate,int salary){
		super.userName=userName;
		super.name= name;
		super.mail= mail;
		super.birthDate= birthDate;
		super.salary= salary;
	}
	/**
	 * 
	 */
	public void ShowOrders(){
		
	}
}
