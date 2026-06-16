 //create a class employee w datamembers empId,ename,ephone.
 //initialize the datamembers using parameterize constructor for two employee and display it
class Employee{
    int E_id;
    String ename;
    long phone;

    Employee(int E_id, String ename, long phone) {
        this.E_id = E_id;
        this.ename = ename;
        this.phone = phone;
    }
    void display(){
        System.out.println("Employee details:");
        System.out.println("Name:"+ename);
        System.out.println("Emp_Id: "+E_id);
        System.out.println("Phone no: "+phone);
    }
    public static void main(String[] args) {
        Employee e=new Employee(356,"Sarah",934566832);
        e.display();
    }
    
    
}