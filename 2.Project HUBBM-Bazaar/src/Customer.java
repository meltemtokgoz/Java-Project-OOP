/**
 * This class is about the customer from users.This class holds the values and methods of the Customer.
 * 
 * @author MeltemTokgoz
 * @version EclipseNeon2.0
 * @since 08.04.2017
 */
import java.util.Date;
import java.util.ArrayList;
public class Customer extends Users {
	static ArrayList<Items> shopcart = new ArrayList<Items>();
	int ID;
	String password;
	double balance;
	String status= "CLASSIC";

	/**
	 *  Class constructor without parameters.
	 */
	public Customer(){
	}
	/**
	 * Class constructor with parameter.
	 * @param userName This parameter is customer's type
	 * @param ID This parameter is customer's ID
	 * @param name This parameter is customer's name
	 * @param mail This parameter is customer's mail
	 * @param birthDate This parameter is customer's birth date
	 * @param balance This parameter is customer's balance
	 * @param password This parameter is customer's password
	 * @param shopcart This parameter is customer's shop cart
	 */
	public Customer(String userName,int ID, String name,String mail,String birthDate,double balance,
						String password, ArrayList shopcart){
		this.ID=ID;
		super.userName=userName;
		super.name= name;
		super.mail= mail;
		super.birthDate= birthDate;
		this.password= password;
		this.balance= balance;
	}
	/**
	 * 
	 * @return The current value of customer's ID
	 */
	public  int getID() {
	    return ID;}
	/**
	 * 
	 * @param ID A new value for the customer's ID
	 */
	public void setID(int ID) {
	    this.ID = ID;}

	/**
	 * 
	 * @return The current value of  customer's password
	 */
	public  String getpassword() {
	    return password;}
	/**
	 * 
	 * @param password A new value for the customer's password
	 */
	public void setPassword(String password) {
	    this.password= password;}
	/**
	 * 
	 * @return The current value of customer's balance
	 */
	public  double getBalance() {
	    return balance;}
	/**
	 * 
	 * @param balance A new value for the customer's balance 
	 */
	public void setBalance(double balance) {
	    this.balance = balance;}
	
	/**
	 * 
	 * @return The current value of customer's status
	 */
	public  String getStatus() {
	    return status;}
	/**
	 * 
	 * @param status A new value for the customer's status
	 */
	public void setStatus(String status) {
	    this.status= status;}
	/**
	 * 
	 * @return The current value of customer's shopcart
	 */
	public  ArrayList getShopCart() {
	    return shopcart ;}
	/**
	 * 
	 * @param s A new value for the customer's shop cart
	 */
	public void setShopCart(Items s) {
	   this.shopcart.add(s);}
	
	/**
	 * This function updates customer's password.
	 * @param oldPassword this parameter is customer's old password 
	 * @param newPassword this parameter is customer's new password
	 */
	public  void ChPass(String oldPassword, String newPassword){
			if(oldPassword.equals(getpassword())){
				setPassword(newPassword);
				System.out.println("The password has been successfully changed.");}
			else{
				System.out.println("The given password does not match the current password. Please try again.");}
			}
	
	
	/**
	 * This function loads money to customer balance
	 * @param loadAmount This parameter amount of money to be loaded
	 */
	public void DepositMoney(double loadAmount){
			setBalance(getBalance()+loadAmount);}
	
	/**
	 * This function creates the campaigns and updates the item's cost.
	 */
	public void ShowCampaigns(){
		System.out.println("Active campaigns:");
		for(Campaign f: Main.campany){
			if(f.getrate()<50){
				System.out.println(f.rate+"%"+" sale of "+f.getitemType()+"  until "+f.endDate);
			}}
			if(Main.campany.size() == 0){
				System.out.println("No campaign has been created so far!");}}
	
	/**
	 * This function adds item to shop cart.
	 * @param itemID This parameter the product ID to add
	 */
	public void AddToCart(int itemID){
				boolean foundID = false;
				for(Items s: Main.item){
					if(itemID == s.getItemID()){
						if(s.getItemName() == "BOOK" || bk>0){
							setShopCart(s);}
						else if(s.getItemName().equals("DESKTOP")|| dsktp>0){
							setShopCart(s);}
						else if(s.getItemName().equals("LAPTOP")|| lptp>0){
						setShopCart(s);}
						else if(s.getItemName().equals("TV")|| tlvzyn>0){
						setShopCart(s);}
						else if(s.getItemName().equals("SMARTPHONE")|| smrtphn>0){
						setShopCart(s);}
						else if(s.getItemName().equals("CDDVD")|| cd>0){
						setShopCart(s);}
						else if(s.getItemName().equals("HAIRCARE")|| hrcr>0){
						setShopCart(s);}
						else if(s.getItemName().equals("SKINCARE")|| skncr>0){
						setShopCart(s);}
						else if(s.getItemName().equals("PERFUME")|| prfm>0){
						setShopCart(s);}
						else{System.out.println("We are sorry. The item is temporarily unavailable.");}
												
						System.out.println("The item "+s.getItemName()+" has been successfully added to your cart.");
						foundID = true;	
					}}
					if(!foundID){
						System.out.println("Invalid item ID");
					}}
	
	/**
	 * This function is emptys the shop cart
	 */
	public void EmptyCart(){
			shopcart.clear();
			System.out.println("The cart has been emptied.");
		}
			


