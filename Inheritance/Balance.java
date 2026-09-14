abstract class Account{
    //parent is what to do
 double balance;
 abstract void calculate_intrest();
 Account(double a){
      balance=a;
 }
}
class Savings_acc extends Account{
    //child is how to do
    double interestrate;
     Savings_acc(double a,double  b){
        super(a);
      interestrate=b;
}
    

    void calculate_intrest(){
        double interest=balance*interestrate;
        balance+=interest;
        System.out.println("Balance: "+balance);
    }
    

}
class CurrentAcc extends Account{
 double interestrate;
    public CurrentAcc(double a,double  b){
        super(a);
     interestrate=b;
    }
    

void calculate_intrest(){
         double interest=balance*interestrate;
        balance+=interest;
        System.out.println("Balance: "+balance);
    }
    
}
class Balance{
public static void main(String[] args) {
    Savings_acc s=new Savings_acc(40000,0.05);
    s.calculate_intrest();
    CurrentAcc c=new CurrentAcc(40000,0.0);
    c.calculate_intrest();

}
}
