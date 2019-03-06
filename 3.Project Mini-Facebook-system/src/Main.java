/**
 * 
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Main {
	static int userID=0;
	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("MM/dd/yyyy");
	/** 
	 * Program begins in main function.This function read the 
	 * input file, parse the input file .Assigns the objects to the appropriate  dynmic arraylist
	 * and  call the necessary functions according to unique wors.
	 * @param args input files (0, users.txt 1 commands.txt)
	 * @throws ParseException parse exception
	 */
	public static void main(String[] args) throws ParseException {
		try {
			Scanner file1 = new Scanner(new File(args[0]));
			while(file1.hasNextLine()){
				String[] split = file1.nextLine().split("\t"); //split according to tab

				UserCollection.addUser(split[0],split[1],split[2], DATE_FORMATTER.parse(split[3]) ,split[4], UserCollection.userList, userID);
			}
			file1.close();
			
			Scanner file2 = new Scanner(new File(args[1]));
			while(file2.hasNextLine()){
				String[] element = file2.nextLine().split("\t"); //split according to tab
				
					if(element[0].equals("ADDUSER")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]+
											"\t"+element[2]+"\t"+element[3]+"\t"+element[4]+"\t"+element[5]);
						UserCollection.addUser(element[1],element[2], element[3] ,  DATE_FORMATTER.parse(element[4]), element[5],  UserCollection.userList, userID);
						System.out.println(element[1]+" has been successfully added.");
					}
					if(element[0].equals("REMOVEUSER")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]);
						UserCollection.removeUser(Integer.parseInt(element[1]),  UserCollection.userList);
					}
					if(element[0].equals("SIGNIN")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+" "+element[1]+"\t"+element[2]);
						UserCollection.signIn(element[1], element[2],  UserCollection.userList);
					}
					if(element[0].equals("SHOWPOSTS")){
						System.out.println("-----------------------"+"\nCommand: "+ element[0]+"\t"+element[1]);
						UserCollection.showPost(element[1]);
					}
					if(element[0].equals("UPDATEPROFILE")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]+
											" "+element[2]+" "+element[3]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
						usr.UpdateProfile(element[1], DATE_FORMATTER.parse(element[2]), element[3],usr);
									foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("CHPASS")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]+"\t"+element[2]);
					
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.ChangePassword(element[1], element[2],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("ADDFRIEND")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]);
						
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.AddFriend(element[1], usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("REMOVEFRIEND")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]);
					
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.RemoveFiend(element[1],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("ADDPOST-TEXT")){
						System.out.println("-----------------------"+"\nCommand: "
								+element[0]+"\t"+element[1]+"\t"+element[2]+"\t"+element[3]+"\t"+element[4]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.AddTextPost(element[1],(element[2]),element[3],element[4],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("ADDPOST-IMAGE")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]+
											" "+element[2]+"\t"+element[3]+"\t"+element[4]+"\t"+element[5]+"\t"+element[6]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.AddImagePost(element[1],element[2],element[3],element[4],element[5],element[6],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
						
					}
					if(element[0].equals("ADDPOST-VIDEO")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]+
								"\t"+element[2]+"\t"+element[3]+"\t"+element[4]+"\t"+element[5]+"\t"+element[6]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.AddVideoPost(element[1], element[2] ,element[3] ,element[4],element[5],Integer.parseInt(element[6]),usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("REMOVELASTPOST")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.RemovePost(usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("BLOCK")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]);
						
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.Block(element[1],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("UNBLOCK")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]+"\t"+element[1]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.UnBlock(element[1],usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("LISTFRIENDS")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.ListFriends(usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("LISTUSERS")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.ListUsers();
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("SHOWBLOCKEDFRIENDS")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.ShowBlockedFriend(usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("SHOWBLOCKEDUSERS")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						boolean foundsigninuser = false;
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
							usr.ShowBlockedUsers(usr);
							foundsigninuser = true;}}
						if(!foundsigninuser){
				    		System.out.println("Error: Please sign in and try again");}
					}
					if(element[0].equals("SIGNOUT")){
						System.out.println("-----------------------"+"\nCommand: "+element[0]);
						for(User usr:  UserCollection.userList){
							if(usr.signedIn == true){
								usr.SignOut(usr);
							}}}
					
			}
			file2.close();
		    }
		
		catch (FileNotFoundException ex) {
		System.out.println("No File Found!");
			return;
		}}}
