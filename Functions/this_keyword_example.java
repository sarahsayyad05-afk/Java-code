public class this_keyword_example{
    int a,b;
    void setdata(int a,int b){
        this.a=a;
        this.b=b;
        show();

    }
    void show(){
        System.out.println("value of a and b: "+(a)+(b));
    }
    public static void main(String[] args) {
      this_keyword_example t=new this_keyword_example();
      t.setdata(20,30);
    }
}