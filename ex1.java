public class ex1 {
 public static void main(String[] args){
   System.out.println("123456789012345678901234567890");
   double x = 27.5, y = 33.75;
   System.out.printf("x=%15f y=%8f %n", x, y);
   System.out.printf("x=%15.4f y=%8.4f %n", x, y);
   
   //ex2
   int value = (int) 27.6;
   String myString = "" + value;
   System.out.println(myString);

   String phrase = "123";
   int c = Integer.parseInt(phrase);
   System.out.println(c*2);
  
  //when the following is run there is an error
  //  System.out.println(phraseb*2);

  //ex 3
  //from int to string:
  int val = 12;
  String myStrng = "" + val;
  System.out.println(myStrng);

  //from string to int
  String myValue = "123";
  int myInt = Integer.parseInt(myValue);
  System.out.println(myInt);

 }
}
   