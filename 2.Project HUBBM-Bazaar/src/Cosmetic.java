/**
 * 
 * @author 
 *
 */
public class Cosmetic extends Items {
	String manufacturer;
	String brand; 
	int expirationYear;
	int weight;
	int isOrganic;
	
	/**
	 *  Class constructor without parameters.
	 */
	public Cosmetic(){
		
	}
	/**
	 * 
	 * @return The current value of  manufacturer
	 */
	public String getManufacturer() {
	    return manufacturer;}
	/**
	 * 
	 * @param manufacturer  A new value for the manufacturer.
	 */
	public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;}
	/**
	 * 
	 * @return The current value of brand
	 */
	public String getBrand() {
	    return brand ;}
	/**
	 * 
	 * @param brand  A new value for the  brand
	 */
	public void setBrand(String brand) {
	    this.brand = brand;}
	/**
	 * 
	 * @return The current value of expiration year
	 */
	public int getExpirationYear() {
	    return  expirationYear;}
	/**
	 * 
	 * @param expirationYear  A new value for the expiration year
	 */
	public void setExpirationYear(int  expirationYear) {
	    this.expirationYear =  expirationYear;}
	/**
	 * 
	 * @return The current value of weight
	 */
	public int getWeight() {
	    return weight;}
	/**
	 * 
	 * @param weight  A new value for the weight
	 */
	public void setWeight(int weight) {
	    this.weight = weight;}
	/**
	 * 
	 * @return The current value of is organic
	 */
	public int getIsOrganic() {
	    return isOrganic;}
	/**
	 * 
	 * @param isOrganic  A new value for the is organic
	 */
	public void setIsOrganic(int isOrganic) {
	    this.isOrganic = isOrganic;}
	}

