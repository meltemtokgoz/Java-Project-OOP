/**
 * This class is a main class.
 * 
 * @author MeltemTokgoz
 * @version EclipseNeon2.0
 * @since 08.04.2017
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static int ID=0;
	static int itemID=0;
	static String shopCart;
	static String orderHist;
	static ArrayList<Admin> admin = new ArrayList<Admin>();
    static ArrayList<Technicians> tech = new ArrayList<Technicians>();
    static ArrayList<Customer> cust = new ArrayList<Customer>();
    static ArrayList<Senior> senior = new ArrayList<Senior>();
    static ArrayList<Employees> employees = new ArrayList<Employees>();
    static ArrayList<Items>item = new ArrayList<Items>();
    static ArrayList<Desktop> desktop = new ArrayList<Desktop>();
    static ArrayList<Laptop> laptop = new ArrayList<Laptop>();
    static ArrayList<Tablet> tablet = new ArrayList<Tablet>();
    static ArrayList<Tv> tv = new ArrayList<Tv>();
    static ArrayList<SmartPhone> smartphone = new ArrayList<SmartPhone>();
    static ArrayList<Book> book = new ArrayList<Book>();
    static ArrayList<CdDvd> cddvd = new ArrayList<CdDvd>();
    static ArrayList<HairCare> haircare = new ArrayList<HairCare>();
    static ArrayList<SkinCare> skincare = new ArrayList<SkinCare>();
    static ArrayList<Perfume> perfume = new ArrayList<Perfume>();
    static ArrayList<Campaign> campany = new ArrayList<Campaign>();
  
   
    /**
     * 
     * @param args input files (0, users.txt 1, item.txt 2, commands.txt)
     */
	public static void main(String[] args) {  
		/**
		 * Program begins in main function.This function read the 
		 * input file, parse the input file ,  creates new object.Assigns the objects to the appropriate  dynmic arraylist
		 * and call the necessary functions.
		 */
        try {
            File file1 = new File((args[1]));
            Scanner sc = new Scanner(file1);

          
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split("\t");
                String itemName = details[0];
                int itemCost = Integer.parseInt(details[1]);
                
           
                if(line.startsWith("DESKTOP")){
                	String manufacturer = details[2];
                	String brand = details[3];
                	int maxVolt = Integer.parseInt(details[4]);
                	int maxWatt = Integer.parseInt(details[5]);
                	String operatingSystem = details[6];
                	String CPUType = details[7];
                	int ramCapacity = Integer.parseInt(details[8]); 
                	int HDDCapacity = Integer.parseInt(details[9]);
                	String boxColor = details[10];
                	
                	itemID++;
                	Desktop d = new Desktop (Main.itemID,itemName, itemCost, manufacturer, brand, maxVolt, maxWatt, 
      					   operatingSystem, CPUType, ramCapacity, HDDCapacity, boxColor);
                	desktop.add(d);
                	item.add(d);}
                
              
                
                if(line.startsWith("LAPTOP")){
                	String manufacturer = details[2];
                	String brand = details[3]; 
                	int maxVolt = Integer.parseInt(details[4]);
                	int maxWatt = Integer.parseInt(details[5]);
                	String operatingSystem = details[6];
                	String CPUType = details[7];
                	int ramCapacity = Integer.parseInt(details[8]);
                	int HDDCapacity = Integer.parseInt(details[9]);
                	int HDMISupport = Integer.parseInt(details[10]);
                	
                	itemID++;
                	Laptop l = new Laptop(Main.itemID,itemName, itemCost, manufacturer, brand, maxVolt,maxWatt,
       		             operatingSystem,CPUType,ramCapacity, HDDCapacity,HDMISupport);
                	laptop.add(l);
                	item.add(l);}
                
                if(line.startsWith("TABLET")){
					String manufacturer = details[2];
					String brand = details[3]; 
					int maxVolt = Integer.parseInt(details[4]); 
					int maxWatt = Integer.parseInt(details[5]);
					String operatingSystem = details[6];
					String CPUType = details[7];
					int ramCapacity = Integer.parseInt(details[8]);
					int HDDCapacity = Integer.parseInt(details[9]);
					int dimension = Integer.parseInt(details[10]);
					
					itemID++;
					Tablet t1 = new Tablet(Main.itemID,itemName, itemCost, manufacturer,	brand, maxVolt, maxWatt, 
            		        operatingSystem, CPUType, ramCapacity, HDDCapacity, dimension);
					tablet.add(t1);
					item.add(t1);}
                
                if(line.startsWith("TV")){
					String manufacturer = details[2];
					String brand = details[3]; 
					int maxVolt = Integer.parseInt(details[4]);
					int maxWatt = Integer.parseInt(details[5]);
					int screenSize = Integer.parseInt(details[6]);
					itemID++;
					Tv t2 = new Tv(Main.itemID,itemName,itemCost,manufacturer,brand,maxVolt,maxWatt,screenSize);
	                tv.add(t2);
					item.add(t2);}

				if(line.startsWith("SMARTPHONE")){
					String manufacturer = details[2];
					String brand = details[3];
					int maxVolt = Integer.parseInt(details[4]);
					int maxWatt = Integer.parseInt(details[5]);
					String screenType = details[6];
					itemID++;
					SmartPhone s = new SmartPhone(Main.itemID,itemName, itemCost,manufacturer,brand,maxVolt,
											maxWatt,screenType);
					smartphone.add(s);
					item.add(s);}

			    if(line.startsWith("BOOK")){
	                String releaseDate = details[2];
	                String publisherName = details[3];
	                String coverTitle = details[4];
	                String author = details[5];
	                int pageNumber = Integer.parseInt(details[6]);
	                itemID++;
	                Book b = new Book(Main.itemID,itemName,itemCost,releaseDate,publisherName,
	    								coverTitle,author,pageNumber);
	                book.add(b);
	                item.add(b);}
	
			    if(line.startsWith("CDDVD")){
                	String releaseDate = details[2];
                	String coverTitle = details[3];
                	String composerName = details[4];
                	String song = details[5];
                	itemID++;
                	CdDvd c = new CdDvd(Main.itemID,itemName,itemCost,releaseDate,coverTitle,composerName,song);
                    cddvd.add(c);
                	item.add(c);}
 
				if(line.startsWith("HAIRCARE")){
					String manufacturer = details[2];
					String brand = details[3];
					int isOrganic = Integer.parseInt(details[4]);
					int expirationYear = Integer.parseInt(details[5]);
					int weight = Integer.parseInt(details[6]);
					int isMedicated = Integer.parseInt(details[7]);
					itemID++;
					HairCare h = new HairCare(Main.itemID,itemName,itemCost,manufacturer,brand,isOrganic,
							expirationYear,weight,isMedicated);
					haircare.add(h);
					item.add(h);}

				if(line.startsWith("SKINCARE")){
					String manufacturer = details[2];
					String brand = details[3];
					int isOrganic = Integer.parseInt(details[4]);
					int expirationYear = Integer.parseInt(details[5]);
					int weight = Integer.parseInt(details[6]);
					int babySensitive = Integer.parseInt(details[7]);
					itemID++;
					SkinCare s2 = new SkinCare(Main.itemID,itemName,itemCost,manufacturer,brand,isOrganic,
							                expirationYear,weight,babySensitive);
					skincare.add(s2);
					item.add(s2);}

				if(line.startsWith("PERFUME")){
					String manufacturer = details[2];
					String brand = details[3];
					int isOrganic = Integer.parseInt(details[4]);
					int expirationYear = Integer.parseInt(details[5]);
					int weight = Integer.parseInt(details[6]);
					int lastingDuration = Integer.parseInt(details[7]);
					itemID++;
					Perfume p = new Perfume(Main.itemID,itemName,itemCost,manufacturer,brand,isOrganic,
											expirationYear,weight,lastingDuration);
					perfume.add(p);
					item.add(p);}
				}       
           
	        File file2 = new File((args[0]));
	        Scanner sc2 = new Scanner(file2);
	
	        
	        while(sc2.hasNextLine()){
	            String line2 = sc2.nextLine();
	            String[] element = line2.split("\t");
	            String userName = element[0];
	            String name =  element[1];
	            String email = element[2];
	            String  birthDate = element[3];
	             
		           if(line2.startsWith("ADMIN")){
		        	   int salary = Integer.parseInt(element[4]);
		        	   String password = element[5];
		        	   
		        	   Admin a = new Admin(userName,name,email,birthDate,salary,password);
		        	   admin.add(a);
		        	   employees.add(a);}
    
		           if(line2.startsWith("TECH")){
		        	   int salary = Integer.parseInt(element[4]);
		        	   int isSeniorTechnician = Integer.parseInt(element[5]);
		        	   
		        	   Technicians t3 = new Technicians(userName,name,email,birthDate,salary,isSeniorTechnician);
		        	   tech.add(t3);
		        	   employees.add(t3);

		           if(isSeniorTechnician == 1){
		        	   Senior t4 = new Senior(userName,name,email,birthDate,salary);
		        	   senior.add(t4);}}
  
		           if(line2.startsWith("CUSTOMER")){
		        	   double balance = Double.parseDouble(element[4]);
		        	   String password = element[5];
		        	   ID++;
		        	   Customer c = new Customer(userName,Main.ID,name,email,birthDate,balance,
		        			   						password, Customer.shopcart);
		        	   cust.add(c);}
		           }  
	        
	       
			Scanner file3 = new Scanner(new File((args[2])));
			while(file3.hasNextLine()){
				String[] parameter = file3.nextLine().split("\t");
				String actionName =  parameter[0];
	         
	            if(actionName.equals("ADDCUSTOMER")){
	            	String adminName =  parameter[1];
	            	String customerName =  parameter[2];
	            	String customerMail =  parameter[3];
	            	String customerDateofBirth =  parameter[4];
	            	int initialBalance = Integer.parseInt( parameter[5]);
	            	String password =  parameter[6];
	            	
	            	boolean foundmanager = false;
	        	   for(Admin k: admin){
	        		if(adminName.equals(k.getName())){
	   	            k.AddCustomer(customerName, customerMail, customerDateofBirth,initialBalance,password);
	   	            foundmanager = true;}}
	        	   if(!foundmanager){
            		System.out.println("No admin person named "+adminName+" exists!");}}
            
	            if(actionName.equals("SHOWCUSTOMER")){
	            	String adminName =  parameter[1];
	            	int customerID  = Integer.parseInt( parameter[2]);
	            	boolean foundmanager = false;
	            	for(Admin k: admin){
	            		if(adminName.equals(k.getName())){
		   	            k.ShowCustomer(customerID);
		   	         foundmanager = true;}}
	            		if(!foundmanager){
	                		System.out.println("No admin person named "+adminName+" exists!");}}
	                
	            		
	            if(actionName.equals("SHOWCUSTOMERS")){
	            	String adminName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Admin k: admin){
	            		if( adminName.equals(k.getName())){
		   	            k.ShowCustomers();
		   	         foundmanager = true;}}
	            	if(!foundmanager){
	                		System.out.println("No admin person named "+adminName+" exists!");}}
	                
	            
	            	
	            if(actionName.equals("SHOWADMININFO")){
	            	String adminName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Admin k: admin){
	            		if( adminName.equals(k.getName())){
		   	            k.ShowAdminInfo(adminName);
		   	            foundmanager = true;}}
	            		if(!foundmanager){
	                		System.out.println("No admin person named "+adminName+" exists!");}}
	                
	            		
	            if(actionName.equals("CREATECAMPAIGN")){
	            	String adminName =  parameter[1];
	            	String startDate = parameter[2];
	            	String endDate = parameter[3];
	            	String itemType = parameter[4];
	            	int rate = Integer.parseInt( parameter[5]);
	            	
	            	
	            	Campaign d = new Campaign (startDate,endDate,itemType,rate);
	                campany.add(d);
	             
	            	
	            	
	            	boolean foundmanager = false;
	            	for(Admin k: admin){
	            		if( adminName.equals(k.getName())){
		   	            k.CreateCampaign(startDate,endDate,itemType,rate);
		   	         foundmanager = true;}}
	            	if(!foundmanager){
	                		System.out.println("No admin person named "+adminName+" exists!");}}
				
	                
	           if(actionName.equals("ADDADMIN")){
	            	String adminName =  parameter[1];
	            	String newAdminName = parameter[2];
	            	String newAdminMail = parameter[3];
	            	String newAdminDateofBirth = parameter[4];
	            	int newAdminSalary = Integer.parseInt( parameter[5]);
	            	String newAdminPassword = parameter[6];
	            	
	            	boolean foundmanager = false;
	            	Admin admn=null;
	            	for(Admin k: admin){
	            		if( adminName.equals(k.getName()) ){
	            			admn = k;
		   	            foundmanager = true;}}
	            	admn.AddAdmin(newAdminName, newAdminMail, newAdminDateofBirth, newAdminSalary, newAdminPassword);
	            	if(!foundmanager){
                		System.out.println("No admin person named "+adminName+" exists!");}}
	           

	           
	            
	            if(actionName.equals("ADDTECH")){
	            	String adminName =  parameter[1];
	            	String newTechName = parameter[2];
	            	String newTechMail = parameter[3];
	            	String newTechDateofBirth = parameter[4];
	            	int newTechSalary = Integer.parseInt( parameter[5]);
	            	int isSenior = Integer.parseInt(parameter[6]);
	            	
	            	boolean foundmanager = false;
	            	Admin tch =null;
	            	for(Admin k: admin){
	            		if( adminName.equals(k.getName())){
		   	            tch = k;
		   	         foundmanager = true;}}
	            	 tch.AddTech(newTechName,newTechMail,newTechDateofBirth,newTechSalary,isSenior);
	       
	            	if(!foundmanager){
	                		System.out.println("No admin person named "+adminName+" exists!");}}

  
	            if(actionName.equals("LISTITEM")){
	            	String adtechName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Employees l: employees){
	            		if(adtechName.equals(l.getName())){
		   	            l.ListItem();
		   	         foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No admin or technician person named "+adtechName+" exists!");}}
	            		
	            
	            if(actionName.equals("SHOWITEMSLOWONSTOCK")){
	            	String adtechName =  parameter[1];
	            	int maxStockAmount = Integer.parseInt(parameter[2]);
	            	
	            	boolean foundmanager = false;
	            	for(Employees l: employees){
	            		if(adtechName.equals(l.getName())){
	            			l.ShowItemLownOnStock(maxStockAmount);
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No admin or technician person named "+adtechName+" exists!");}}
	            		
	            		
	            
	            if(actionName.equals("SHOWITEMSLOWONSTOCK")){
	            	String adtechName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Employees l: employees){
	            		if(adtechName.equals(l.getName())){
	            			l.ShowItemLownOnStock();
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No admin or technician person named "+adtechName+" exists!");}}
	            		
	            		
	            if(actionName.equals("SHOWVIP")){
	            	String adtechName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Employees l: employees){
	            		if(adtechName.equals(l.getName())){
	            			l.ShowVip();
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No admin or technician person named "+adtechName+" exists!");}}
	            		
 
	            /*if(actionName.equals("DISPITEMSOF")){
	            	String techName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Technicians m: tech){
	            		if(techName == m.getName()){
	            			String type =  parameter[2];
	            			m.DispItemsOf(type);
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No technician person named "+techName+" exists!");}}*/
	            		
	            if(actionName.equals("ADDITEM")){
	            	String techName =  parameter[1];
	            	String itemType =  parameter[2];
	            	boolean foundmanager = false;
	            	Technicians techn = null;
	            	for(Technicians m: tech){
	            		if(techName.equals(m.getName())){
	            		techn = m;
	            		foundmanager = true;}}
	            	techn.AddItem(itemType);
	            	if(!foundmanager){
		            		System.out.println("No technician person named "+techName+" exists!");}}
	         
	            		
	            if(actionName.equals("SHOWORDERS")){
	            	String seniorName =  parameter[1];
	            	boolean foundmanager = false;
	            	for(Senior n: senior){
	            		if(seniorName.equals(n.getName())){
	            			n.ShowOrders();
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No technician person named "+seniorName+" exists!");}}
	            	
	            if(actionName.equals("CHPASS")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	String oldPassword = parameter[2];
	            	String newPassword = parameter[3];
	            	
	            	boolean foundcustomer = false;
	            	for(Customer n: cust){
	            		if(customerID == n.getID()){
	            			n.ChPass(oldPassword,newPassword);
	            			foundcustomer = true;}}
	            	if(!foundcustomer){
		            		System.out.println("No customer with ID number "+customerID+" exists!");}}
	            		
	            if(actionName.equals("DEPOSITMONEY")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	double loadAmount = Double.parseDouble( parameter[2]);
	            	
	            	boolean foundmanager = false;
	            	for(Customer n: cust){
	            		if(customerID == n.getID()){
	            			n.DepositMoney(loadAmount);
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No customer with ID number "+customerID+" exists!");}}
	            		
	            if(actionName.equals("SHOWCAMPAIGNS")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	boolean foundmanager = false;
	            	for(Customer n: cust){
	            		if(customerID == n.getID()){
	            			n.ShowCampaigns();
	            			foundmanager = true;}}
	            	if(!foundmanager){
		            		System.out.println("No customer with ID number "+customerID+" exists!");}}
	            		
	            	
	            if(actionName.equals("ADDTOCART")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	int itemID = Integer.parseInt( parameter[2]);
	            	
	            	boolean foundmanager = false;
	            	for(Customer n: cust){
	            		if(n.getID()==customerID){
	            			n.AddToCart(itemID);
	            			foundmanager = true;
	            			break;}}
	            		if(!foundmanager){
		            		System.out.println("No customer with ID number "+customerID+" exists!");}}
	            		
	            if(actionName.equals("EMPTYCART")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	boolean foundmanager = false;
	            	for(Customer n: cust){
	            		if(customerID == n.getID()){
	            			n.EmptyCart();
	            			foundmanager = true;}}
	            		if(!foundmanager){
		            		System.out.println("No customer with ID number "+customerID+" exists!");}}
	            		
	            if(actionName.equals("ORDER")){
	            	int customerID = Integer.parseInt( parameter[1]);
	            	String customerPassword = parameter[2];
	            	boolean foundmanager = false;
	            	for(Customer n: Main.cust){
	            		if(customerID == n.getID()){
	            			n.Order(customerPassword);
	            			foundmanager = true;}}
	            	if(!foundmanager){
	        		System.out.println("No customer with ID number "+customerID+" exists!");}}
			}
			
			
        }
            catch (FileNotFoundException e) {         
            e.printStackTrace();}
    }
}

	


	


