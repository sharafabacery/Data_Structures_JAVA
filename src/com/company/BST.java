package com.company;

public class BST {
    NodeTree root;
    public void insert(int data){

        root=insert(data,root);

    }
    public NodeTree insert(int data,NodeTree nodeTree){
        if (nodeTree==null){
            nodeTree=new NodeTree(data);
        }else if (nodeTree.data<data){
            nodeTree.right=insert(data,nodeTree.right);

        }else {
            nodeTree.left=insert(data,nodeTree.left);

        }

        return nodeTree;

    }
    public NodeTree search(int data){
        return search(data,root);

    }
    public NodeTree search(int data,NodeTree nodeTree){
        NodeTree tree=null;
        if (nodeTree==null || nodeTree.data==data)tree=nodeTree;
        else if (data>nodeTree.data){
            tree=search(data,tree.right);
        }else {

            tree=search(data,tree.left);
        }

        return tree;
    }






}
