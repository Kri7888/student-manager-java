import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
  int id;
  String name;
  int marks;
  
  Student(int id, String name, int marks)
  {
    this.id=id;
    this.name=name;
    this.marks=marks;
   }
}

class StudentManager{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     List<Student> students=new ArrayList<>();
     while(true)
     {
       System.out.println("\n1. Add Student");
       System.out.println("\n2. Display Students");
       System.out.println("\n3. Average marks");
       System.out.println("\n4. Exit");
       System.out.println("\n1. choice: ");

       int choice=sc.nextInt();
       switch(choice)
       {
        case 1: System.out.println("Enter ID: ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name=sc.nextLine();
                System.out.println("Enter Marks: ");
                int marks=sc.nextInt();
                students.add(new Student(id,name, marks));
                break;
        case 2: for (Student s: students){
                   System.out.println(s.id+" - "+s.name+" - "+s.marks);
                }
               break;
        case 3: if(students.isEmpty()){
                System.out.println("no students added.");
                }
            else{
                   int sum=0;
                   for(Student s:students) sum+=s.marks;
                   System.out.println("average marks: "+(sum/students.size()));
                  }
                break;
           case 4: System.out.println("Exiting ...");
                 return;
            default:
          System.out.println("Invalid choice!");
          System.out.println("Hello from Github");
               }
         }
     }
}