package com.company;

public class DoubleLinkedList {
    Node head;
    Node tail;

    private Node CreateNodeDouble(int data) {
        Node node = new Node();
        if (node != null) {
            node.Data = data;
            node.next = null;
            node.preuvis = null;
        }
        return node;
    }

    public int InsretNode(int data) {
        int revalue = 0;
        Node node = CreateNodeDouble(data);
        if (node != null) {
            if (head == null) {
                System.out.println("head crated");
                head = node;
                tail = node;
            } else {

                tail.next = node;
                node.preuvis = tail;
                tail = node;

                System.out.println("node created1");

            }
            revalue = 1;

        }
        return revalue;
    }

    public int AddNode(int data, int loc) {

        int revalue = 0;
        Node node = CreateNodeDouble(data);
        if (node != null) {
            if (head == null) {
                head = tail = node;

            } else {
                if (loc == 0) {
                    node.next = head;
                    head.preuvis = node;
                    head = node;
                } else {
                    Node temp = head;
                    for (int i = 0; i < loc - 1 && temp.next != null; i++) {

                        temp = temp.next;

                    }
                    if (temp.next == tail) {
                        tail.next = node;
                        node.preuvis = tail;
                        node = tail;

                    } else {
                        temp.next.preuvis = node;
                        node.next = temp.next;

                        temp.next = node;
                        node.preuvis = temp;
                    }


                }


            }
            revalue = 1;
        }

        return revalue;
    }

    public Node SearchNode(int Data) {
        Node temp = head;
        while (temp != tail && temp.Data != Data) {
            temp = temp.next;
            //data not found temp=null because last node her next =null
        }
        return temp;
    }

    public int DeleteNode(int loc) {
        int revalue = 0;
        if (head != null) {
            if (loc == 0) {
                head = head.next;
                head.preuvis = null;
                revalue = 1;
            } else {
                Node temp = head;
                for (int i = 0; i < loc && temp != null; i++) {

                    temp = temp.next;

                }
                if (temp != null) {
                    if (temp == tail) {
                        tail = tail.preuvis;
                        tail.next = null;
                    } else {
                        temp.next.preuvis = temp.preuvis;
                        temp.preuvis.next = temp.next;


                    }

                    revalue = 0;
                }

            }
        }


        return revalue;
    }
//sunday 

    public DoubleLinkedList Copy() {
        DoubleLinkedList l1 = new DoubleLinkedList();
        Node temp = head;
        while (temp != null) {
            l1.InsretNode(temp.Data);
            //create new node and put it at the end of list
            temp = temp.next;

        }


        return l1;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {


            System.out.println(temp.Data);
            temp = temp.next;
        }
        System.out.println("pre");
        Node temp1 = tail;
        while (temp1 != null) {
            System.out.println(temp1.Data);

            temp1 = temp1.preuvis;

        }


    }
//double linkedlist
    public void unique() {
        if (head != null) {
            if (head != tail) {
                Node t1 ,t2;
                t1=t2=head;
                while (t1 != null) {
                    t2 = t1.next;
                    while (t2 != null) {
                        if (t1.Data==t2.Data){
                            if (t2!=tail){
                                    t2.next.preuvis = t2.preuvis;
                                    t2.preuvis.next = t2.next;
                            }
                            else {
                                    tail = tail.preuvis;
                                    tail.next = null;
                            }
                        }
                        t2 = t2.next;
                    }
                    t1 = t1.next;
                }
            }
        }
    }
}





