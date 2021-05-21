package com.interviev;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author ChenWei
 * @create 2021-05-14-17:37
 */
public class XianJinShuTongDemo {

    public static void AAA(){
        Hashtable ht = new Hashtable();
        StringBuffer sb = new StringBuffer();

        sb.append("abc");
        ht.put("1",sb);
        sb.append("def");
        ht.put("2",sb);
        sb.append("mno");
        ht.put("3",sb);
        sb.append("xyz");
        ht.put("4",sb);

        int numObj = 0;
        Enumeration it = ht.elements();
        while (it.hasMoreElements()){
            System.out.print("get StringBuffer " + (++numObj)+" from HashTable : ");
            System.out.println("it = " + it.nextElement());
        }
    }

    public static void BBB(){
        XianJinShuTongDemo xJST = new XianJinShuTongDemo();
        System.out.println("Before call changeObj() method " + xJST.obj);
        xJST.changObj(xJST.obj);
        System.out.println("After call changeObj() method " + xJST.obj);
        System.out.println("------------------------------------------");
        System.out.println("Before call changePri() method " + xJST.aInt);
        xJST.changePri(xJST.aInt);
        System.out.println("After call changePri() method " + xJST.aInt);
    }

    Obj obj = new Obj();
    int aInt = 11;
    public void changObj(Obj inObj){
        inObj.str = "changed value";
    }
    public void changePri(int inInt){
        inInt = 22;
    }

  public static void main(String[] args) {
    //
      AAA();

  }
}

class Obj{

    String str = "init value";
    public String toString(){
        return str;
    }
}