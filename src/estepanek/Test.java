package estepanek;

/**
 * testing for Stack class
 * @author Eva Stepanek
 * @version 2024-02-13
 */
public class Test {
    public static void main(String[] args){
        //String array
        Stack <String> stack1 = new Stack<>();
        Stack <Integer> stack2 = new Stack<>(4);
        System.out.println("String array");
        stack1.push("String");
        System.out.println("list: " + stack1.list());
        System.out.println(stack1.pop());
        System.out.println("list: " + stack1.list());
        try{
            System.out.println(stack1.peek());
        }catch(StackEmptyException see1){
            System.err.println(see1.getMessage());
        }
        System.out.println(stack1.list());
        System.out.println("");
        System.out.println("int array");
        //int array
        stack2.push(6);
        System.out.println("list: " + stack2.list());
        System.out.println(stack2.pop());
        System.out.println("list: " + stack2.list());
        try{
            System.out.println(stack2.peek());
        }catch(StackEmptyException see2){
            System.err.println(see2.getMessage());
        }
        System.out.println("list: " + stack2.list());
        stack2.push(6);
        stack2.push(33);
        stack2.push(1);
        stack2.push(8);
        try {
            stack2.push(12);
        }catch(StackFullException sfe){
            System.err.println(sfe.getMessage());
        }
    }
}
