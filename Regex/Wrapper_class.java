public class Wrapper_class {
// used to convert primitive datatypes into objects
    public static void main(String[] args) {
        //valueOf method converts primitive data types to wrapper object
        //string-> wrapper object
        //synatx: WrapperClass.valeOf(value)
        Byte b1=Byte.valueOf("123");
        System.out.println(b1);
        Short s=Short.valueOf("20");
        System.out.println(s);
        Integer i=Integer.valueOf("15");
        System.out.println(i);
         Integer i1=Integer.valueOf("ten");
        System.out.println(i1);//throws numberformat exception
         Integer I=Integer.valueOf(101);
        System.out.println(I);//this format is only applicable for integer.

        Float f=Float.valueOf(10.4f);
        System.out.println(f);

         Double d=Double.valueOf(10.489);
        System.out.println(d);

        Boolean b=Boolean.valueOf("true");
        System.out.println(b);
        Boolean b1=Boolean.valueOf("false");
        System.out.println(b1);



         

    }
}
