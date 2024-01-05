//JAVA PROGRAM TO DEMONSTRATE THE USE OF STATIC VARIABLES
class Student
{
int rollno;//INSTANCE VARIABLE
String name;
static String college="ITS";//STATIC VARIABLE
//CONSTRUCTOR
Student(int r,String n)
{
rollno=r;
name=n;
}
//METHOD TO DISPLAY THE VALUES
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
//TEST COLLEGE TO SHOW THE VALUES OF THE OBJECTS 
public static void main(String args[])
{
Student s1=new Student(27540,"Afreen");
Student.college="MTIET";
s1.display();
}
}