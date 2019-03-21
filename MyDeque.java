public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
    start = 0;
    end = data.length -1;
  }
  public MyDeque(int initialCapacity){
   @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
    start = 0;
    end = data.length -1;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String newstr = "";
    for(int i = start; i <= end; i++){
      newstr += data[i];
    }
    return newstr;
  }
  public void addFirst(E element){
    
  }
  public void addLast(E element){

  }
  public E removeFirst(){
    start ++;
    return data[start -1];
  }
  public E removeLast(){
    end --;
    return data[end -1];
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
