public class throwandthrows_ex {
    static void checkage(int age) throws Exception{

        if(age<18){
            throw new Exception("Age must be greater than 18");
        }
    }
    public static void main(String[] args) {
        try {
            checkage(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
