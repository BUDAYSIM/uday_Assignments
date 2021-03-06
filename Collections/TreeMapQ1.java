package com.cg.collections;


import java.util.*;

public class TreeMapQ1 {
  public static void main(String[] args) {
      Long a=Long.valueOf("8309075532");
      Long b=Long.valueOf("9951230973");
      Long c=Long.valueOf("8088508997");
      Long d=Long.valueOf("7893126680");
      contact a1=new contact(a,"uday","uday@gmail.com",Gender.male);
      contact a2=new contact(b,"priya","priya@gmail.com",Gender.female);
      contact a3=new contact(c,"vinay","vinay@gmail.com",Gender.male);
      contact a4=new contact(d,"sara","sara@gmail.com",Gender.male);

      TreeMap<Long,contact> info= new TreeMap<Long,contact>(Collections.reverseOrder());
      info.put(a,a1);
      info.put(b,a2);
      info.put(c,a3);
      info.put(d,a4);
      System.out.println("All the key-Value pairs: ");
      
      //printing all key-value pairs
      for (Map.Entry<Long, contact> entry: info.entrySet()){
          System.out.println(entry.getKey()+" = "+entry.getValue());
      }
      
      //printings all the keys
      System.out.println("All the Keys: ");
      for (Map.Entry<Long, contact> entry: info.entrySet()){
          System.out.println(entry.getKey());
      }
      System.out.println("All the Values: ");
      
      //printing all values
      for (Map.Entry<Long, contact> entry: info.entrySet()){
          System.out.println(entry.getValue());
      }
  }
}
enum Gender{
  male,female;
}
class contact{
  private Long phone_number;
  private String name;
  private String email;
  private Gender gender;

  public contact(Long phone_number,String name,String email,Gender gender){
      this.phone_number=phone_number;
      this.name=name;
      this.email=email;
      this.gender=gender;
  }
  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return "name: "+name+" Phone no: "+phone_number+" email: "+email;
  }
}
