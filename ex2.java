 import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
    int num1=100, num2=1, num3;
	num3 = num2++ + ++num1;
	System.out.print(" num1=" + num1);
	System.out.print(" num2=" + num2);
	System.out.println(" num3=" + num3);

    //ex 2
    int a, b;
	double c;
	System.out.println(7 + 1 + "4 * 2" + 3 + 1);
	System.out.println("5" + (7 + 1) + 3 * 2 + 1);
	a = 5;
	b = a / 3 + 1;
	c = a / b;
	System.out.println(a + ", " + b + ", " + c);
    
    //ex3
    int val1 = 50;
    int val2 = 53;
    System.out.println("1. " + (val1 != val2));
    System.out.println("2. " + (val1 >= val2 - 3));
    System.out.println("3. " + (67 % 2 == 1));  

    //ex4
    int value = 12;
    boolean result; 

    result = value>10 || value<=5 && value!=12;
    System.out.println("1. " + result);

    result = (value>10 || value<=5) && value!=12;
    System.out.println("2. " + result);

    //ex5
    int april, may, june; 
	double average;
       	//create a scanner object
    Scanner rain = new Scanner(System.in);
    
	//get rainfall x 3 times
    System.out.println("What is the rainfall ammount?");
    april = rain.nextInt();
    may = rain.nextInt();
    june = rain.nextInt();

	//calculate the average
	 average = (april + may + june)/3;
	System.out.printf("Average rainfall: %.2f%n", average);

  }
}

