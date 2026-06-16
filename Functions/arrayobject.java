class Student
{
 int rollno;
 String name;
 float marks;
 void setData(int r,String n,float m)//formal parameter
{
    rollno=r;
    name=n;
    marks=m;
}
void show()
{
    System.out.println(rollno+" "+name+" "+marks);
}
}
class arrayobject
{
    public static void main(String[] args) {
        Student [] s=new Student[2];
        s[0]=new Student();
        s[0].setData(10, "Sarah", 80);

        s[1]=new Student();
        s[1].setData(3, "xyz", 70);//actual parameter
        for (Student x : s) {
            x.show();
        }


        
    }
}