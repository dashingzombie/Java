class Student11
{
  String name;
  int age;

  Student11()
  {
    name="Dev";
    age=37;
  }
   void display()
   {
     System.out.println("Name is"+name+"Age is"+age);
   }
}
class Student11Test
{
  static public void main(String[] dev)
  {
    Student11 st=new Student11();
    st.display();
  }
}
