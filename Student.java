class Student
{
String name;
int rollNo;
int marks;
void display()
{
System.out.println("Name:"+name);
System.out.println("Roll No:"+rollNo);
System.out.println("Marks:"+marks);
}
void grade()
{
if(marks>=90)
System.out.println("Grade:A");
else if(marks>=75)
System.out.println("Grade:B");
else if(marks>=60)


System.out.println("Grade:C");
else if(marks>=50)
System.out.println("Grade:D");
else
System.out.println("Grade:F");
}
public static void main(String args[])
{
Student s1 = new Student();
Student s2 = new Student();
s1.name="Madhav";
s1.rollNo=101;
s1.marks=95;
s2.name="Radha";
s2.rollNo=102;
s2.marks=75;

System.out.println("Student 1 Details:");
s1.display();
s1.grade();
System.out.println();
System.out.println("Student 2 Details:");
s2.display();
s2.grade();
}
}