/**
 * This class is Post Location
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */

public class Location {
	public double latitude;
	public double longitude;
	/**
	 * 
	 * @param latitude
	 * 				This parameter is post latitude
	 * @param longitude
	 * 				This parameter is post longitude
	 */
	public Location(double latitude, double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	/**
	 * This function creates to string method and given information about Location class
	 */
	public String toString(){
	    return this.latitude+" "+this.longitude;}
}
