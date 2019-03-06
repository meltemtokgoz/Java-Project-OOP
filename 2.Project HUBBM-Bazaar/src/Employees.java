/**
 * This class is about the employees from users.This class holds the values and methods of the employees.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 


public class Employees extends Users{
	int salary;
	/**
	 *  Class constructor without parameters.
	 */
	public Employees(){
	}
	/**
	 * Class constructor with parameter.
	 * @param userName This parameter is employees's type
	 * @param name This parameter is employees's name
	 * @param email This parameter is employees's email
	 * @param birthDate This parameter is employees's birth date
	 * @param salary This parameter is employees's salary
	 */
	public Employees(String userName, String name, String email,String birthDate,int salary){
		super.userName=userName;
		super.name= name;
		super.mail= mail;
		super.birthDate= birthDate;
		this.salary= salary;	
	}
	/**
	 * 
	 * @return The current value of salary
	 */
	public double getSalary() {
	    return salary;}
	/**
	 * 
	 * @param salary A new value for the salary
	 */
	public void setSalary(int salary) {
	    this.salary = salary;}
	/**
	 * This function lists all items by the types.
	 */
	public void ListItem(){
		 for(Laptop l : Main.laptop){
			System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
			l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
			l.operatingSystem+"\nCPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
			"\nHDMI support: "+l.HDMISupport);}
		 for(Desktop l : Main.desktop){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
				l.operatingSystem+"CPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
				"\nBox Color: "+l.boxColor);}
		 for(Tablet l : Main.tablet){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
				l.operatingSystem+"\nCPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
				"\nDimension: "+l.dimension);}
		 for(Tv l : Main.tv){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nScreen size: "
						+l.screenSize);}
		 for(SmartPhone l : Main.smartphone){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nScreen type: "
						+l.screenType);}
		 for(HairCare l : Main.haircare){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nrganic:"+l.isOrganic+"\nExpiration Date: "+l.expirationYear+"\nWeight: "
				+l.weight+"\nMedicated: "+l.isMedicated);}
		 for(SkinCare l : Main.skincare){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nOrganic:"+l.isOrganic+"\nExpiration Date: "+l.expirationYear+"\nWeight: "
				+l.weight+"\nBaby Sensitive: "+l.babySensitive);}
		 for(Perfume l : Main.perfume){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nOrganic:"+l.isOrganic+"\nxpiration Date: "+l.expirationYear+"\nWeight: "
				+l.weight+"\nLasting Duration: "+l.lastingDuration);}
		 for(Book l : Main.book){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nRelease Date: "
						+l.releaseDate+"\nTitle: "+l.coverTitle+"\nPublisher: "+l.publisherName+"\nAuthor: "+
						l.author+"\nPage: "+l.pageNumber);}
		 for(CdDvd l : Main.cddvd){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nRelease Date: "
						+l.releaseDate+"\nTitle: "+l.coverTitle+"\nSongs: "+l.song+"\nComposer: "+l.composerName);}}
		 
	/**
	 * This function indicates the amount of stock item that is less than maxStockAmount
	 * @param maxStockAmount this parameter given the amount of stock
	 */
	public void ShowItemLownOnStock(int maxStockAmount){
		if(Customer.bk < maxStockAmount){
			System.out.println("Book : "+Main.book.size());}
		if( Customer.cd < maxStockAmount){
			System.out.println("CDDVD : "+Main.cddvd.size());}
		if((Customer.dsktp) < maxStockAmount){
			System.out.println("Desktop : "+Main.desktop.size());}
		if(Customer.lptp < maxStockAmount){
			System.out.println("Laptop : "+Main.laptop.size());}
		if(Customer.tblt < maxStockAmount){
			System.out.println("Tablet : "+Main.tablet.size());}
		if(Customer.tlvzyn < maxStockAmount){
			System.out.println("TV : "+Main.tv.size());}
		if(Customer.smrtphn < maxStockAmount){
			System.out.println("SmartPhone : "+Main.smartphone.size());}
		if(Customer.hrcr < maxStockAmount){
			System.out.println("HairCare : "+Main.haircare.size());}
		if(Customer.prfm < maxStockAmount){
			System.out.println("Perfume : "+Main.perfume.size());}
		if(Customer.skncr < maxStockAmount){
			System.out.println("SkinCare : "+Main.skincare.size());}
	}
	/**
	 * This function shows amount of remaining stock
	 */
	public void ShowItemLownOnStock(){
		System.out.println("Book :"+Customer.bk);
		System.out.println("CDDVD : "+Customer.cd);
		System.out.println("Desktop : "+Customer.dsktp);
		System.out.println("Laptop : "+Customer.lptp);
		System.out.println("Tablet : "+Customer.tblt);
		System.out.println("TV : "+Customer.tlvzyn);
		System.out.println("SmartPhone : "+Customer.smrtphn);
		System.out.println("HairCare : "+Customer.hrcr);
		System.out.println("Perfume : "+Customer.prfm);
		System.out.println("SkinCare : "+Customer.skncr);
	}
	
	/**
	 * This function shows the golden customer
	 */
	public void ShowVip(){
		for(Customer c : Main.cust){
			if(c.status.equals("GOLDEN")){
				System.out.println("Customer : "+c.getName()+" 	ID: "+c.getID()+"	e-mail: "+c.getMail()+"	Date of Birth: "+
			c.getBirthDate()+"Status: GOLDEN");
			}}}}
