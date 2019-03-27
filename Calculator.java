public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] newArray = s.split(" ");
      MyDeque<Double>array = new MyDeque<Double>();
      for(int i = 0; i < newArray.length; i++){
        if(newArray[i].length() == 1 && (newArray[i].equals("+")|| newArray[i].equals("-") || newArray[i].equals("*") || newArray[i].equals("/") || newArray[i].equals("%"))){
          if(array.size() >= 2){
            double second = (double)array.getLast();
            array.removeLast();
            double first = (double) array.getLast();
            array.removeLast();
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
