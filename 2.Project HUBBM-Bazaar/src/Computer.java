/**
 * This class is about the computer from electronic.This class holds the values and  methods of the computer.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Computer extends Electronic {
	String operatingSystem;
	String CPUType;
	int ramCapacity;
	int HDDCapacity;
	/**
	 *  Class constructor without parameters.
	 */
	public Computer(){
		
	}
	/**
	 * 
	 * @return The current value of computer's operating system.
	 */
	public String getOperatingSystem() {
	    return operatingSystem;}
	/**
	 * 
	 * @param operatingSystem A new value for the operating system
	 */
	public void setOperatingSystem(String operatingSystem) {
	    this.operatingSystem = operatingSystem;}
	/**
	 * 
	 * @return The current value of computer's CPU type.
	 */
	public String getCPUType() {
	    return CPUType;}
	/**
	 * 
	 * @param CPUType  A new value for the CPU type
	 */
	public void setCPUType(String CPUType) {
	    this.CPUType = CPUType;}
	/**
	 * 
	 * @return The current value of computer's ram capacity
	 */
	public int getRamCapacity() {
	    return ramCapacity;}
	/**
	 * 
	 * @param ramCapacity A new value for the ram capacity
	 */
	public void setRamCapacity(int ramCapacity) {
	    this.ramCapacity = ramCapacity;}
	/**
	 * 
	 * @return The current value of computer's HDD capacity.
	 */
	public int getHDDCapacity() {
	    return HDDCapacity;}
	/**
	 * 
	 * @param HDDCapacity A new value for the HDD capacity
	 */
	public void setHDDCapacity(int HDDCapacity) {
	    this.HDDCapacity =HDDCapacity ;}

	
}
