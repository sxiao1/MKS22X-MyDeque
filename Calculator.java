public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] newArray = s.split(" ");
      MyDeque array = new MyDeque(newArray.length);
      for(int i = 0; i < newArray.length; i++){
        if(newArray[i] != "+" && newArray[i] != "-" && newArray[i] != "*" && newArray[i] != "/" && newArray[i] != "%"){
          array.addLast(newArray[i]);
        }
        else if(newArray[i].equals("+")){
          double first = (double)array.getLast();
          array.removeLast();
          double second = (double) array.getLast();
          double answer = first + second;
          array.removeLast();
          array.addLast(answer);
        }
      }
      System.out.println(array.toString());
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
