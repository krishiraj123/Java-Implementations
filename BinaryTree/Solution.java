//package BinaryTree;

import java.util.Scanner;

class BinaryTree {
    private class Node {
        int value;
        Node left;
        Node right;
        Node next;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }

    private Node root;

    void populate(Scanner sc) {
        System.out.println("Enter the root node");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to add the value to the left of " + node.value);
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("Enter the value to add the left of the " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to add the value to the right of " + node.value);
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.println("Enter the value to add the right of the " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(Scanner sc) {
        System.out.println("1-->PreOrder Traversal\n2-->PostOrder Traversal\n3-->InOrder Traversal");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1: displayPreorder(root,"");
            break;
            case 2: displayPostorder(root,"");
            break;
            case 3: displayInorder(root,"");
            break;
            default:
                System.out.println("Please Enter Valid Choice");
        }
    }

    private void displayInorder(Node node, String indent) {
        if(node == null)
        {
            return;
        }
        displayInorder(node.left,indent+"\t");
        System.out.print(node.value+indent+" ");
        displayInorder(node.right,indent+"\t");
    }

    private void displayPostorder(Node node, String indent) {
        if(node == null)
        {
            return;
        }
        displayInorder(node.left,indent+"\t");
        displayInorder(node.right,indent+"\t");
        System.out.print(node.value+indent+" ");
    }

    private void displayPreorder(Node node,String indent)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.value+indent+" ");
        displayInorder(node.left,indent+"\t");
        displayInorder(node.right,indent+"\t");
    }

    int delete(int element)
    {
        if(root == null)
        {
            System.out.println("Tree is Empty");
        }
        if(element == root.value)
        {
            root.next = root;
            root = root.right.next;
        }
        if(element > root.value)
        {
            while(root.right.next != null)
            {
                if(root.right.next == element)
                {
                    root.next = root;
                    root = root.right.next;
                    break;
                }
            }
            if(root.right.next == element)
                {
                    root.next = root;
                    root = root.right.next;
                    break;
                }
        }
        if(element < root.value)
        {
            while(root.left.next != null)
            {
                if(root.left.next == element)
                {
                    root.next = root;
                    root = root.left.next;
                    break;
                }
            }
            if(root.left.next == element)
                {
                    root.next = root;
                    root = root.left.next;
                    break;
                }
        }
    }
}


    class Solution {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.populate(new Scanner(System.in));
        bt.display(new Scanner(System.in));
        System.out.println(bt.delete(5));
    }
}