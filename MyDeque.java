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
  public void resize(){
    if(size() == data.length){
      @SuppressWarnings("unchecked")
      E[] temp = (E[]) new Object[data.length * 2];
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
      data[start] = element;
    }
    else if(start == 0){
      data[data.length -1] = element;
      start = data.length -1;
    }
    else{
      data[start - 1] = element;
      start --;
    }
    size++;
  }
  public void addLast(E element){
    resize();
    if(size == 0){
      data[start] = element;
    }
    else if(end == data.length -1 ){
      data[0] = element;
      end = 0;
    }
    else{
      data[end - 1] = element;
      end ++;
    }
    size ++;
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
