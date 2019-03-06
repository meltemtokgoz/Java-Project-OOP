/**
 * This class is about the tablet from computer.This class holds the values and  methods of the tablet.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Tablet extends Computer {
	int dimension;
	/**
	 *  Class constructor without parameters.
	 */
	public Tablet(){
	}
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter is tablet's ID
	 * @param itemName This parameter is tablet's  name
	 * @param itemCost This parameter is tablet's  cost
	 * @param manufacturer This parameter is tablet's manufacturer
	 * @param brand This parameter is tablet's  brand
	 * @param maxVolt This parameter is tablet's  max volt 
	 * @param maxWatt This parameter is tablet's max watt
	 * @param operatingSystem This parameter is tablet's  operatin system
	 * @param CPUType This parameter is tablet's  CPU type
	 * @param ramCapacity This parameter is tablet's ram capacity
	 * @param HDDCapacity This parameter is tablet's  HDD capacity
	 * @param dimension This parameter is tablet's  dimension
	 */
	public Tablet(int itemID,String itemName, int itemCost, String manufacturer,String brand,int maxVolt,
			int maxWatt,String operatingSystem,String CPUType,int ramCapacity,int HDDCapacity,int dimension){
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
		        this.dimension = dimension;
		        
}
	/**
	 * 
	 * @return The current value of dimension
	 */
	public int getDimension() {
	    return dimension;}
	/**
	 * 
	 * @param dimension  A new value for the tablet's dimension
	 */
	public void setDimension(int dimension) {
	    this.dimension = dimension;}
	/**
	 * This function creates to string method and given information about tablet.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.manufacturer+" "+
	    		this.brand+" "+this.maxVolt+" "+this.maxWatt+" "+this.operatingSystem+ " " + 
	    		this.CPUType+ " " + this.ramCapacity+" "+this.HDDCapacity+" "+this.dimension;}
}
