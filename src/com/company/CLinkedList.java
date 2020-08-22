package com.company;

public class CLinkedList {
    Node head;
    Node tail;

    private Node CreateNode(int data) {
        Node node = new Node();
        if (node != null) {
            node.Data = data;
            node.next = null;
           // node.preuvis = null;
        }
        return node;
    }

    public int InsretNode(int data) {
        int revalue = 0;
        Node node = CreateNode(data);
        if (node != null) {
            if (head == null) {
                System.out.println("head crated");
                head = node;
                head.next = head;
                tail = node;
            } else {

                tail.next = node;

                tail = node;
                tail.next = head;

                System.out.println("node created1");

            }
            revalue = 1;

        }
        return revalue;
    }


    public int AddNode(int loc, int data) {
        int revalue = 0;
        Node node = CreateNode(data);
        if (node != null) {
            if (head == null) {
                head = node;
                head.next = head;
                tail = node;
            }
            if (loc == 0) {
                node.next = head;
                head = node;
                tail.next = head;
                System.out.println("Now head");


            } else {
                Node temp = head;
                for (int i = 0; i < loc - 1 && temp.next != head; i++) {
                    temp = temp.next;
                }
                if (temp.next == tail) {
                    tail.next = node;
                    tail = node;
                    tail.next = head;
                    System.out.println("Added");
                } else {
                    node.next = temp.next;
                    temp.next = node;
                    // System.out.println("last");

                }


            }

            revalue = 1;
        }

        return revalue;
    }

    public Node SearchNode(int Data) {
        Node temp = head;
        boolean flag = true;
        if (temp != null) {
            do {
                if (temp.Data == Data) {
                    flag = false;
                } else {
                    temp = temp.next;
                }
            }
            while (temp != head && flag);
        }  //data not found temp=null because last node her next =null
        return temp;
    }

    public int DeleteNode(int loc) {
        int revalue = 0;
        if (head != null) {
            if (loc == 0) {
                head = head.next;
                tail.next = head;
                revalue = 1;
            } else {
                Node last = head.next;
                Node BeforeLast = head;
                for (int i = 0; i < loc - 1 && last != head; i++) {
                    last = last.next;
                    BeforeLast = BeforeLast.next;
                }
                if (last != head) {
                    if (last==tail){
                        tail=BeforeLast;
                        tail.next=head;
                    }else {
                        BeforeLast.next=last.next;
                    }
                    revalue=1;
                }

                }

            }

        return revalue;

    }
    public  void print(){
        Node temp=head;
        do {
            System.out.println(temp.Data);
            temp=temp.next;
            if (temp==tail &&temp!=head){
                System.out.println(temp.Data);


            }
        }while (temp!=tail);






    }

        }



