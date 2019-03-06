/**
 * This class is about the laptop from computer.This class holds the values and  methods of the computer.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Laptop extends Computer {
	int HDMISupport;
	/**
	 * Class constructor without parameters.
	 */
	public Laptop(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is laptop item's ID
	 * @param itemName This parameter is laptop item's name
	 * @param itemCost This parameter is laptop item's cost
	 * @param manufacturer This parameter is laptop item's manufacturer
	 * @param brand This parameter is laptop item's brand 
	 * @param maxVolt This parameter is laptop item's max volt
	 * @param maxWatt This parameter is laptop item's max watt
	 * @param operatingSystem This parameter is laptop item's operating system
	 * @param CPUType This parameter is laptop item's CPU type 
	 * @param ramCapacity This parameter is laptop item's ram capacity
	 * @param HDDCapacity This parameter is laptop item's HDD capacity
	 * @param HDMISupport This parameter is laptop item's HDMI support
	 */
	public Laptop(int itemID,String itemName, int itemCost, String manufacturer,String brand,int maxVolt,
				int maxWatt,String operatingSystem,String CPUType,
				int ramCapacity,int HDDCapacity,int HDMISupport){
				super.itemID= itemID;
				super.itemName = itemName;
		        super.itemCost = itemCost;
		        super.manufacturer = manufacturer;
		        super.brand = brand;
		        super.maxVolt = maxVolt;
		        super.maxWatt = maxWatt;
		        super.operatingSystem = operatingSystem;
		        super.CPUType = CPUType;
		        super.ramCapacity = ramCapacity;
		        super.HDDCapacity = HDDCapacity;
		        this.HDMISupport = HDMISupport;
		        
}
	/**
	 * 
	 * @return The current value of HDMI support.
	 */
	public int getHDMISupport() {
	    return HDMISupport;}
	/**
	 * 
	 * @param HDMISupport A new value for the  HDMI support
	 */
	public void setHDMISupport(int HDMISupport) {
	    this.HDMISupport = HDMISupport;}
	/**
	 * This function creates to string method and given information about laptop.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.maxVolt+" "+this.maxWatt+" "+this.operatingSystem+ " " + 
	    		this.CPUType+ " " + this.ramCapacity+" "+this.HDDCapacity+" "+this.HDMISupport;}
}