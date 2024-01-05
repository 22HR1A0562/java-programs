import java.util.Scanner;
class Employee
{
private int id;
private String name;
private String dept;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setDept(String dept)
{
this.dept=dept;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
public String getDept()
{
return this.dept;
}
}
class EmployeeInfo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee[] e1=new Employee[5];
for(int i=0;i<5;i++)
{
e1[i]=new Employee();
e1[i].setId(sc.nextInt());
e1[i].setName(sc.next());
e1[i].setDept(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++)
{
System.out.println("ID: "+e1[j].getId());
System.out.println("NAME: "+e1[j].getName());
System.out.println("DEPT: "+e1[j].getDept());
}
}
}