import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


 class CourseSystem{
 HashSet<String> set=new HashSet<>();


//   void checkduplicates(String enrollmentDetails) throws Exception{

//         if(set.contains(enrollmentDetails)){
//             throw new Exception(enrollmentDetails+" Already Exists");
//         }
//     }

 void addEnrollment(String enrollmentDetails){
    set.add(enrollmentDetails);
    
 }
 int getTotalStudentsByCourse(String courseName){
    int count=0;
    for(String s: set){
        String sp= s.split(":")[1];
        if(sp.equals(courseName)){
            count+=1;
            
        }

    }
    return count;

 }

 ArrayList<String> listStudentByCourse(String courseName ){
    ArrayList<String> id=new ArrayList<>();
     for(String s1: set){
        String []sp1= s1.split(":");
        if(sp1[1].equals(courseName))
            id.add(sp1[0]);

    }
    if(id.isEmpty()){
        System.out.println("No matvch found");
        return id;
}
    else
        return id;
}

}
public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of entrollments: ");
        int n=sc.nextInt();
        sc.nextLine();
        String input;
        CourseSystem cs=new CourseSystem();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Enrollment(StudentID:CourseName): ");
            input=sc.nextLine();
            cs.addEnrollment(input);  
        }
        int ch;
        do { 
            System.out.println("--Menu--");
         System.out.println("1:Enter Course Name to count Students: ");
          System.out.println("2:Enter course name to list student IDs: ");
          System.out.println("3:Exit");
          System.out.println("Enter choice:");
          ch=sc.nextInt();
          sc.nextLine();
          if(ch==1)
           {  System.out.println("1:Enter Course Name to count Students: ");
            String name=sc.nextLine();
        if(cs.getTotalStudentsByCourse(name)==0){
            System.out.println("No Students Found");

        }
        else{
            System.out.println("Total Students: "+ cs.getTotalStudentsByCourse(name));
        }
    }
    if(ch==2){
          System.out.println("2:Enter course name to list student IDs: ");

        System.out.println("Enter course name to list student IDs: ");
        String s=sc.nextLine();
       
        System.out.println( cs.listStudentByCourse(s));
    }
    if(ch==3){
        System.out.println("Exiting...");
    }
    
        } while (ch<=3);
        

    }
}
