import java.util.Scanner;
interface MedicalService{
double calculatecharge();
}

abstract class HospitalService implements MedicalService{
int ser_id;
String patientname;
abstract void  displaydetails(int s,String pname);      
}
class Consultationservice extends HospitalService{
double consultationfee=500;

 public double calculatecharge() {
   
    return consultationfee;
 }
public void displaydetails(int s,String pname){
    
      ser_id=s;
      patientname=pname;
          System.out.println("Patient Name "+patientname);
          System.out.println("Service ID "+s);
          System.out.println("Total Charges: "+consultationfee);
}
}
class LabTestService extends HospitalService{
    int no_of_test;
    int costper_test=400;
     int result;
     LabTestService(int n)
     {
        no_of_test=n;
     }
     public double calculatecharge(){
        
       
      result=no_of_test*costper_test;
      return result;
    }

    public void displaydetails(int s,String pname){
        
         ser_id=s;
      patientname=pname;
        System.out.println("Lab test Service");

    
         System.out.println("Patient Name "+patientname);
        System.out.println("Service ID "+s);
        System.out.println("Number of tests: "+no_of_test);
        System.out.println("Cost per test: "+costper_test);
          System.out.println("Total Charges: "+result);
    }
   
}
class EmergencyService extends HospitalService{
    double basecharge=2000;
    double emergencylevelcharge=1500;
    double calc;

    public double calculatecharge(){
calc=basecharge+emergencylevelcharge;
return calc;

    }
    public void displaydetails(int s,String pname){
         ser_id=s;
         patientname=pname;
         System.out.println("Emergency Service");

    
         System.out.println("Patient Name "+patientname);
         System.out.println("Service ID "+s);
         System.out.println("Base Charge: "+basecharge);
         System.out.println("Emergency Level Charge: "+emergencylevelcharge);
         System.out.println("Total Charges: "+calc);


    }
}



class HospitalManagementSystem{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
       System.out.println("Hospital Management System");
      System.out.println("Enter Patient Name:");
      String pname=sc.nextLine();
    System.out.println("Enter Patient Service ID");
    int s=sc.nextInt();

     System.out.println("--Service Menu--");
     System.out.println("1)Consultation");
       System.out.println("2)Lab Test");
         System.out.println("3)Emergency");
           System.out.println("Choose Service (1-3): ");
           int choice= sc.nextInt();
    if(choice==1){
        Consultationservice c=new Consultationservice();
        c.calculatecharge();
        c.displaydetails(s,pname);

       
    }
    else if(choice ==2){
         System.out.println("Enter Number of test: ");
         int n= sc.nextInt();
         LabTestService l= new  LabTestService(n);
          l.calculatecharge();
        l.displaydetails(s,pname);

    }
    else if(choice == 3)
    {   EmergencyService e = new EmergencyService();
        e.calculatecharge();
        e.displaydetails(s,pname);

    }
    else{
         System.out.println("Enter a valid choice");
    }
   

}
}