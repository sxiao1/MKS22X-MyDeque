public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] newArray = s.split(" ");
      MyDeque<Double> array = new MyDeque<Double>();
      for(int i = 0; i < newArray.length; i++){
        if(newArray[i].length() == 1 && (newArray[i].equals("+")|| newArray[i].equals("-") || newArray[i].equals("*") || newArray[i].equals("/") || newArray[i].equals("%"))){
          if(array.size() >= 2){
            //System.out.println(array);
            double second = array.removeLast();
            double first = array.removeLast();
            if(newArray[i].equals("+")){
              double newVal = first + second;
              array.addLast(newVal);
            }
            if(newArray[i].equals("-")){
              double newVal = first - second;
              array.addLast(newVal);
            }
            if(newArray[i].equals("*")){
              double newVal = first * second;
              array.addLast(newVal);
            }
            if(newArray[i].equals("/")){
              if(second == 0){
                array.addLast(0.0);
              }
              else{
                double newVal = first / second;
                array.addLast(newVal);
              }
            }
            if(newArray[i].equals("%")){
              if(second == 0){
                array.addLast(0.0);
              }
              else{
                double newVal = first % second;
                array.addLast(newVal);
              }
            }
          }
        }
        else{
          array.addLast(Double.parseDouble(newArray[i]));
        }
      }
      return array.getFirst();
    }
    public static String toString(String[] array){
      String newstr = "";
      for(int i = 0; i < array.length; i++){
        newstr += array[i];
      }
      return newstr;
    }
    public static void main(String[] args){
      System.out.println(eval("10 2.0 +"));
      System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    }

}
