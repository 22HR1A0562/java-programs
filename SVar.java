//use of static variable
class SVar
{
int rollno;
String name;
static String college="MTIET";
static void college()
{
college="VIT";
}
SVar(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
SVar s1=new SVar(123,"afreen");
s1.display();
SVar s2=new SVar(234,"ayaan");
s2.display();
SVar.college();
SVar s3=new SVar(345,"isba");
//s1.display();
//s2.display();
s3.display();
}
}