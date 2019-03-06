/**
 * This class is about the technicians from users.This class holds the values and methods of the technician.
 * 
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Technicians extends Employees {
	int isSeniorTechnician;
	/**
	 *  Class constructor without parameters.
	 */
	public Technicians(){
	}
	/**
	 * Class constructor with parameter.
	 * @param userName This parameter is technician's type
	 * @param name This parameter is technician's name 
	 * @param mail This parameter is technician's mail
	 * @param birthDate This parameter is technician's birth date
	 * @param salary This parameter is technician's salary
	 * @param isSeniorTechnician This parameter is technician's is senior or not (boolean)
	 */
	public Technicians(String userName,String name,String mail,String birthDate,int salary,int isSeniorTechnician){
		super.userName=userName;
		super.name= name;
		super.mail= mail;
		super.birthDate= birthDate;
		super.salary= salary;
		this.isSeniorTechnician= isSeniorTechnician;
	}
	/**
	 * 
	 * @return
	 */
	public int getIsSeniorTechnician() {
	    return isSeniorTechnician;}
	/**
	 * 
	 * @param isSeniorTechnician
	 */
	public void setIsSeniorTechnician(int isSeniorTechnician) {
	    this.isSeniorTechnician = isSeniorTechnician;}
	
	/**
	 * This function lists items given type
	 * @param type This parameter type of list to items
	 */
	public void DispItemsOf(String type){
		String[] types = type.split(":");
		int i;
		for(i=0; i<types.length; i++);{
			if(types[i].equals("LAPTOP")){
				for(Laptop l : Main.laptop){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
				l.operatingSystem+"\nCPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
				"\nHDMI support: "+l.HDMISupport);}}
		if(types[i].equals("DESKTOP")){
			for(Desktop l : Main.desktop){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
				l.operatingSystem+"CPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
				"\nBox Color: "+l.boxColor);}}
		if(types[i].equals("TABLET")){
			for(Tablet l : Main.tablet){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nOperating System: "+
				l.operatingSystem+"\nCPU Type: "+l.CPUType+"\nRAM Capacity: "+l.ramCapacity+"\nHDD Capacity: "+l.HDDCapacity+
				"\nDimension: "+l.dimension);}}
		if(types[i].equals("TV")){
			for(Tv l : Main.tv){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nScreen size: "
						+l.screenSize);}}
		if(types[i].equals("SMARTPHONE")){
			for(SmartPhone l : Main.smartphone){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nMax Volt: "+l.maxVolt+"\nMax Watt: "+l.maxWatt+"\nScreen type: "
						+l.screenType);}}
		if(types[i].equals("HAIRCARE")){
			for(HairCare l : Main.haircare){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nrganic:"+l.isOrganic+"\nExpiration Date: "+l.expirationYear+"\nWeight: "
				+l.weight+"\nMedicated: "+l.isMedicated);}}	
		if(types[i].equals("SKINCARE")){
			 for(SkinCare l : Main.skincare){
					System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
					l.manufacturer+"\nBrand: "+l.brand+"\nOrganic:"+l.isOrganic+"\nExpiration Date: "+l.expirationYear+"\nWeight: "
					+l.weight+"\nBaby Sensitive: "+l.babySensitive);}}
		if(types[i].equals("PERFUME")){
			for(Perfume l : Main.perfume){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nManufacturer: "+
				l.manufacturer+"\nBrand: "+l.brand+"\nOrganic:"+l.isOrganic+"\nxpiration Date: "+l.expirationYear+"\nWeight: "
				+l.weight+"\nLasting Duration: "+l.lastingDuration);}}
		if(types[i].equals("BOOK")){
			for(Book l : Main.book){
				System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nRelease Date: "
						+l.releaseDate+"\nTitle: "+l.coverTitle+"\nPublisher: "+l.publisherName+"\nAuthor: "+
						l.author+"\nPage: "+l.pageNumber);}}
		if(types[i].equals("CDDVD")){
			 for(CdDvd l : Main.cddvd){
					System.out.println("-----------------------"+"\nType: "+l.itemName+"\nItem ID: "+l.itemID+"\nPrice: "+l.itemCost+"\nRelease Date: "
							+l.releaseDate+"\nTitle: "+l.coverTitle+"\nSongs: "+l.song+"\nComposer: "+l.composerName);}}}}

		
	
	/**
	 * This function adds new item to item arraylist.
	 * @param itemType This parameter type of product to add
	 */
	public void AddItem(String itemType){
		String[] arg = itemType.split(":");
		if(arg[0].equals("DESKTOP")){
			Main.itemID++;
			Desktop d = new Desktop (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), arg[6], arg[7], 
								Integer.parseInt(arg[8]), Integer.parseInt(arg[9]),arg[10]);
         	Main.desktop.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("LAPTOP")){
			Main.itemID++;
			Laptop d = new Laptop (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), arg[6], arg[7], 
								Integer.parseInt(arg[8]), Integer.parseInt(arg[9]),Integer.parseInt(arg[10]));
			Main.laptop.add(d);
        	Main.item.add(d);;}
		if(arg[0].equals("TABLET")){
			Main.itemID++;
			Tablet d = new Tablet (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), arg[6], arg[7], 
								Integer.parseInt(arg[8]), Integer.parseInt(arg[9]),Integer.parseInt(arg[10]));
			Main.tablet.add(d);
			Main.item.add(d);}
		if(arg[0].equals("TV")){
			Main.itemID++;
			Tv d = new Tv (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), Integer.parseInt(arg[6]));
         	Main.tv.add(d);
         	Main.item.add(d);}
		
		if(arg[0].equals("SMARTPHONE")){
			Main.itemID++;
			SmartPhone d = new SmartPhone (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), arg[6]);
         	Main.smartphone.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("BOOK")){
			Main.itemID++;
			Book d = new Book (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								arg[4], arg[5],Integer.parseInt(arg[6]));
         	Main.book.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("CDDVD")){
			Main.itemID++;
			CdDvd d = new CdDvd (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								arg[4], arg[5]);
         	Main.cddvd.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("HAIRCARE")){
			Main.itemID++;
			HairCare d = new HairCare (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), Integer.parseInt(arg[6]), 
								Integer.parseInt(arg[7]));
         	Main.haircare.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("PERFUME")){
			Main.itemID++;
			Perfume d = new Perfume (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), Integer.parseInt(arg[6]), 
								Integer.parseInt(arg[7]));
         	Main.perfume.add(d);
         	Main.item.add(d);}
		if(arg[0].equals("SKINCARE")){
			Main.itemID++;
			SkinCare d = new SkinCare (Main.itemID,arg[0],Integer.parseInt(arg[1]), arg[2], arg[3], 
								Integer.parseInt(arg[4]), Integer.parseInt(arg[5]), Integer.parseInt(arg[6]), 
								Integer.parseInt(arg[7]));
         	Main.skincare.add(d);
         	Main.item.add(d);}}
	/**
	 * This function creates to string method and given information about technicians.
	 */
	public String toString(){
	    return this.userName+" "+this.name + " " + this.mail + " " + this.birthDate+" "+
	    		this.salary+" "+this.isSeniorTechnician;}
}
