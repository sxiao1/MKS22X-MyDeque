public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] newArray = s.split(" ");
      MyDeque array = new MyDeque(newArray.length);
      System.out.println(toString(newArray));
      return 0.0;
    }
    public static String toString(String[] array){
      String newstr = "";
      for(int i = 0; i < array.length; i++){
        newstr += array[i];
      }
      return newstr;
    }

}
