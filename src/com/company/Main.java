package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int test=scanner.nextInt();


       for (int i=0;i<test;i++){


           LStack lStack=new LStack();
           LStack lStack1=new LStack();
           String s=scanner.next();
           for (int p=0;p<s.length();p++){
               if (s.charAt(p)=='<'){
                   lStack.push(p);



               }else if (s.charAt(p)=='>'){
                   lStack1.push(p);
               }


           }
           if (lStack.count()<lStack1.count()){

               System.out.println(lStack.count());


           }else {
               System.out.println(lStack1.count());

           }
           lStack.tail=lStack1.tail=null;









       }


    }
}