	static int  bk = Main.book.size();
	static int cd = Main.cddvd.size();
	static int dsktp = Main.desktop.size();
	static int lptp = Main.laptop.size();
	static int tblt =Main.tablet.size();
	static int tlvzyn =Main.tv.size();
	static int smrtphn = Main.smartphone.size();
	static int hrcr =Main.haircare.size();
	static int prfm =Main.perfume.size();
	static int skncr =Main.skincare.size();
	/**
	 * This function is controls the condition.If true the condition,price calculates and customer purchases product.
	 * The stock is updates and emptys the shop cart.
	 * @param customerPassword This parameter the shopper's password
	 */
	public void Order(String customerPassword){
    			if(getShopCart().size() != 0){
    				if(customerPassword.equals(getpassword())){
    					if(getBalance() != 0 ){
    						if(getStatus().equals("CLASSIC")){
    							double totalcost=0;
    							for(Items c: shopcart){
    								totalcost += c.getItemCost();
    								if(getBalance()> totalcost){
    								if (c.getItemName().equals("BOOK")){
    										bk =bk - 1;}
    								if(c.getItemName().equals("DESKTOP")){
    									dsktp = dsktp - 1;}
    								if(c.getItemName().equals("LAPTOP")){
    									lptp =lptp - 1;}
    								if(c.getItemName().equals("TV")){
    									tlvzyn =tlvzyn-1;}
    								if(c.getItemName().equals("SMARTPHONE")){
    									smrtphn =smrtphn -1;}
    								if(c.getItemName().equals("CDDVD")){
    									cd =cd -1;}
    								if(c.getItemName().equals("HAIRCARE")){
    									hrcr =hrcr -1;}
    								if(c.getItemName().equals("SKINCARE")){
    									skncr = skncr -1;}
    								if(c.getItemName().equals("PERFUME")){
    									prfm  =prfm  -1;}
    								
    								setBalance(getBalance()-c.getItemCost());
    								
    								}}
    							shopcart.clear();
    							System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
    							
    							if(totalcost >= 1000 || totalcost < 5000){
    								setStatus("SILVER");
    							System.out.println("Congratulations! You have been upgraded to"
    												+ " a SILVER MEMBER! You have earned a discount of %10 on all purchases.");
    							System.out.println("You need to spend "+(5000-totalcost)+"more TL to become a GOLDEN MEMBER.");}
    							
    							if(totalcost < 1000){
    								System.out.println("You need to spend "+(1000-totalcost)+"more TL to become a SILVER MEMBER.");}
    							
    							if(totalcost >= 5000){
    								setStatus("GOLDEN");
    							System.out.println("Congratulations! You have been upgraded to"+
    												" a GOLDEN MEMBER! You have earned a discount of %15 on all purchases.");}
    							return;}
    						
    						
    						if(getStatus().equals("SILVER")){
    							double totalcost=0;
    							for(Items c: shopcart){
    								totalcost = (c.getItemCost()-((c.getItemCost()*10)/100));
    								if(getBalance()> totalcost){
    								setBalance(getBalance()-(c.getItemCost()-((c.getItemCost()*10)/100)));
    								if (c.getItemName().equals("BOOK")){
										bk =bk - 1;}
									if(c.getItemName().equals("DESKTOP")){
										dsktp = dsktp - 1;}
									if(c.getItemName().equals("LAPTOP")){
										lptp =lptp - 1;}
									if(c.getItemName().equals("TV")){
										tlvzyn =tlvzyn-1;}
									if(c.getItemName().equals("SMARTPHONE")){
										smrtphn =smrtphn -1;}
									if(c.getItemName().equals("CDDVD")){
										cd =cd -1;}
									if(c.getItemName().equals("HAIRCARE")){
										hrcr =hrcr -1;}
									if(c.getItemName().equals("SKINCARE")){
										skncr = skncr -1;}
									if(c.getItemName().equals("PERFUME")){
										prfm  =prfm  -1;}
    								}}
    							shopcart.clear();
    							System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
    							
    							if(totalcost >= 5000){
    								setStatus("GOLDEN");
    							System.out.println("Congratulations! You have been upgraded to"+
    												" a GOLDEN MEMBER! You have earned a discount of %15 on all purchases.");}
    							if(totalcost < 5000){
    								System.out.println("You need to spend "+( 5000-totalcost )+"more TL to become a GOLDEN MEMBER.");
    								}
    							return;}
    						
    						if(getStatus().equals("GOLDEN")){
    							double totalcost=0;
    							for(Items c: shopcart){
    								totalcost =( c.getItemCost() - ((c.getItemCost()*15)/100));
    								if(getBalance()> totalcost){
    								setBalance(getBalance()-(c.getItemCost()-((c.getItemCost()*15)/100)));
    								if (c.getItemName().equals("BOOK")){
										bk =bk - 1;}
									if(c.getItemName().equals("DESKTOP")){
										dsktp = dsktp - 1;}
									if(c.getItemName().equals("LAPTOP")){
										lptp =lptp - 1;}
									if(c.getItemName().equals("TV")){
										tlvzyn =tlvzyn-1;}
									if(c.getItemName().equals("SMARTPHONE")){
										smrtphn =smrtphn -1;}
									if(c.getItemName().equals("CDDVD")){
										cd =cd -1;}
									if(c.getItemName().equals("HAIRCARE")){
										hrcr =hrcr -1;}
									if(c.getItemName().equals("SKINCARE")){
										skncr = skncr -1;}
									if(c.getItemName().equals("PERFUME")){
										prfm  =prfm  -1;}
    								}}
    							shopcart.clear();
    							System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");}}
    					
    					
    					else{System.out.println("Order could not be placed. Insufficient funds.");}}
    				else{System.out.println("Order could not be placed. Invalid password.");}}
    			else{System.out.println("You should add some items to your cart before order request!");}}
    	
	
	/**
	 * This function creates to string method and given information about admin's.
	 */
	public String toString(){
	    return this.name+" "+this.ID+" "+this.mail+" "+this.birthDate+" "+this.status+" "+this.balance+" "+
	    				Main.shopCart;}
}
	