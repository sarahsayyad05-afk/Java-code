class getterex {
    private int c_id;
    private String cname;
    void setId(int a){
        c_id=a;
   }
   void setname(String b){
    cname=b;
   }
   int getId(){
    return c_id;
   }
   String getname()
   {
    return cname;
   }
   public static void main(String[] args) {
       getterex g= new getterex();
       g.setId(10);
       g.setname("Sarah");
       System.out.println("Id: "+g.getId());
       System.out.println("Name: "+g.getname());
   }
}