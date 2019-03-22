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
    @SuppressWarnings("unchecked")
    E[] temp = (E[]) new Object[data.length + 1];
    temp[0] = element;
    for(int i = 1; i < temp.length; i++){
      temp[i] = data[i-1];
    }
    for(int i = 0; i < data.length; i++){
      data[i] = temp[i];
    }
    start = (int)data[0];
  }
  public void addLast(E element){
    if(data[data.length -1] != null ){
      expand(data);
    }
    data[end + 1] = element;
    end ++;
  }
  public void expand(E[]data){
    @SuppressWarnings("unchecked")
    E[] temp = (E[])new Object[data.length * 2];
    for(int i = 0; i < data.length; i ++){
      temp[i] = data[i];
    }
    /*@SuppressWarnings("unchecked")
    data = temp;
    for(int i = 0; i < temp.length; i++){
      data[i] = temp[i];
    }*/
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
