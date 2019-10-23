/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DeliverySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in); 
        StaffInformation[] staffinformation = new StaffInformation[10];
        
        for (int i = 0; i < staffinformation.length; i++){
            System.out.print("Please Enter Staff ID:");
            String Id = scan.nextLine();
            System.out.print("Please Enter Staff Name:");
            String Name = scan.nextLine();
            System.out.print("Please Enter Salary:");
            String Salary = scan.nextLine();
            System.out.print("Please Enter Branch:");
            String Branch = scan.nextLine();
            staffinformation[i] = new StaffInformation(Id, Name, Salary, Branch);
            }
        System.out.println("*******************************************************");
        
        for (int i = 0; i < staffinformation.length; i++){
            System.out.println("Staff ID:" + staffinformation[i].getId());
            System.out.println("Staff Name:" + staffinformation[i].getName());
            System.out.println("Salary:" + staffinformation[i].getSalary());
            System.out.println("Branch:" + staffinformation[i].getBranch());
        }
    }
    
}
