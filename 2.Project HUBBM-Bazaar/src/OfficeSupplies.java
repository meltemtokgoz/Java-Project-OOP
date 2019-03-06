/**
 * This class is about the office supplies from items.This class holds the values and  methods of the office suplies.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class 	OfficeSupplies extends Items {
	String releaseDate;
	String coverTitle;
	/**
	 *  Class constructor without parameters.
	 */
	public OfficeSupplies(){
	}
	/**
	 * 
	 * @return The current value of release date
	 */
	public String getReleaseDate() {
	    return releaseDate;}
	/**
	 * 
	 * @param releaseDate  A new value for the release date
	 */
	public void setReleaseDate(String releaseDate) {
	    this.releaseDate = releaseDate;}
	/**
	 * 
	 * @return The current value of covet title
	 */
	public String getCoverTitle() {
	    return coverTitle;}
	/**
	 * 
	 * @param coverTitle  A new value for the  cover title
	 */
	public void setCoverTitle(String coverTitle) {
	    this.coverTitle = coverTitle;}

}
