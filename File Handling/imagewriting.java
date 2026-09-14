import java.io.*;


public class imagewriting {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\SAINATH\\OneDrive\\Pictures\\wall1.png");
            FileOutputStream fos=new FileOutputStream("output.png");
            int ch;
            while((ch=fis.read())!=-1){
                fos.write(ch);

            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
