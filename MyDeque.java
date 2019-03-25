
import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10]; //if no inputted value for the length of the list, then the original size of the list is 10
    data = d;
    size = 0; //no elements yet
    start = 0; //start at index 0
    end = 0; //set value later
  }
  public MyDeque(int initialCapacity){
   @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity]; //if there is an inputted value then the value will be the size of the list
    data = d;
    size = 0;
    start = 0;
    end = 0;
  }
  public int size(){
    return size; //returns size when called
  }
  public void resize(){ //to change the size of the array when needed
    if(size() == data.length){
      @SuppressWarnings("unchecked")
      E[] temp = (E[]) new Object[data.length * 2]; //creating a new array with double the size
      int count = 0;
      while(count < data.length){
        temp[count] = data[(start + count) % data.length];
        count++;
      }
      data = temp;
      start = 0;
      end = count -1;
    }
  }
  public String toString(){
    String newstr = "";
    for(int i = start; i <= end; i++){
      newstr += data[i];
    }
    return newstr;
  }
  public void addFirst(E element){
    resize();
    if(size == 0){
      data[start] = element; //if the size is 0 then just add to the front
    }
    else if(start == 0){
      data[data.length -1] = element;
      start = data.length -1;
    }
    else{
      data[start - 1] = element; // add to the beginning
      start --;
    }
    size++;
  }
  public void addLast(E element){
    resize();
    if(size == 0){ //some exceptions
      data[start] = element;
    }
    else if(end == data.length -1 ){
      data[0] = element;
      end = 0;
    }
    else{ //add to the end of the array
      data[end + 1] = element;
      end ++;
    }
    size ++;
  }
  public E removeFirst(){
    E num = data[start];
    if(start == data.length -1){
      data[start] = null; //set the position to null
      start = (start + 1) % data.length;
    }
    else{
      data[start] = null;
      start ++; //move the start over one position
    }
    return num;
  }
  public E removeLast(){
    E num = data[end];
    if(end == 0){
      data[end] = null;
      end = data.length -1;
    }
    else{
      data[end] = null;
      end--; //moving end back one position
    }
    size --;//array gets smaller 
    return num;
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
