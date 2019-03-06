/**
 * This class is about the electronic from items.This class holds the values and  methods of the electronic.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 


public class Electronic extends Items {
	int maxVolt;
	int maxWatt;
	String manufacturer;
	String brand;
	/**
	 *  Class constructor without parameters.
	 */
	public Electronic(){
		
	}
	/**
	 * 
	 * @return The current value of  manufacturer
	 */
	public String getManufacturer() {
	    return manufacturer;}
	/**
	 * 
	 * @param manufacturer A new value for the manufacturer
	 */
	public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;}
	/**
	 * 
	 * @return  The current value of  max volt
	 */
	public int getMaxVolt() {
	    return maxVolt;}
	/**
	 * 
	 * @param maxVolt A new value for the max volt
	 */
	public void setMaxVolt(int maxVolt) {
	    this.maxVolt = maxVolt;}
	/**
	 * 
	 * @return The current value of max watt
	 */
	public int getMaxWatt() {
	    return maxWatt;}
	/**
	 * 
	 * @param maxWatt A new value for the max watt
	 */
	public void setMaxWatt(int maxWatt) {
	    this.maxWatt =maxWatt;}
	/**
	 * 
	 * @return The current value of  brand
	 */
	public String getBrand() {
	    return brand ;}
	/**
	 * 
	 * @param brand A new value for the brand
	 */
	public void setBrand(String brand) {
	    this.brand = brand;}


	
}
