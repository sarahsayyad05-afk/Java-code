//create a interface resizeable,with abstract methods resize_width(int width)
//and resizeable_height(int height) that allow an object to resize.
//create a class rectangle that implements reiseable interface 
//and initialize datamembers of class rectangle w constructor
interface resizeable{
   void  resize_width(int width);
    void resize_height(int height);
}
class rectangle implements resizeable{
    int h;
    int w;

    public rectangle(int h, int w) {
        this.h = h;
        this.w = w;
        System.out.println("original width: "+w);
        System.out.println("original height: "+h);
    }
    
    public void  resize_width(int width){
          
          w=width;
           System.out.println("resize width to:"+w);
    }
  public  void resize_height(int height){
     h=height;
           System.out.println("resize height to:"+h);

    }

}

class interface_ex2{
    public static void main(String[] args) {
        rectangle r=new rectangle(10, 20);
        r.resize_width(60);
        r.resize_height(30);
    }
}