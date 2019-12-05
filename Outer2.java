class Outer2
{
  static class Inner
  {
       public static void main(String args[])
       {
         System.out.println("I am static");
       }
  }
  public static void main(String args[])
  {
    System.out.println("I am outer");
    //for running use Outer2$Inner
  }
}
