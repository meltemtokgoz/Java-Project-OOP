/**
 * This class is about the hair care from cosmetic.This class holds the values and  methods of the hair care.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class HairCare extends Cosmetic {
	int isMedicated;
	/**
	 *  Class constructor without parameters.
	 */
	public HairCare(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is Hair care item's ID
	 * @param itemName This parameter is Hair care item's name
	 * @param itemCost This parameter is Hair care item's  cost
	 * @param manufacturer This parameter is Hair care item's manufacturer
	 * @param brand This parameter is Hair care item's  brand
	 * @param isOrganic This parameter is Hair care item's  is organic (boolean)
	 * @param expirationYear This parameter is Hair care item's expiration year
	 * @param weight This parameter is Hair care item's  weight
	 * @param isMedicated This parameter is Hair care item's is medicated (boolean)
	 */
	public HairCare(int itemID,String itemName, int itemCost,String manufacturer,String brand,int isOrganic,
					int expirationYear,int weight,int isMedicated){
		super.itemID= itemID;
		super.itemName = itemName;
 		super.itemCost =itemCost;
 		super.manufacturer = manufacturer;
        super.brand = brand;
        super.isOrganic= isOrganic;
        super.expirationYear= expirationYear;
        super.weight= weight;
        this.isMedicated= isMedicated;
	}
	/**
	 * 
	 * @return  The current value of is medicated
	 */
	public int getIsMedicated() {
	    return isMedicated;}
	/**
	 * 
	 * @param isMedicated A new value for the is medicated
	 */
	public void setIsMedicated(int isMedicated) {
	    this.isMedicated = isMedicated;}
	/**
	 * This function creates to string method and given information about hair care.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.isOrganic+" "+this.expirationYear+" "+this.weight+" "+this.isMedicated;}
}


