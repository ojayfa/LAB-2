/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

/**
 *
 * @author DELL
 */
public class StaffInformation {
    private String Id; 
    private String Name; 
    private String Salary; 
    private String Branch; 
    
    StaffInformation (String Id, String Name, String Salary, String Branch){
    this.Id = Id;
    this.Name = Name;
    this.Salary = Salary; 
    this.Branch = Branch; 
}
    String getId(){
        return Id; 
    }
    String getName(){
        return Name;
    }
    String getSalary(){
        return Salary;
    }
    String getBranch(){
        return Branch;
    }
    void setNmae(){
        this.Name = Name;
    }
    void setSalary(){
        this.Salary = Salary;
    }
    void setBranch(){
        this.Branch = Branch; 
    }
}


