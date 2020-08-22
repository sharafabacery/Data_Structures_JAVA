package com.company;

public class LStack {
    Node tail;

    public boolean push(int data) {
        boolean val = false;
        Node node = new Node();
        if (node != null) {
            node.Data = data;
            // node.preuvis=null;
            node.preuvis = tail;
            //if(tail==null) {
            tail = node;
            // }
            // else {
            //node.preuvis=tail;
            // tail = node;
            //  }
            val = true;
        }
        return val;
    }

    public Node pop() {
        Node temp = null;
        if (tail != null) {
            temp = tail;
            tail = tail.preuvis;
        }
        return temp;
    }

    public boolean IsEmpty() {
        return tail == null;
    }

    public int count() {
        int re = 0;
        LStack L = new LStack();
        while (IsEmpty() == false) {
            re++;
            L.push(pop().Data);
        }
        while (L.IsEmpty() == false) {
            push(L.pop().Data);
        }
        return re;
    }

    public void Reverse(LinkedList l1) {
        while (l1.Head != null) {
            push(l1.Head.Data);
            l1.Head = l1.Head.next;
        }
        while (IsEmpty() == false) {
            l1.Insertnode(pop().Data);
        }
    }

    public void print() {
        LStack l1 = new LStack();

        while (IsEmpty() == false) {
            Node te = pop();
            int temp = te.Data;
            System.out.println(temp);
            l1.push(temp);
            /* System.out.println(tail.Data);
            l1.push(pop().Data);*/

        }
        while (l1.IsEmpty() == false) {

            push(l1.pop().Data);
            // System.out.println("a");

        }

    }

    public void sort() {
        LStack lStack = new LStack();
        if (lStack.IsEmpty()&&!IsEmpty()) {
            lStack.push(pop().Data);
        }
        while (!IsEmpty()) {
            int x = pop().Data;
            boolean a = true;
            while (a) {
                int y = lStack.pop().Data;
                if (y > x && lStack.IsEmpty()) {
                    lStack.push(x);
                    lStack.push(y);
                    a = false;
                } else if (x >= y) {
                    lStack.push(y);
                    lStack.push(x);
                    a = false;
                } else if (y > x) {
                    push(y);
                }
            }
        }
        while (lStack.IsEmpty() == false) {
            push(lStack.pop().Data);
        }


    }


}










