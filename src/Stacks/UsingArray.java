package Stacks;

public class UsingArray {
    static class Stack{
        static int top;
        static int size=10;
        static int[] arr = new int[size];

        Stack(){
            top = -1;
        }
        public static boolean isEmpty(){
            if(top < 0){
                return true;
            }else{
                return false;
            }
        }
        public static void push(int data){
            if(top == size-1){
                System.out.println("Overflow");
            }
            top++;
            arr[top] = data;
            System.out.println("Items pushed");
        }
        public static void pop(){
            if(isEmpty()){
                System.out.println("Underlow");
            }
            System.out.println(arr[top]);
            top--;
            System.out.println("Items Poped");
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            for(int i=0;i<=top;i++){
                System.out.println(arr[i] + " ");
            }
        }

    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.display();
        s.pop();
        s.display();
    }
}
