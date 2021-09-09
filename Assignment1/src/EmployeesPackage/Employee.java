package EmployeesPackage;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable
  
{
    float rate = 30.0f;
    float taxrate = .2f;
    int hours = 45;
    float gross = 0.0f;
    float tax = 0.0f;
    float net = 0.0f;
    float net_percent =0.0f;
   


public Employee()
{

}

public void menu()

{

    Scanner sc = new Scanner(System.in);
    
    int selection;
    
    boolean exit = false;
    while(!exit)
    {
        System.out.println("1) Calculate Gross Pay");
        System.out.println("2) Calculate Tax");
        System.out.println("3) Calculate Net Pay");
        System.out.println("4) Calculate Net Percent");
        System.out.println("5) Display All");
        System.out.println("6) Exit");
        System.out.println("Please select an option");
        selection = sc.nextInt();
        if (selection < 1 || selection > 6)
        {
            System.out.println("Invalid choice.  Please try again: ");
        }
        switch(selection)
        {
            case 1:
                computeGross();
                break;
            case 2:
                computeTax();
                break;
            case 3:
                computeNet();
                break;
            case 4:
                computeNetperc();
                break;
            case 5:
                displayEmployee();
                break;
            case 6:
                exit = true;
                break;
                
        
        }
    }
    
}

public void computeGross()

{
gross = rate*hours;
      
}

protected void computeTax()

{
tax = gross*taxrate;
}

protected void computeNet()
{
    net = gross-tax;
}

protected void computeNetperc()
 
{
    net_percent = (net/gross)*100;
}

protected void displayEmployee()
        
{
    
    computeTax();
    computeNet();
    computeNetperc();


    System.out.println("Hours: " + new Integer(hours));
    System.out.println("Rate: " + new Float(rate));
    System.out.println("Gross: " + new Float(gross));
    System.out.println("Net: " + new Float(net));
    System.out.println("Net%: " + new Float(net_percent) + "%");
}
        
}

