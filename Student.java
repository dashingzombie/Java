import java.util.Scanner;
class Student
{

           String name,address;
           int age;                          

          Student(String name,int age)
          {
			          this("Agra");
                      this.name=name;
                      this.age=age;

         }
         Student(String address)
         {
                   this.address=address;
         }
         void display()
         {
           System.out.println("Name is "+name);
           System.out.println("Age is "+age);
           System.out.println("Address is "+address);
          }
          public static void main(String[] args)
          {
			      Scanner sc=new Scanner(System.in);
				  System.out.println("Enter Yr Name");
				  String name=sc.nextLine();

				  System.out.println("Enter Yr Age");
				  int age=sc.nextInt();

                 Student st=new Student(name,age);
                 st.display();
         }
}
