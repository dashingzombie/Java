class ExecDemo1
{
public static void main(String args[])
{

  try
  {
    System.out.println("This is 1st Line");
    int a=10/0;
      System.out.println("This is 2st Line");
  }
  catch(ArithmeticException ae)
  {
      System.err.println("Please dont divide by zero");
  }
    System.out.println("Please print me");
}
}
