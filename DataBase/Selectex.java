import java.sql.*;


public class Selectex {
      public static void main(String[] args) {

        try {

            // Create Connection
            Connection con =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/emp",
                "root",
                "sarah@05"
            );

            // Create Statement
            Statement stmt =con.createStatement();

            // SELECT Query
            String q ="SELECT count(*) from Employee";
            ResultSet rs =stmt.executeQuery(q);
             if(rs.next()) {

                System.out.println(
                    rs.getInt(1) 
                );
            }

            String q1="Select * from Employee Order by name ";
             ResultSet rs1 =stmt.executeQuery(q1);
              while(rs1.next()) {

              
                    System.out.println(
                                rs1.getInt(1) + " "
                                + rs1.getString(2) + " "
                                + rs1.getInt(3) + " "
                                + rs1.getInt(4) + " "
                                + rs1.getInt(5)
                            );
            
            }


            String q2="Select * from Employee Order by name desc";
            ResultSet rs2 =stmt.executeQuery(q2);
             while(rs2.next()) {

              
                    System.out.println(
                                rs2.getInt(1) + " "
                                + rs2.getString(2) + " "
                                + rs2.getInt(3) + " "
                                + rs2.getInt(4) + " "
                                + rs2.getInt(5)
                            );
            
            }

             String q3="Select * from Employee Order by name desc limit 1";
             ResultSet r =stmt.executeQuery(q3);
               while(r.next()) {

              
                    System.out.println(
                                r.getInt(1) + " "
                                + r.getString(2) + " "
                                + r.getInt(3) + " "
                                + r.getInt(4) + " "
                                + r.getInt(5)
                            );
            
            }


              String q4="Select * from Employee where name like 's%'";
               ResultSet r1 =stmt.executeQuery(q4);
               while(r1.next()){
                System.out.println("Strat w s: "+ r1.getString(1));
               }

                String q5="Select * from Employee where name like '%d'";
               ResultSet r2 =stmt.executeQuery(q5);
               while(r2.next()){
                System.out.println("ends w d: "+ r2.getString(1));
               }
                 String q6="Select * from Employee where name like '%r%'";
               ResultSet r3=stmt.executeQuery(q6);
               while(r3.next()){
                System.out.println("contains r: "+ r3.getString(1));
               }
                String q7="Select * from Employee where name like '____'";
               ResultSet r4=stmt.executeQuery(q7);
               while(r4.next()){
                System.out.println("name with exact 4 characters: "+ r4.getString(1));
               }
                String q8="Select distinct age from Employee ";
               ResultSet r5=stmt.executeQuery(q8);
               while(r5.next()){
                System.out.println( "distinct ages: "+
                                r5.getInt(1) + " "
                    
                            );
               }
                  String q9="Select min(Salary) from Employee ";
               ResultSet r6=stmt.executeQuery(q9);
               while(r6.next()){
                System.out.println("Min sal:"+
                                r6.getInt(1) + " "
                    
                            );
               }
                String q10="Select max(Salary) from Employee "; 
                ResultSet r7=stmt.executeQuery(q10);
                while(r7.next()){   
                System.out.println("Max sal: "+
                                r7.getInt(1) + " ");
                }
                String q11="Select avg(Salary) from Employee ";
                ResultSet r8=stmt.executeQuery(q11);
                while(r8.next()){
                System.out.println("Avg sal: "+
                                r8.getInt(1) + " ");}
            


               ResultSet ans=stmt.executeQuery("SELECT name FROM Employee  where salary between 10000 and 30000");
                while(ans.next()){
                System.out.println("emp sal between 10000,30000: "+
                                ans.getString(1) + " "
                    
                            );
               }
               ResultSet ans1=stmt.executeQuery("SELECT name FROM Employee  where salary in(10000,40000)");
               while(ans1.next()){
                System.out.println( "emp salary in 10000,40000: "+
                                ans1.getString(1) + " "
                    
                            );
               }
               ResultSet ans2=stmt.executeQuery("SELECT age, count(*) FROM Employee group by age");
               while(ans2.next()){
                System.out.println("Count of age groups : "+ 
                                ans2.getInt(1) + "->"
                                + ans2.getInt(2) 
                    
                            );
               }
                ResultSet ans3=stmt.executeQuery("SELECT age, count(*) FROM Employee group by age having count(*)>3");
               while(ans3.next()){
                System.out.println("Count of age groups >3 : "+ 
                                ans3.getInt(1) + "->"
                                + ans3.getInt(2) 
                    
                            );
               }

                ResultSet ans4=stmt.executeQuery("SELECT salary, count(*) FROM Employee group by salary having count(*)>1");
               while(ans4.next()){
                System.out.println("Count of salary groups >1 : "+ 
                                ans4.getInt(1) + "->"
                                + ans4.getInt(2) 
                    
                            );
               }

               ResultSet ans5=stmt.executeQuery("SELECT e.name, p.pname from Employee e inner join project1 p where e.id=p.id");
               while(ans5.next()){
                System.out.println("inner join : "+ 
                                ans5.getString(1) + "->"
                                + ans5.getString(2)
                               
                    
                            );
               }

            ResultSet ans6=stmt.executeQuery("SELECT e.name, p.pname from Employee e left join project1 p on e.id=p.id");
            while(ans6.next()){
            System.out.println("left join : "+ 
                                ans6.getString(1) + "->"
                                + ans6.getString(2)
                               
                    
                            );
               }
               
               



            
            con.close();
            
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}



