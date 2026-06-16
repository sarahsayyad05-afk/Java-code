public class Static_method{
    int b;//non static, it is instance variable cannot be accessed in the static block
    static void display()
    { int a=10;
        System.out.println("This is static method");//
        System.out.println(a);
    }
    public static void main(String[] args) {
        Static_method.display();
    }
}