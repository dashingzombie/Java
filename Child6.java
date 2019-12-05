class Parent
{
    Parent()
    {
      super();
      System.out.println("I am Parent Constructor");
    }

}
class Child6 extends Parent
{

    Child6()
    {
      super();
      System.out.println("I am child constuctor");
    }
    public static void main(String args[])
    {
    Child6 obj=new Child6();
  }
}
