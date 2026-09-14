package com.company.ems.service;
import com.company.ems.model.employee;
import com.company.ems.util.Idgenerator;


public class employeeservices{
    employee [] e=new employee[50];
    int index=0;
public void addemp(String name,String depname,int sal){
    e[index]=new employee();
    
    e[index].setname(name);
    e[index].setdname(depname);
    e[index].setsal(sal);
     e[index].setId(Idgenerator.id());  
     index++;
    
}

public void searchemp(int id){
    boolean ans=false;
    for (int i = 0; i <index; i++) {
        if((e[i].id)==id){
            System.out.println("Employee Found:");
            System.out.println("Employee ID: "+e[i].id);
            System.out.println("Employee Name: "+e[i].name);
            System.out.println("Employee Department: "+e[i].depname);
            System.out.println("Employee Salary: "+e[i].salary);
            ans=true;
            break;
        }
        
        
    }
    if (ans==false){
        System.out.println("Employee not found");
    }
}
public void update(int id,int sal){
    for (int i = 0; i < index; i++) {
        if((e[i].id)==id){
            e[i].setsal(sal);
            System.out.println("Salary updated: "+sal);
            break;
        }
    }
        
}
public void display(){
    for (int i = 0; i <index; i++) {
        
            System.out.println("Employee "+(i+1)+" Information:");
            System.out.println("Employee ID: "+e[i].id);
            System.out.println("Employee Name: "+e[i].name);
            System.out.println("Employee Department: "+e[i].depname);
            System.out.println("Employee Salary: "+e[i].salary);
            System.out.println("----------------------------------------");
        }
        
}

}