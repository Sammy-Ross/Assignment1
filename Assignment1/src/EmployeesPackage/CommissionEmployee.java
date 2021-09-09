package EmployeesPackage;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
    

    @Override
    public void computeGross()
            
    {
        int items;
        float unitprice;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many items sold?");
        items = sc.nextInt();
        System.out.println("Unit price? $");
        unitprice = sc.nextInt();
        
        gross = (float)((items * unitprice)*.5);
        
    }
    
    
}
