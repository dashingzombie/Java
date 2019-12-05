import java.util.Scanner;

class Student44
{
  String name;
  int age;
  Student44(String n,int a)
  {
    name=n;
    age=a;
  }


   void display()
   {
     System.out.println("Name is "+name);
     System.out.println("Age is "+age);
   }
}
class Student44Test
{
  static public void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your name");
    String var1=obj.nextLine();
    System.out.println("Enter your age");
    int var2=obj.nextInt();
    Student44 st=new Student44(var1,var2);
    st.display();
  }
}
