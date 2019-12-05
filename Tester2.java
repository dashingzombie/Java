interface Inter
{

}
class Tester2 implements Inter
{
      public void honk()
      {
        System.out.println("I am cool");
      }
      public String toString()
      {
        return"Are you cool";
      }
      public static void main(String args[])
      {
        Inter obj=new Tester2();
        String receive=obj.toString();
        System.out.println("receive");
      }
}
