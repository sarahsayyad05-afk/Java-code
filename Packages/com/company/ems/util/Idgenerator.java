package com.company.ems.util;
public class Idgenerator{
  public  static int count=100;
   public static int id(){
        count++;
        System.out.println("ID: "+count);
         return count;
    }


}