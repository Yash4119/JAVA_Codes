class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        next = null;
    }
}

class Stack_l{
    int top;
    Node head = null;

    Stack_l(){
        top = -1;
    }

    void push(int val){
        if(top==-1){
            head = new Node(val);
            top++;
            return;
        }

        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        top++;
    }

    void pop(){
        if(top==-1){
            System.out.println("Cannot pop an empty stack");
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        top--;
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    int top(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return head.data;
    }
}

class Stack{
    int top,size;
    int [] arr = new int[1000];

    Stack(){
        top=-1;
        size=0;
    }
    void push(int val){
        top++;
        arr[top] = val;
        size++;
    }
    void pop(){
        if(top<0)return;
        
        arr[top] = 0;
        top--;
        size--;
    }
    int top(){
        if(top<0)return -1;
        return arr[top];
        
    }
    boolean isEmpty(){
        if(top>=0){
            return false;
        }
        return true;
    }
}

public class stack{
public static void main(String []args){
    Stack st = new Stack();

    st.push(1);
    st.pop();
    st.push(2);
    st.push(3);
    st.pop();
    st.pop();
    System.out.println(st.top());
    if(st.isEmpty()==true){
        System.out.println("stack is empty");
    }
    else{
        System.out.println("stack is not empty");
    }
    
    Stack_l st2 = new Stack_l();

    st2.push(1);
    st2.pop();
    st2.push(2);
    st2.push(3);
    st2.pop();
    st2.pop();
    st2.pop();
    System.out.println(st.top());
    if(st2.isEmpty()==true){
        System.out.println("stack is empty");
    }
    else{
        System.out.println("stack is not empty");
    }
}
}