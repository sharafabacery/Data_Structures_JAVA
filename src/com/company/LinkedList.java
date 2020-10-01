package com.company;

class LinkedList {
    Node Head;

    private Node CreateNode(int Data) {
        Node node = new Node();
        if (node != null) {

            node.Data = Data;
            node.next = null;


        }

        return node;

    }


    public int Insertnode(int data) {
        int revalue = 0;
        Node node = CreateNode(data);
        if (node != null) {


            if (Head == null) {
                System.out.println("head crated");
                Head = node;
            } else {
                Node temp = Head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
                System.out.println("node created");

            }
            revalue = 1;

        }
        return revalue;
    }

    public int AddNode(int loc, int data) {
        int revalue = 0;
        Node node = CreateNode(data);
        if (node != null) {
            if (Head == null) {
                Head = node;
            }
            if (loc == 0) {
                node.next = Head.next;
                Head = node;
                System.out.println("Now head");


            } else {
                Node temp = Head;
                for (int i = 0; i < loc - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    node.next = temp.next;
                    temp.next = node;
                    System.out.println("Added");
                } else {
                    temp.next = node;
                    node.next = null;
                    System.out.println("last");

                }


            }

            revalue = 1;
        }

        return revalue;
    }

    public Node SearchNode(int Data) {
        Node temp = Head;
        while (temp != null && temp.Data != Data) {
            temp = temp.next;
            //data not found temp=null because last node her next =null
        }
        if(temp == null){
            System.out.println("Data Not found");
        }
        else{
            System.out.println("Data found");
        }
        return temp;
    }

    public int DeleteNode(int loc) {
        int revalue = 0;
        if (Head != null) {
            if (loc == 0) {
                Head = Head.next;
                revalue = 1;
            } else {
                Node last = Head.next;
                Node BeforeLast = Head;
                for (int i = 0; i < loc - 1 && last != null; i++) {
                    last = last.next;
                    BeforeLast = BeforeLast.next;
                }
                if (last != null) {
                    BeforeLast.next = last.next;
                    revalue = 1;
                }

            }


        }

        return revalue;
    }

    //wednesday
    public LinkedList Concatenate(LinkedList l2) {

        LinkedList l3 = new LinkedList();

        if ((this.Head != null) && (l2 != null)) {
            Node temp = this.Head;

            while (temp != null) {

                l3.Insertnode(temp.Data);
                temp = temp.next;
            }
            temp = l2.Head;

            while (temp != null) {
                l3.Insertnode(temp.Data);

                temp = temp.next;
            }
        } else {
            l3 = null;
        }

        return l3;
    }

    public void print() {
        Node t1 = Head;
        while (t1 != null) {

            System.out.println(t1.Data);
            t1 = t1.next;
        }
        System.out.println("=====================");


    }

    public void changeData(int data, int loc) {

        Node temp = Head;
        if (temp != null) {
            if (loc == 0) {
                temp.Data = data;
            } else {//loc-1 before loc
                for (int i = 0; i < loc && temp != null; i++) {

                    temp = temp.next;

                }
                if (temp != null) {

                    temp.Data = data;


                }
            }


        }


    }
    public void DelAll(int value){


        if (Head!=null){

            if (Head.next==null&&Head.Data==value){Head=null;}
            else {
                Node temp=Head;
                while (temp.next!=null){
                    if (temp==Head && temp.Data==value){
                        temp=Head=temp.next;
                    }else if (temp.next.Data==value){
                        temp.next=temp.next.next;
                    }else {temp=temp.next;}

                }


            }

        }


    }
    //single linked list
    public void uniqe(){
        if (Head!=null){
            if (Head.next!=null){
                Node t1=Head;
                Node t2=Head;
                while (t1!=null) {
                    while (t2.next!= null) {
                        if (t2.next.Data==t1.Data){
                            t2.next=t2.next.next;
                        }else {
                            t2=t2.next;
                        }
                    }
                  t1=t2=t1.next;
                }
            }

        }



    }

}




