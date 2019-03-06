/**
 * This class is about the items from object.This class holds the values and  methods of the items.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 


public class Items {
	int itemID;
	String itemName;
	int itemCost;
	
	/**
	 *  Class constructor without parameters.
	 */
	public Items(){	
	}
	/**
	 * 
	 * @return The current value of  item ID.
	 */
	public int getItemID() {
	    return itemID;}
	/**
	 * 
	 * @param itemID A new value for the item ID
	 */
	public void setItemID(int itemID) {
	    this.itemID = itemID;}
	/**
	 * 
	 * @return  The current value of  item name
	 */
	public String getItemName() {
	    return itemName;}
	/**
	 * 
	 * @param itemName A new value for the item name
	 */
	public void setItemName(String itemName) {
	    this.itemName = itemName;}
	/**
	 * 
	 * @param itemCost The current value of  item cost
	 */
	public void setItemCost(int itemCost) {
	    this.itemCost = itemCost;}
	/**
	 * 
	 * @return A new value for the item cost
	 */
	public int getItemCost() {
	    return itemCost;}
	


}
