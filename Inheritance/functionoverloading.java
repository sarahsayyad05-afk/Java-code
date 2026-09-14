public class functionoverloading {
//Complie time polymorphism
// Overloading using different types of parameters
    void display(int A)
{
     System.out.println( "Value of A : "+A);     
}

void display(char A)
{
     System.out.println("Value of A : "+A);     
}

void display(float A)
{
     System.out.println( "Value of A : "+A);     
}


// Function overloading by changing the number of arguments
void Sum(int A, int B)
{
     System.out.println( "Sum is : "+ (A+B));
}

void Sum(int A, int B, int C)
{
     System.out.println( "Sum is : "+ (A+B+C));    
}

void Sum(int A, int B, int C, int D)
{
     System.out.println( "Sum is : "+ (A+B+C+D));     
}
void Sum(int...A)//can pass multiple argument in one parameter using '...'
//it can be considered as Array
{
    System.out.println("function with variable argument"+A);
}
// Function overloading by changing the sequence  of arguments
void f1(int a ,String b)
{
  System.out.println("Function with int and string parameter  "+a+" "+b);
}
void f1(String b,int a)
{
  System.out.println("Function with  string and int parameter  "+b+" "+a);
}

//EAMPLES:
void f2(int a, float b){
    System.out.println("function w int and float parameter");
    System.out.println("a, b: "+ a+","+b);
    
}
void f2(float a, int b){
    System.out.println("function w float and int parameter");
    System.out.println("a, b: "+ a+","+b);
}
void f2(char a, float b ){
    System.out.println("function w char and float parameter");
     System.out.println("a, b: "+ a+","+b);
}

public static void main(String[] args) {
   functionoverloading f1=new  functionoverloading();
    f1.display(10);
    f1.display('@');
    f1.display(3.14f);

    f1.Sum(1,2);
    f1.Sum(1,2,3);
    f1.Sum(1,2,3,4);
    f1.Sum(1,2,3,4,5,6);

    f1.f1(10,"java");
    f1.f1("java",1);
    f1.f2(20,8.9f);
    f1.f2(2.9f,8);
    f1.f2(10,20f);//Ambiguty error
    f1.f2('a',10.2f);//Internal typecasting
    f1.f2('a',10.2f);
}
    
}

