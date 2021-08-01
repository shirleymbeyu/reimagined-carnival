import java.util.Scanner;
import java.security.SecureRandom;

public class ex4{
    public static void main(String[] args){
        int f = 98;
        int c = 26;
        System.out.printf("%d Fahrenheit is %d Celcius %n%n", 
                     f, celcius(f));
        System.out.printf("%d Celcius is %d Fahrenheit%n%n",
                     c, farenheit(c));
    }
    public static int celcius(int fahrenheitTemperature) {
        return ((int) (5.0 / 9.0 * (fahrenheitTemperature - 32)));
        }

    public static int farenheit(int celciusTemperature) {
        return ((int) (1.8 * celciusTemperature + 32));
        }

    /*State whether the overloading is valid or invalid
   int mymethod(int a, int b, float c)
   int mymethod(int var1, int var2, float var3)

   int mymethod(int a, int b)
   int mymethod(float var1, float var2)

   int mymethod(int a, int b)
   int mymethod(int num)

   float mymethod(int a, float b)
   float mymethod(float var1, int var2)
   */ 
    
    Scanner input = new Scanner(System.in);
    int guessNum, randNum;
    SecureRandom randomNumbers = new SecureRandom();
    randNum = randomNumbers.nextInt(10);
    System.out.print("Enter your guess number (0-10):");
    guessNum = input.nextInt();
    if (guessNum == randNum)
      System.out.printf("You won.");
    else {
      System.out.printf("You lost. My number is %d%n.", randNum);
     }
 
}