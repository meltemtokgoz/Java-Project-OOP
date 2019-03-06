/**
 * This class is about the CD-DVD from office supplies.This class holds the values and  methods of the CD-DVD.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class CdDvd extends OfficeSupplies {
	String composerName;
	String song;
	/**
	 *  Class constructor without parameters.
	 */
	public CdDvd(){	
    }
	/**
	 * Class constructor with parameter.
	 * @param itemID This parameter gives the ID of cd dvd.
	 * @param itemName This parameter gives the name of cd dvd
	 * @param itemCost This parameter gives the cost of  cd dvd
	 * @param releaseDate This parameter gives the release date cd dvd
	 * @param coverTitle This parameter gives the cover title of cd dvd
	 * @param composerName This parameter gives the composer name of cd dvd
	 * @param song This parameter gives the song of cd dvd
	 */
    public CdDvd(int itemID,String itemName, int itemCost, String releaseDate, 
    			String coverTitle,String composerName, String song){
    	super.itemID= itemID;
        super.itemName = itemName;
        super.itemCost = itemCost;
        super.releaseDate = releaseDate;  
        super.coverTitle = coverTitle;
        this.composerName = composerName;
        this.song = song;
       ;
}
    /**
     * Composer name is getter method
     * Composer name the cd.
     * @return The current value of cd's composer name
     */
	public String getComposerName() {
	    return composerName;}
	/**
	 * Composer name is setter method
	 * Changes the composer name of this cd.
	 * @param composerName A new value for the composer name.
	 */
	public void setComposerName(String composerName) {
	    this.composerName = composerName;}
	/**
	 * Song is getter method
	 * Song the cd
	 * @return The current value of cd's  songs
	 */
	public String getSong() {
	    return song;}
	/**
	 * Song is setter method
	 * Changes the song of this cd
	 * @param song A new value for the song 
	 */
	public void setSong(String song) {
	    this.song = song;}
	/**
	 * This function creates to string method and given information about cd dvd's.
	 */
	public String toString(){
	    return this.itemID+" "+this.itemName + " " + this.itemCost + " " + this.releaseDate+" "+
	    		this.coverTitle+" "+this.composerName+" "+this.song;}

}
