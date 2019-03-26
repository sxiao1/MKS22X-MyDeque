public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] newArray = s.split(" ");
      MyDeque array = new MyDeque(newArray.length);
      System.out.println(newArray);
      return 0.0;
    }
    public static void main(String[] args){
      Calculator test = new Calculator();
      System.out.println(test.eval("1 3 + 4 5 9 -"));
    }
}
