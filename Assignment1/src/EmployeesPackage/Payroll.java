
package EmployeesPackage;

import java.io.IOException;
import java.util.Scanner;

public class Payroll 

{
    
    Employee[] myaccts = new Employee [3];
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args) throws IOException
    {
        Payroll MyEMP = new Payroll();
        myEMP.SelectMenu();
    }
    
    
    
}
