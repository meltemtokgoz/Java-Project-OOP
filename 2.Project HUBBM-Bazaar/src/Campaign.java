/**
 * This class be for campaigns.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */  


public class Campaign {
	String startDate;
	String endDate;
	String itemType;
	int rate;
	
	/**
	 *  Class constructor without parameters.
	 */
	public Campaign(){	
	}
	/**
	 * Class constructor with parameter.
	 * @param startDate This parameter gives campaign start date
	 * @param endDate This parameter gives campaign end date
	 * @param itemType This parameter gives item type
	 * @param rate This parameter gives discount rate in the item
	 */
	public Campaign(String startDate,String endDate,String itemType,int rate){
		this.startDate= startDate;
		this.itemType= itemType;
		this.endDate=endDate;
		this.rate=rate;
	}
	/**
	 * 
	 * @return The current value of item's rate.
	 */
	public  int getrate() {
	    return rate;}
	/**
	 * 
	 * @param rate A new value for the rate.
	 */
	public void setrate(int rate) {
	    this.rate = rate;}

	/**
	 * 
	 * @return The current value of  item's  start date
	 */
	public  String getstartDate() {
	    return startDate;}
	/**
	 * 
	 * @param startDate A new value for the start date
	 */
	public void setstartDate(String startDate) {
	    this.startDate= startDate;}
	/**
	 * 
	 * @return The current value of item's end date
	 */
	public  String getendDate() {
	    return endDate;}
	/**
	 * 
	 * @param endDate A new value for the end date
	 */
	public void setendDate(String endDate) {
	    this.endDate = endDate;}
	/**
	 * 
	 * @return The current value of item's  type
	 */
	public  String getitemType() {
	    return itemType;}
	/**
	 * 
	 * @param itemType A new value for the item type.
	 */
	public void setitemType(String itemType) {
	    this.itemType= itemType;}
	/**
	 * This function creates to string method and given information about item's
	 */
	public String toString(){
	    return this.startDate+" "+this.endDate+" "+this.itemType+" "+this.rate;}
}
