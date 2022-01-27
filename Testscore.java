package checkmarxSastScanTest;

import java.util.*;
//This code fails to check for negative test scores or for test scores above 100.
public class Testscore {
  public static void main(String[] args) {
	  //Test1 - resource leaking
	  int testScore = 0;
	
	System.out.println("Enter test score: ");
    
	Scanner console = new Scanner (System.in);
	
	//https://java2blog.com/input-validation-java/
	// if (console.hasNextInt() { -- missing input validation here for test
	 testScore = console.nextInt();
	
    System.out.println("testScore is " + testScore);
	if (testScore >= 90)
		System.out.println("Your grade is A++++");
	else if (testScore >= 80)
		System.out.println("Your grade is B+");
	else if (testScore >= 70)
		System.out.println("Your grade is C+");
	else if (testScore >= 50)
		System.out.println("Your grade is D-");
	else 
		System.out.println("Your grade is F");
    //} -- close input validation
	
    // try to fail the build with following syntax error: add in 5/7/2021
    //this is rubbish code for testing:
	//"sqlQuery is: \n"+sqlQuery+"\n"
    //above trunk of code didn't fail the build #85, very strange
	
	// Test2 - SQL injection here
	//https://www.w3schools.com/sql/sql_injection.asp
	String sqlQuery;
	String txtUserID = null;
	
	System.out.println("Enter UserID: ");
    Scanner sc = new Scanner(System.in);
    if(sc.hasNext("[A-Za-z]*")) {	//validate for string input
    	txtUserID = sc.next();
        System.out.println("You entered a string value "+txtUserID);
    }else {
        System.out.println("Please Enter a Valid Value");
    }
	
	
	sqlQuery = "Select * from table1 where ID = " + txtUserID + "'";
	execute(sqlQuery);
	
	//Test 3 - Broken Authentication
	//Test 4 - Sensitive data
  }

private static void execute(String sqlQuery) {
	// TODO Auto-generated method stub
	
}
}