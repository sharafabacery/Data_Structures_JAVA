package com.company;
public class CQeueueL {
    QNode front,rear;
    public  CQeueueL(){
        front=rear=null;
    }
    public Boolean EnQueue(int data){
        boolean x=false;
        QNode node=new QNode(data);
        if (node!=null){
            if (front==null){
                front=rear=node;
                node.Next=rear;
            }else {
                rear.Next=node;
                rear=node;
            }
        }
        return x;
    }
    public QNode DeQueue(){
        QNode node=null;
        if (front!=null)
        {
         if (front==rear){
          node =rear;
             front=rear=null;
         }else {
             node=front;
             front=front.Next;
             front.Next=rear;
         }
        }
        return node;
    }
    public  void Reverse(){
        LStack lStack=new LStack();
        while (front!=null)
        {
            lStack.push(DeQueue().Data);
        }
        while (lStack.IsEmpty()!=true){

            EnQueue(lStack.pop().Data);
        }
    }


}
