class Parent
{
  public void disp()
  {
    System.out.println("Black and white Display");
  }
}
class Child3 extends Parent
{
  public void disp()
  {
    System.out.println("Coloured Display");
    super.disp();
  }
  public static void main(String args[])
  {
    Child3 obj=new Child3();
    obj.disp();
  }
}
