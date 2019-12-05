class Outer3
{
  static int data=3;
  static class Inner
  {
     static void msg()
  {
        System.out.println("Data is"+data);
  }
    void show()
    {
      System.out.println("I am non-static");
    }
  }
}
class Demo
{
  public static void main(String args[])
  {
    System.out.println(Outer3.data);
    Outer3.Inner.msg();
    Outer3.Inner i=new Outer3.Inner();
    i.show();
  }
}
