package estepanek;

/**
 * generic stack class
 * @author Eva Stepanek
 * @version 2024-02-31
 */
public class Stack <T>{
    private Object[] array;
    public Stack(){
        this.array = new Object[10];
    }
    public Stack(Object[] array){
        this.array = array;
    }
    public void push(T add){
        //neues hinzufuegen
    }
    public T pop(){
        //letzes element geloescht
        return null;
    }
    public T peek(){
        //value letztes element
        return null;
    }
}
