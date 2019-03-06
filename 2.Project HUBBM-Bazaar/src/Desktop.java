/**
 * This class is about the desktop from computer.This class holds the values and  methods of the desktop  .
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Desktop extends Computer {
	String boxColor;
	/**
	 *  Class constructor without parameters.
	 */
	public Desktop(){
		
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is desktop's type
	 * @param itemName This parameter is desktop's name
	 * @param itemCost This parameter is desktop's cost
	 * @param manufacturer This parameter is desktop's manufacturer
	 * @param brand This parameter is desktop's brand
	 * @param maxVolt This parameter is desktop's max volt
	 * @param maxWatt This parameter is desktop's max watt
	 * @param operatingSystem This parameter is desktop's operating system 
	 * @param CPUType This parameter is desktop's CPU type 
	 * @param ramCapacity This parameter is desktop's ramcapacity
	 * @param HDDCapacity This parameter is desktop's HDD capacity
	 * @param boxColor This parameter is desktop's box color
	 */
	public Desktop(int itemID,String itemName, int itemCost, String manufacturer,String brand,int maxVolt,
	int maxWatt,String operatingSystem,String CPUType,int ramCapacity,int HDDCapacity,String boxColor){
		super.itemID=itemID;
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
        this.boxColor = boxColor;
        
	}
	/**
	 * 
	 * @return The current value of desktop.
	 */
	public String getBoxColor() {
	    return boxColor;}
	/**
	 * 
	 * @param boxColor A new value for the box color.
	 */
	public void setBoxColor(String boxColor) {
	    this.boxColor = boxColor;}
	/**
	 * This function creates to string method and given information about desktop.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.maxVolt+" "+this.maxWatt+" "+this.operatingSystem+ " " + 
	    		this.CPUType+ " " + this.ramCapacity+" "+this.HDDCapacity+" "+this.boxColor;}

	
}
