class private_constructor{

     private private_constructor(){
             System.err.println("It is a private constructor");
    }
    public static void main(String[] args) {
        private_constructor pc=new private_constructor();
    }

}
