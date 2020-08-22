package com.company;

public class BT {
    NodeTree root;
    public  BT(){
        root=null;
    }
    public void insert(int data){
        root=insert(data,root);



    }
    public NodeTree insert(int data,NodeTree nodeTree){
        if (nodeTree==null){nodeTree=new NodeTree(data);}
        else {
            if (nodeTree.right==null){
                nodeTree.right=insert(data,nodeTree.right);
            }else {
                nodeTree.left=insert(data,nodeTree.left);
            }
        }
        return nodeTree;
    }

    public  int countNode(){

        return countNode(root);

    }
    public int countNode(NodeTree nodeTree){

        if (nodeTree==null){return 0;}
        else {
            return 1+countNode(nodeTree.left)+countNode(nodeTree.right);
        }

    }
    public int sumNode(){

        return sumtNode(root);

    }
    public int sumtNode(NodeTree nodeTree){

        if (nodeTree==null){return 0;}
        else {
            return nodeTree.data+sumtNode(nodeTree.left)+sumtNode(nodeTree.right);
        }

    }


    public void printInorder(){
        printInorder(root);


    }
    public void printInorder(NodeTree nodeTree){
        if (nodeTree==null) return;
        else {
            printInorder(nodeTree.left);
            System.out.println(nodeTree.data);
            printInorder(nodeTree.right);
        }

    }
    public void printpostorder(){
        printpostorder(root);
    }
    public void printpostorder(NodeTree nodeTree){
        if (nodeTree==null) return;
        else {
            printpostorder(nodeTree.left);
            printpostorder(nodeTree.right);
            System.out.println(nodeTree.data);


        }
    }

    public void mirror(){
        if (root==null)return;
        NodeTree temp=root.left;
        root.left=root.right;
        root.right=temp;




    }












}
