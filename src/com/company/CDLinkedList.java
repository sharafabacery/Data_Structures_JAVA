package com.company;

public class CDLinkedList {
    Node head;
    // Node tail;

    private Node CreateNode(int data) {
        Node node = new Node();
        if (node != null) {
            node.Data = data;
            node.next = null;
            node.preuvis = null;
        }
        return node;
    }

    public int Push(int data) {
        int v = 0;
        Node node = CreateNode(data);
        if (node != null) {
            if (head == null) {
                head = node;
                head.preuvis = head.next = node;


            } else {
                Node last = head.preuvis;
                last.next = node;
                node.preuvis = last;
                head.preuvis = node;
                //head.prev=node
                //head=node

            }


        }


        return 1;
    }


    public void insert(int d1, int d2) {

        if (head != null) {
            Node node = CreateNode(d1);
            if (head.next == head.preuvis && head.Data == d2) {
                head.next = node;
                node.next = head;
                node.preuvis = head;
                head.preuvis = node;


            } else if (head.preuvis.Data == d2) {
                node.preuvis = head.preuvis;
                head.preuvis.next = node;
                node.next = head;
                head.preuvis = node;


            } else {
                Node temp = head;
                while (temp.Data != d2 && temp.next != head.preuvis) {

                    temp = temp.next;
                }
                if (temp.Data == d2) {

                    temp.next.preuvis = node;
                    node.next = temp.next;

                    temp.next = node;
                    node.preuvis = temp;
                }
            }


        }


    }


    public void Delete(int d) {
        if (head != null) {
            if (head.next == head.preuvis && head.Data == d) {
                head = null;

            } else {
                Node temp = head;
                Node temp2 = head.preuvis;
                while (temp != head.preuvis) {
                    if (temp.Data == d && temp == head) {
                        head.next.preuvis = head.preuvis;
                        head.preuvis.next = head.next;
                        temp = head = head.next;
                    } else if (temp.Data == d) {
                        temp.next.preuvis = temp.preuvis;
                        temp.preuvis.next = temp.next;
                        temp = temp.next;
                    } else temp = temp.next;


                }
                if (temp.Data == d && temp == head.preuvis) {

                    temp.preuvis.next = head;
                    head.preuvis = temp.preuvis;


                }


            }

        }

    }

    public void print() {
        Node temp = head;
        if (head != null) {

            while (head.preuvis != temp) {
                System.out.println(temp.Data);
                temp = temp.next;
            }
            if (temp == head.preuvis) {
                System.out.println(temp.Data);
            }
            System.out.println("pre");


            temp = head.preuvis;

            while (temp != head) {

                System.out.println(temp.Data);
                temp = temp.preuvis;
                //if (temp==head){ System.out.println(temp.Data);}
            }

            if (temp == head) {
                System.out.println(temp.Data);
            }

        }
    }

    public void insertsort(int data) {
        Node node = CreateNode(data);
        if (node != null) {
            if (head == null) {
                head = node;
                head.preuvis = head.next = node;
            } else if (node.Data <= head.Data) {
                head.preuvis.next = node;
                node.preuvis = head.preuvis;
                node.next = head;
                head.preuvis = node;
                head = node;
            } else if (head.preuvis.Data <= node.Data) {
                head.preuvis.next = node;
                node.preuvis = head.preuvis;
                node.next = head;
                head.preuvis = node;
            } else {
                Node temp = head;
                boolean value = true;
                do {
                    if (temp.Data >= node.Data) {
                        temp = temp.preuvis;
                        temp.next.preuvis = node;
                        node.next = temp.next;
                        temp.next = node;
                        node.preuvis = temp;
                        value = false;
                    }
                    temp = temp.next;
                } while (value);
            }
        }
    }

}






