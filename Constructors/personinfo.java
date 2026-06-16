import java.util.Scanner;
class person{
   
    int P_age;
    String P_name;
    void accept(Scanner sc){
        System.out.println("Name: ");
        P_name=sc.nextLine();
        System.out.println("Age: ");
        P_age=sc.nextInt();
    }
}
class emp extends person{

    int empId;
    long ph;
    void accept(Scanner sc){
        super.accept(sc);
        System.out.println("ID: ");
        empId=sc.nextInt();
        System.out.println("Phone no: ");
        ph=sc.nextLong();
    }
    void display(){
        System.out.println("Person and Emp Info:");
        System.out.println("P Name:"+P_name);
        System.out.println("Age : "+P_age);
        System.out.println("EmpID: "+empId);
        System.out.println("Phone no: "+ph);
    }
}
class personinfo{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    emp e=new emp();
    e.accept(sc);
    e.display();
    sc.close();
}
//distance * rent = charges
}