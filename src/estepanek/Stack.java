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

    /**
     * Contructor with an array length of 10
     */
    public Stack(){
        this.array = new Object[10];
        this.size = 10;
    }

    /**
     * Contructor with a variable array size
     * @param size
     */
    public Stack(int size){
       this.size = size;
       this.array = new Object[size];
    }

    /**
     * method for adding an item in the array
     * @param add iten to add
     * @throws StackFullException is thrown when the stack is already full
     */
    public void push(T add) throws StackFullException{
        if(counter >= size){
            throw new StackFullException("Stack is full. Please create a new one!");
        }
        this.array[counter] = add;
        counter++;

    }

    /**
     * method for deleting the last added item to the stack
     * @return the value of the deleted item
     * @throws StackEmptyException is thrown when the stack is empty so therfore there is nothing to delete
     */
    public T pop() throws StackEmptyException{
        if(counter == 0){
            throw new StackEmptyException("Stack is empty therefore you can not delete an item");
        }
        T item = (T) this.array[counter-1];
        this.array[counter-1] = null;
        counter--;
        return item;
    }

    /**
     * method for returning the value of the last added item of the stack
     * @return the value
     * @throws StackEmptyException is throws when the stack is empty therefore there is nothing to return
     */
    public T peek() throws StackEmptyException{
        if(counter == 0){
            throw new StackEmptyException("Stack is empty therefore you can not read any value of an item");
        }
        return (T) this.array[counter-1];
    }

    /**
     * listing all the items in the array
     * @return the listing as a string
     */
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
