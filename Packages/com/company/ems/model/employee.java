package com.company.ems.model;
public class employee{

   public int id;
   public String name;
   public String depname;
  public  int salary;
    public void setId(int id){
        this.id=id;
     }
     public void setname(String name){
        this.name=name;
     }
     public void setdname(String dname){
        depname=dname;
    
     }
     public void setsal(int sal){
        salary=sal;
     }
     public String getname()
     {
        return name;
     }
      public String getdname()
     {
        return depname;
     }
      public int getId()
     {
        return id;
     }
      public int getsal()
     {
        return salary;
     }
     
     
     
     

}