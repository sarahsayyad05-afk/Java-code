//constructor is a special member function ,the constructor name should be same as class name
//constructor cannot return any value
//it executes or invoke automatically when object is created
//constructor are used to initialize an object
//constructors are called only once at the time of object creation
//TYPES OF CONSTRUCTORS:
//1)Default constructor
//syntax: classname();
//2)Parameterize constructor
//syntax: classname(parameter1, parameter2,.....parameter_n) ;
//3)Copy Constructor
//synatx: classname(classname variable_name);

//Constructor overloading: def"referes to define multiple constructors with 
//diff no of parameters in same class. that means, there are multiple constructors of same name
//and they all have diff parameters and behavior
class constructor_ex{
    constructor_ex(){
        System.out.println("Default constructor");
    }
    
    int a;
    String s;
    

    constructor_ex(int a, String s) {
        this.a = a;
        this.s = s;
        System.out.println("a: "+ a);
       
        System.out.println("s: "+s);
    }
     constructor_ex( constructor_ex ab){
           a=ab.a;
           s=ab.s;
           
     }
    void display(){
        System.out.println("copied:");
         System.out.println("a: "+ a);
       
        System.out.println("s: "+s);
     }

    
    

    public static void main(String[] args) {
        constructor_ex cs=new constructor_ex();
        constructor_ex cs1=new constructor_ex(10,"java"); 
        constructor_ex cs2=new  constructor_ex(cs1);
        cs2.display();
       constructor_ex cs3=cs1;
       cs3.display();




    }
   
}