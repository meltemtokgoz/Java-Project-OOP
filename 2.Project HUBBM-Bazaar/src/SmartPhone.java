/**
 * This class is about the smartphone from electronic.This class holds the values and  methods of the smartphone.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class SmartPhone extends Electronic {
	String screenType;
	/**
	 *  Class constructor without parameters.
	 */
	public SmartPhone(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is smartphone item's ID
	 * @param itemName This parameter is smartphone item's name
	 * @param itemCost This parameter is smartphone item's cost
	 * @param manufacturer This parameter is smartphone item's manufacturer 
	 * @param brand This parameter is smartphone item's brand
	 * @param maxVolt This parameter is smartphone item's max volt
	 * @param maxWatt This parameter is smartphone item's max watt
	 * @param screenType This parameter is smartphone item's screen type
	 */
	public SmartPhone(int itemID,String itemName, int itemCost, String manufacturer,String brand,int maxVolt,
	int maxWatt,String screenType){
		super.itemID= itemID;
		super.itemName = itemName;
        super.itemCost = itemCost;
        super.manufacturer = manufacturer;
        super.brand = brand;
        super.maxVolt = maxVolt;
        super.maxWatt = maxWatt;
        this.screenType = screenType;
  
}
	/**
	 * 
	 * @return The current value of screen type
	 */
	public String getScreenType() {
	    return screenType;}
	/**
	 * 
	 * @param screenType A new value for the smart phones's screen type
	 */
	public void setScreenSize(String screenType) {
		this.screenType = screenType;}
	/**
	 *  This function creates to string method and given information about smart phone
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.maxVolt+" "+this.maxWatt+" "+this.screenType;}

}


