class Tree{
    int data;
    Tree left;
    Tree right;

    public Tree(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class B_Tree {

    static void inorder(Tree root){
        if(root==null)return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String args[]){
        Tree t1 = new Tree(10);
        t1.left = new Tree(12);
        t1.right = new Tree(11);
        t1.left.right = new Tree(4);
        t1.left.left = new Tree(3);
        t1.right.left = new Tree(12);

        inorder(t1);
    }
}
