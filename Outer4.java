class Outer4
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
class Demo2 extends Outer4.Inner
{
  public static void main(String args[])
  {
   msg();
   Demo2 obj=new Demo2();
   obj.show();
  }
}
