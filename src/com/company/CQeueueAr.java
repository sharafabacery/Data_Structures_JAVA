package com.company;

public class CQeueueAr {
    int []ar;
    int size;
    int front,rear;
    int NumberOfElement;

    public CQeueueAr(int s){
        size=s;
        ar=new int[size];
        front=rear=0;
        NumberOfElement=0;
    }
    public boolean EQueue(int d){
        boolean x=false;
        if (NumberOfElement<size){
            ar[rear]=d;
            NumberOfElement++;
            rear=(rear+1)%size;
            x =true;
        }
        return x;
    }
    public int DeQeue(){
        int x=-1;
        if (NumberOfElement>0){
            x=ar[front];
            NumberOfElement--;
            front=(front+1)%size;

        }
        return x;
    }





}
