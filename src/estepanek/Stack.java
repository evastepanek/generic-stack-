package estepanek;

/**
 * generic stack class
 * @author Eva Stepanek
 * @version 2024-02-13
 */
public class Stack <T>{
    private Object[] array;
    private int size;
    private int counter = 0;
    public Stack(){
        this.array = new Object[10];
        this.size = 10;
    }
    public Stack(int size){
       this.size = size;
       this.array = new Object[size];
    }
    public void push(T add) throws StackFullException{
        if(counter >= size){
            throw new StackFullException("Stack is full. Please create a new one!");
        }
        this.array[counter] = add;
        counter++;

    }
    public T pop() throws StackEmptyException{
        if(counter == 0){
            throw new StackEmptyException("Stack is empty therefore you can not delete an item");
        }
        T item = (T) this.array[counter-1];
        this.array[counter-1] = null;
        counter--;
        return item;
    }
    public T peek() throws StackEmptyException{
        if(counter == 0){
            throw new StackEmptyException("Stack is empty therefore you can not read any value of an item");
        }
        return (T) this.array[counter-1];
    }
    public String list(){
        String text = "";
        for(int i = 0; i <= counter; i++){
            if(this.array[i] != null){
                if(i == 0){
                    text += this.array[i].toString();
                }
                else {
                    text += "; " + this.array[i].toString();
                }
            }
        }
        return text;
    }
}
