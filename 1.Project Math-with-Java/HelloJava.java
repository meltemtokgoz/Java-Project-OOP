import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class HelloJava {
	public static void main(String[] args){
		/*Program begins in main function.This function read the 
		 input file, parse the input file and call the other functions.*/
		try {
		Scanner file = new Scanner(new File(args[0]));
		while(file.hasNextLine()){
			String[] split = file.nextLine().split(" ");
			String name = split[0];
			//Sum 
			if(name.equals("IntegrateReimann")){
				String sFuncName = split[1];
				double dStart = Double.parseDouble(split[2]);
				double dFinish = Double.parseDouble(split[3]);
				int iRectNum = Integer.parseInt(split[4]);
				System.out.println(name+" "+sFuncName+" "+dStart+" "+dFinish+" "+iRectNum+" Result:"
									+ MiddleReimannSum(sFuncName, dStart , dFinish, iRectNum));
			}
			//Arc function
			if(name.equals("Arcsinh")){
				double dValue = Double.parseDouble(split[1]);
				System.out.println(name+" "+dValue+" Result:"+ArcsinhFunc(dValue));
			}
			//Armstrong Numbers
			if(name.equals("Armstrong")){
				int dAmsValue = Integer.parseInt(split[1]);
				System.out.print(name+" "+dAmsValue+" Result:"); 
				ArmDigit(dAmsValue);
				
			}
		}
		file.close();
		}
		catch (FileNotFoundException ex) {
		System.out.println("No File Found!");
		return;
		}
	}
    //STAGE1
	public static double MiddleReimannSum (String Func, double dFirst, double dLast, int iAreaNum) {
		/*The function is calculated by dividing the region up into rectangles that together 
		form a region that is similar to the region being measured, then calculating the area
		for each of these shapes, and finally adding all of these small areas together.*/
	    double dDistance = (dLast - dFirst) / iAreaNum; 
	    double dMidPoint = dFirst + dDistance / 2.0;
	    double dTotal = 0.0;
	    
	    for (int m = 0; m < iAreaNum ; m++) {
	    	if(Func.equals("Func1")){
	        dTotal = dTotal + f1(dMidPoint);
	        }
	    	if(Func.equals("Func2")){
		        dTotal = dTotal + f2(dMidPoint);
		        }
	    	if(Func.equals("Func3")){
	    		dTotal = dTotal + f3(dMidPoint);
	    		}
	        dMidPoint = dMidPoint + dDistance;
	        }
	    return dTotal * dDistance;}
	public static double f1(double a){
	//IThis function define to Func1. Func1(x) = x^2-x+3 
		return Math.pow(a, 2)-a+3;
		}
	public static double f2(double b){
	//This function define to Func2. Func2(x) = (3sin(x)-4)^2
		return Math.pow((3*Math.sin(b)-4),2);
		}
	public static double f3(double c){
	//Func3 is Arcsinh(x).The function is call ArcsinhFunc()
		return ArcsinhFunc(c);
		}
	//STAGE 2
	public static double FactFunc (int iFactNum) {
	// I wrote the factorial function
		if(iFactNum==0)
	        return 1;
	    return iFactNum*FactFunc(iFactNum-1);
	    }
    public static double ArcsinhFunc(double x){
    /*This function define to arc function.*/
    	double dSum = 0.0;
    	if (Math.abs(x)<1){
	    	for(int d= 0; d<30; d++){
	    	   double y;
	    	   y = (Math.pow(-1,d)*(FactFunc(2*d)))/((Math.pow(4,d)*
	    			   (Math.pow(FactFunc(d),2))*(2*d+1)))*(Math.pow(x, (2*d+1)));
	    	   dSum = dSum + y;   
	    	}
	    }
    return dSum;
    }
	//STAGE3
	public static boolean AmsNumControl(int iNumber) {
		//This function that checks whether a number is an armstrong number.
	    int iIntNumber = iNumber;
	    String sNumStr = iNumber + "";
	    int iDigitNum = sNumStr.length();
	 
	    int iSum = 0;
	    while (iIntNumber != 0) {
	        int lastDigit = iIntNumber % 10;
	        iSum = iSum + (int) Math.pow(lastDigit, iDigitNum);
	        iIntNumber = iIntNumber / 10;
	        }
	    if (iSum == iNumber)
	        return true;
	    else
	        return false;
	    }
	public static void ArmDigit (int iDigit) {
		//The function set range of numbers for the given digit.
		//The function sends the specified numbers to the function AmsNumControl()
		int iFinishLimit =0;
		if(iDigit == 1)
			iFinishLimit =9; 
		if(iDigit == 2)
			iFinishLimit =99;
		if(iDigit == 3)
			iFinishLimit =999;
		if(iDigit == 4)
			iFinishLimit =9999;
		if(iDigit == 5)
			iFinishLimit =99999;
		if(iDigit ==6)
			iFinishLimit =999999;
		if(iDigit == 7)
			iFinishLimit =9999999;
		if(iDigit == 8)
			iFinishLimit =99999999;
		for(int t = 0; t <= iFinishLimit; t++) {
		   if (AmsNumControl(t))
		   System.out.print(t+" ");
		}
		}
	}





