package EmployeesPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Payroll

{
    
    Employee[] accounts = new Employee [3];
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args) throws IOException
    {
        Payroll myEMP = new Payroll();
        myEMP.SelectMenu();
    }
    
    public void SelectMenu() throws IOException
            
    {
        
    int selection;
    boolean exit = false;
    while (!exit)
    {
            System.out.println("1) Populate employee");
            System.out.println("2) Select employee");
            System.out.println("3) Save employee");
            System.out.println("4) Load employee");
            System.out.println("5) Exit");
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
            if (selection < 1 || selection > 5)
    {
            System.out.println("Invalid choice. Try again: ");
    }

  
        switch(selection)
            {
                case 1:
                    populate();
                    break;
                case 2:
                    select();
                    break;
                case 3:
                    save();
                    break;
                case 4:
                    load();
                    break;
                case 5:
                    exit = true;
                    break;
        
    }
    }
}
    public void populate()
    {
        int selected = 0;
        for(int i = 0; i<accounts.length; i++)
        {
            if(accounts[i] == null)
            {
                selected = i;
                break;
            }
        }
        
        char input;
        System.out.println("Please select employee type.");
        input = sc.next().charAt(0);
        
        if(input == 'H' || input = 'h')
        {
            accounts[selected] = new HourlyEmployee();
            accounts[selected].computeGross();
        }
        
        else if(input == 'S'  || input == 's')
        {
            accounts[selected] = new SalaryEmployee();
            accounts[selected].computeGross();
        }
    }
    
}
