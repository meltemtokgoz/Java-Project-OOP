/**
 * This class is about tv from electronic.This class holds the values and  methods of the tv.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 



public class Tv extends Electronic {
	int screenSize;
	/**
	 *  Class constructor without parameters.
	 */
	public Tv(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameters tv item's ID
	 * @param itemName This parameters tv item's name
	 * @param itemCost This parameters tv item's cost
	 * @param manufacturer This parameters tv item's manufacturer 
	 * @param brand This parameters tv item's brand
	 * @param maxVolt This parameters tv item's max volt
	 * @param maxWatt This parameters tv item's max watt
	 * @param screenSize This parameters tv item's screen size
	 */
	public Tv(int itemID,String itemName, int itemCost, String manufacturer,String brand,int maxVolt,
	int maxWatt,int screenSize){
		super.itemID=itemID;
		super.itemName = itemName;
        super.itemCost = itemCost;
        super.manufacturer = manufacturer;
        super.brand = brand;
        super.maxVolt = maxVolt;
        super.maxWatt = maxWatt;
        this.screenSize = screenSize;
  
}
	/**
	 * 
	 * @return The current value of screen size
	 */
	public int getScreenSize() {
	    return screenSize;}
	/**
	 * 
	 * @param screenSize  A new value for the tv's screen size
	 */
	public void setScreenSize(int screenSize) {
	    this.screenSize = screenSize;}
	/**
	 *  This function creates to string method and given information about  tv.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.maxVolt+" "+this.maxWatt+" "+this.screenSize;}
}

