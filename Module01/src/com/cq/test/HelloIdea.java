package com.cq.test;


import java.util.ArrayList;
import java.util.Collection;


public class HelloIdea {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");




        ArrayList collection = new ArrayList(  );




        System.out.println("HelloWorld");
        System.out.println("args = [" + args + "]");
        int num1  = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("HelloIdea.main");
        System.out.println(num1);

        System.out.println("------------------------我是漂亮的分割线-----------------------------");
        String[] string  = new String[]{"Tom","Hanmeimei","Lilei","Mike"};

        for (int i = 0; i <string.length ; i++) {
            System.out.println(string[i]);
        }

        for (int i = 0; i < string.length; i++) {
            String s = string[i];
            System.out.println("s = " + s);

        }

        for (String s : string) System.out.println("s = " + s);
    }



    public void test(){


        Collection collection = new ArrayList( );
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");
        collection.add("EE");
        collection.add("FF");

        if (collection == null) {
            
        }
        if (collection != null) {
            
        }
    }
}
