/**
 * This class is about the skin care from cosmetic.This class holds the values and  methods of the skin care.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class SkinCare extends Cosmetic {
	int babySensitive;
	/**
	 *  Class constructor without parameters.
	 */
	public SkinCare(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is skin care item's ID
	 * @param itemName This parameter is skin care item's name
	 * @param itemCost This parameter is skin care item's cost
	 * @param manufacturer This parameter is skin care item's manufacturer
	 * @param brand This parameter is skin care item's brand
	 * @param isOrganic This parameter is skin care item's is organic
	 * @param expirationYear This parameter is skin care item's expiration year
	 * @param weight This parameter is skin care item's weight
	 * @param babySensitive This parameter is skin care item's baby sensitive (boolean)
	 */
	public SkinCare(int itemID,String itemName, int itemCost,String manufacturer,String brand,int isOrganic,
					int expirationYear,int weight,int babySensitive){
		super.itemID= itemID;
		super.itemName = itemName;
 		super.itemCost =itemCost;
 		super.manufacturer = manufacturer;
        super.brand = brand;
        super.isOrganic= isOrganic;
        super.expirationYear= expirationYear;
        super.weight= weight;
        this.babySensitive= babySensitive;
	}
	/**
	 * 
	 * @return The current value of baby sensitive
	 */
	public int getBabySensitive() {
	    return babySensitive;}
	/**
	 * 
	 * @param babySensitive A new value for the baby sensitive
	 */
	public void setBabySensitive(int babySensitive) {
	    this.babySensitive = babySensitive;}
	/**
	 * This function creates to string method and given information about skin care
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.isOrganic+" "+this.expirationYear+" "+this.weight+" "+this.babySensitive;}
}
	
