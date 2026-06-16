public class Static_variable{
    static int count;
    void f1(){
        count++;
        System.out.println(count);

    }

     public static void main(String[] args) {
         Static_variable s1= new Static_variable();
         Static_variable s2= new Static_variable();
         Static_variable s3= new Static_variable();
         s1.f1();
          s2.f1();
         s3.f1();
     }
}