class Outer5
{
    int x=10;
    class Inner
    {
        int x=40;
        void show()
          {
            System.out.println(this.x);
            System.out.println(Outer5.this.x);
          }
    }
    public static void main(String args[])
    {
      Outer5 obj=new Outer5();
      Outer5.Inner obj1=obj.new Inner();
      obj1.show();
    }
}
