/**
 * @author MeltemTokgoz
 * @version Java Jdk-8, EclipseNeon2.0
 * @since 08.04.2017
 * 
 */ 

public class Admin extends Employees {
	String password;
	/**
	 * Class constructor without parameters.
	 */
	public Admin(){
	}
	/**
	 * Class constructor with parameter.
	 * @param userName This parameter gives the type of user's.For example TECH, ADMIN...
	 * @param name This parameter gives the name of admin
	 * @param mail This parameter gives the mail of admin
	 * @param birthDate This parameter gives the birth date of admin
	 * @param salary This parameter gives the salary of admin
	 * @param password This parameter gives the password of admin
	 */
	public Admin(String userName,String name,String mail,String birthDate,int salary,String password){
		super.userName= userName;
		super.name= name;
		super.mail= mail;
		super.birthDate= birthDate;
		super.salary= salary;
		this.password= password;	
	}
	/**
	 * Password for getter method
	 * Password of the admin
	 * @return The current value of admin's password.
	 */
	public String Getpassword() {
	    return password;}
	/**
	 * Password for setter method
	 * Changes the password of this admin.
	 * @param password  A new value for the admin password
	 */
	public void setPassword(String password) {
	    this.password= password;}
	
	/**
	 * 
	 *This function adds new customer to cust arraylist
	 *
	 * @param customerName This parameter gives the name of customer.
	 * @param customerMail This parameter gives the  e-mail of customer
	 * @param customerDateofBirth This parameter gives the birth date of customer
	 * @param initialBalance This parameter gives the initial balance of customer
	 * @param password This parameter gives the password of customer
	 */
	public void AddCustomer(String customerName, String customerMail,String customerDateofBirth,
							int initialBalance, String password){
		Main.ID++;
		Customer c = new Customer("CUSTOMER",Main.ID,customerName,customerMail, customerDateofBirth,initialBalance,
									password, Customer.shopcart );
 	    Main.cust.add(c);}
	
	/** 
	 * This function shows the customer according to given ID
	 * @param customerID This parameter gives the ID of customer.
	 */
	public static void ShowCustomer(int customerID){
		for(Customer l: Main.cust){
		if(customerID == l.getID()){
			System.out.println("Customer name: "+l.getName()+" ID: "+l.getID()+" e-mail: "+l.getMail()+" Date of Birth: "+l.birthDate
            		+" Status:"+l.getStatus());}}}
	
	/**
	 * This function shows the all customer.
	 */
	public static void ShowCustomers(){
		for(Customer l: Main.cust){
                System.out.println("Customer name: "+l.getName()+"\tID: "+l.getID()+"\te-mail: "+l.getMail()+"\tDate of Birth: "+l.birthDate
                		+"\tStatus:"+l.status);}}
	
	/**
	 * This function shows information about admin according to given admin name.
	 * @param adminName This parameter gives the name of admin
	 */
	public void ShowAdminInfo(String adminName){
		for(Admin m: Main.admin){
    		if(m.getName().equals(adminName)){
    			System.out.println(" ----------- Admin info -----------"+"\nAdmin name: "+
    								m.getName()+"\nAdmin e-mail: "+m.getMail()+
    								"\nAdmin date of birth: "+m.getBirthDate());}}}

	/**
	 *This function start new campaign
	 * @param startDate This parameter gives campaign start date
	 * @param endDate This parameter gives campaign end date
	 * @param itemType This parameter gives item type
	 * @param rate This parameter gives discount rate in the item
	 */
	public void CreateCampaign(String startDate, String endDate, String itemType, int rate){
		for(Items y: Main.item){
			if(rate < 50){
			if(itemType.equals(y.getItemName())){
				int newCost= y.getItemCost()-((y.getItemCost()*rate)/100);
				y.setItemCost(newCost);}}}
		if(rate >50){
		System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");}}
	
	/**
	 * This function adds new admin to admin and employees arraylist.
	 * @param newAdminName  This parameter gives the name of new admin
	 * @param newAdminMail This parameter gives the mail of new admin
	 * @param newAdminDateofBirth This parameter gives the birth date of new admin
	 * @param newAdminSalary This parameter gives the salary of new admin
	 * @param newAdminPassword  This parameter gives the password of new admin
	 */
	public void AddAdmin(String newAdminName, String newAdminMail, String  newAdminDateofBirth, int newAdminSalary, String newAdminPassword){
		
		
		Admin a = new Admin("ADMIN",newAdminName, newAdminMail,newAdminDateofBirth,newAdminSalary, newAdminPassword);
		Main.admin.add(a);
		Main.employees.add(a);}
	
	/**
	 * This function adds new technician to tech and employees arraylist.
	 * If condition is true  adds new technician to senior  arraylist.
	 * @param newTechName name This parameter gives the name of new technicians
	 * @param newTechMail This parameter gives the mail of new technicians
	 * @param newTechDateofBirth This parameter gives the birth date of new technicians
	 * @param newTechSalary This parameter gives the salary of new technicians
	 * @param isSenior This parameter show senior or not.
	 */
	public void AddTech(String newTechName, String newTechMail, String newTechDateofBirth,
							int newTechSalary, int isSenior){
		Technicians t4 = new Technicians("TECH",newTechName,newTechMail,newTechDateofBirth,newTechSalary,isSenior);
		 Main.tech.add(t4);
		 Main.employees.add(t4);
		 
		 if(isSenior == 1){
      	   Senior t5 = new Senior("TECH",newTechName,newTechMail,newTechDateofBirth,newTechSalary);
      	   Main.senior.add(t5);}}
	
	/**
	 * This function creates to string method and given information about admin's.
	 */
	public String toString(){
	    return this.userName+" "+this.name + " " + this.mail + " " + this.birthDate+" "+
	    		this.salary+" "+this.password;}
}

