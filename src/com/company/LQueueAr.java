package com.company;

public class LQueueAr {
    int []ar;
    int size;
    int rear;
    public  LQueueAr(int size){
        this.size=size;
        ar=new int[size];
    }
    public boolean EnQueue(int Data){
        boolean x=false;
        if (rear<size){
            Data=ar[rear];
            x=true;
        }
        return x;
    }
    public int DeQueue(){
        int z=-1;
        if (rear<size){
            z=ar[0];
            rear--;
            for (int i=0;i<rear;i++){
                ar[i]=ar[i+1];
            }
        }
        return z;
    }



}
