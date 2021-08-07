class employee {
  private String firstName;
  private String lastName;
  private static int count = 0;

  public static int getCount() {
		return count;
	}
//constructor
  public employee( String first, String last ) {
   firstName = first;
   lastName = last;
   ++count;
  }

  public String toString() {
    return String.format("%s, %s%n", lastName, firstName);
  }
  public static void main(String[] args){
  employee bob = new employee("Bob", "Blue");
  employee susan = new employee("Susan", "Baker");
  System.out.println(employee.getCount());
  }

}
