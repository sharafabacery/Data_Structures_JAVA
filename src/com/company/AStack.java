package com.company;

public class AStack {
    int []ar;//Assume data>=0
    int tos;
    public AStack(){
        ar=new int[5];
        tos=0;
    }
    public boolean push(int data){
        boolean re=false;
        if (tos<ar.length){
            ar[tos]=data;
            tos++;
            re =true;
        }
        return re;
    }
    public int pop(){
        int val=-1;
        if (tos>0){
            tos--;
            val=ar[tos];
        }
        return val;
    }

}
