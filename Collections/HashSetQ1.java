package com.cg.collections;

import java.util.HashSet;

public class HashSetQ1 {
  public static void main(String[] args) {
      product x1=new product("Oneplus");
      product x2=new product("Realme");
      product x3=new product("Oppo");
      product x4=new product("Redmi");
      HashSet<product> no_duplicate=new HashSet<product>();
      no_duplicate.add(x1);
      no_duplicate.add(x2);
      no_duplicate.add(x3);
      no_duplicate.add(x4);
      
      no_duplicate.add(x2);
      System.out.println(no_duplicate);

  }
}
class product{
  private String p_name;
  public product(String p_name){
      this.p_name=p_name;
  }
  @Override
  public String toString(){
      return "Product name: "+p_name;
  }
}