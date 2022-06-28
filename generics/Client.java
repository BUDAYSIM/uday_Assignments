package com.cg.generics;

import java.util.Date;
//Scenario B - One String and another Date

public class Client {
  public static void main(String[] args) {
      Date objc=new Date();
      Pair<String, java.util.Date> object=new Pair<String,java.util.Date> ("1",objc);
      System.out.println("{"+object.getObj1()+"="+object.getObj2()+"}");
  }
}
class Pair<X,Y>{
  private X obj1;
  private Y obj2;

  public Pair(X obj1,Y obj2){
      this.obj1=obj1;
      this.obj2=obj2;
  }
  public X getObj1() {
      return obj1;
  }
  public Y getObj2() {
      return obj2;
  }

}