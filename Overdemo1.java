class Overdemo1
{
  void sum(int num1,int num2)
  {
    int result;
    result=num1+num2;
    System.out.println("The sum of two numbers is"+result);
  }
  void sum(int num1,int num2,int num3)
  {
    int result;
    result=num1+num2+num3;
    System.out.println("The sum of two numbers is"+result);
  }
  public static void main(String[] args)
  {
    Overdemo1 obj=new Overdemo1();
    obj.sum(10,20);
    obj.sum(10,20,30);
  }
}
