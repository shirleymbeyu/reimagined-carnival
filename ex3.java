public class ex3{
   public static void main(String[] args){
      //exer 1
      char grade = 'B';
    switch(grade) {
    case 'A' :
       System.out.println("Excellent!"); 
       break;
    case 'B' :
    case 'C' :
       System.out.println("Well done");
       break;
    case 'D' :
       System.out.println("You passed");
    case 'F' :
       System.out.println("Better try again");
       break;
    default :
       System.out.println("Invalid grade");
      }
System.out.println("Your grade is " + grade);

//exer 2
int x = 10;
while (x < 100){ //note: there is a ';'
  x += 10;
}
System.out.println(x);

//exer 3
int firstNumber = 10, lastNumber = 15;
int total = 0, count=0;
		
//set up the for loop
  // if i is an even number, add the total, increment the count
for (int i= firstNumber; i<=lastNumber; i++ ) {
      if(i%2 == 0){
         total+= i; 
         count +=1;
      }  
}
if (count != 0) {
  double average = (double) total/count;
  System.out.printf("Average is %.2f%n", average);
   }

//exer 4
System.out.println("Enter 3 rows of digits('-1' to end each row):");
for (int i=0; i < 3; i++) {
    for (int j=0; ; j++) {
     or (int i=0; i < 3; i++) {
			for (int j=0; ; j++) {
				num = input.nextInt();
				if (num == -1) {
					rows += "\n";
					break;
				}
				rows = rows + num + " ";
    }
}
System.out.println("\nRows of digits\n" + rows);

}

}