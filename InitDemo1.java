class InitDemo1
{
  InitDemo1()
  {
    System.out.println("Non-Param");
  }
  InitDemo1( int num)
  {
    System.out.println("Parameter Variable");
  }
  {
    System.out.println("I am IIB");
  }
  public static void main(String args[])
  {
    InitDemo1 obj1=new InitDemo1();
    InitDemo1 obj2=new InitDemo1(10);
  }
}
