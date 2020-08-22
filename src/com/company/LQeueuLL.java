package com.company;
public class LQeueuLL {
    QNode tail, head;
    public LQeueuLL() {
        tail = head = null;
    }
    public boolean IsEmpty(){
        return head==null;


    }
    public boolean EnQeue(int data) {
        boolean x = false;
        QNode node = new QNode(data);
        if (node != null) {
            if (head == null) {
                head = tail = node;
                node.Next=tail;
            } else {
                tail.Next = node;
                tail = node;
            }
            x = true;
        }
        return x;
    }
    public QNode DeQueue() {
        QNode node = head;
        if (head!=null)
        {
            if (head==tail){

                tail=head=null;
            }else {

                head=head.Next;

            }

        }
        return node;
    }

    public  void print(){
        LQeueuLL lQeueuLL=new LQeueuLL();



    }


}