/**
 * This class is about the perfume from cosmetic.This class holds the values and  methods of the perfume.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Perfume extends Cosmetic {
	int lastingDuration;
	/**
	 *  Class constructor without parameters.
	 */
	public Perfume(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is perfume item's  ID
	 * @param itemName This parameter is perfume item's name
	 * @param itemCost This parameter is perfume item's cost
	 * @param manufacturer This parameter is perfume item's  manufacturer
	 * @param brand This parameter is perfume item's  brand
	 * @param isOrganic This parameter is perfume item's is organic(boolean)
	 * @param expirationYear This parameter is perfume item's  expiration year
	 * @param weight This parameter is perfume item's  weight
	 * @param lastingDuration This parameter is perfume item's lasting duration 
	 */
	public Perfume(int itemID,String itemName, int itemCost,String manufacturer,String brand,int isOrganic,
					int expirationYear,int weight,int lastingDuration){
		super.itemID= itemID;
		super.itemName = itemName;
 		super.itemCost =itemCost;
 		super.manufacturer = manufacturer;
        super.brand = brand;
        super.isOrganic= isOrganic;
        super.expirationYear= expirationYear;
        super.weight= weight;
        this.lastingDuration= lastingDuration;
	}
	/**
	 * 
	 * @return The current value of lasting duration
	 */
	public int getLastingDuration() {
	    return lastingDuration;}
	/**
	 * 
	 * @param lastingDuration A new value for the lasting duration
	 */
	public void setLastingDuration(int lastingDuration) {
	    this.lastingDuration = lastingDuration;}
	/**
	 * This function creates to string method and given information about Perfume
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.isOrganic+" "+this.expirationYear+" "+this.weight+" "+this.lastingDuration;}
}
