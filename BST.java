class Tree{
    
    static class Node{
    public int data;
    public Node left,right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
    }

    public Node root;

    public Tree(){
        this.root = null;
    }

    public void Insert(int val){
        this.root = Insert(root, val);
    }

    public Node Insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            root.left = Insert(root.left,val);
        }
        else if(root.data < val){
            root.right = Insert(root.right,val);
        }
        return root;
    }

    public void search(int val){
        search(root,val);
    }

    public void search(Node root,int val){
        if(root == null){
            System.out.println("Key not found in the bst");
            return;
        }
        else if(root.data == val){
        System.out.println("Key Found!!!");
        }
        else if(root.data > val){
            search(root.left,val);
        }
        else{
            search(root.right,val);
        }
    }


}

public class BST {
    public static void main(String args[]){
        System.out.println("***** Binary Search Tree Implementation ******");
        
        Tree t1 = new Tree();
        t1.Insert(10);
        t1.Insert(12);
        t1.Insert(11);
        t1.Insert(14);
        t1.Insert(1);
        t1.Insert(9);
        t1.Insert(5);
        t1.search(1);
        t1.search(4);

    }
}
