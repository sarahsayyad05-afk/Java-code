class fun_overloading{
    //to overload function area
    void area(int a)
    {
        //for square
        System.out.println("area of square: "+a*a);
    }
    void area(float pi,float r){
        //for circle
        System.out.println("area of circle: "+pi*(r*r));
    }
    void area(int a,int b){
        //for rectangle
        System.out.println("Area of rectangle: "+(a*b));
    }void area(float a, float b, float c){
        System.out.println("Area of triangle: "+(0.5*(a*b)));
    }
    public static void main(String[] args) {
        fun_overloading f=new fun_overloading();
        f.area(4);
        f.area(3.14f,5.5f);
        f.area(5,10);
        f.area(2.5f,2.6f,3.4f);
    }

}
