class mypoint {
  private int x;
  private int y;
//mrthods are declared public so they can be invoked by client:
  public mypoint() {
    this(0,0);
  }
  //constructor
  public mypoint(int x, int y) {
    this.x= x;
    this.y = y;
  }

  public String toString() {
    return String.format("(%d, %d)", x, y);      
  }
  public static void main(String[] args){
    mypoint p = new mypoint(10, 20);
    System.out.println(p);
    mypoint p2 = new mypoint();
    System.out.println(p2);  
  }
}