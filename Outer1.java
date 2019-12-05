class Outer1
{
      static int y=20;
        int x=10;
  static void MyMethod()
  {

        System.out.println(y);
        }
        static class Inner
        {
          static void msg()
          {
            System.out.println(y);
          }
          void show()
          {
            System.out.println("Non Static");
          }
        }

  public static void main(String args[])
  {
    System.out.println(y);
    MyMethod();
    Inner.msg();
    Inner obj=new Inner();
    obj.show();
  }
}
