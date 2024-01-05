class Student
{
private String college_name;
private String college_address;
private int ayr_start;
private int ayr_end;
private int id;
private String name;
private String dept;
private int aadhar_number;
public void setCollege_name(String college_name)
{
this.college_name=college_name;
}
public void setCollege_address(String college_address)
{
this.college_address=college_address;    
}
public void setAyr_start(int ayr_start)
{
this.ayr_start=ayr_start;
}
public void setAyr_end(int ayr_end)
{
this.ayr_end=ayr_end;
}
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
public void setAadhar_number(int aadhar_number)
{
this.aadhar_number=aadhar_number;
}
public String getCollege_name()
{
return college_name;
}
public String getCollege_address()
{
return college_address;
}
public int getAyr_start()
{
return ayr_start;
}
public int getAyr_end()
{
return ayr_end;
}
public int getId()
{
return id;
}
public String getName()
{
return name;
}
public String getDept()
{
return dept;
}
public int getAadhar_number()
{
return aadhar_number;
}
}
class StudentInfo
{
public static void main(String args[])
{
Student s1=new Student();
s1.setCollege_name("MOTHER THERESA INSTITUTIONS");
s1.setCollege_address("Melumoi,Palamaner.");
s1.setAyr_start(2022);
s1.setAyr_end(2026);
s1.setId(27540);
s1.setName("Afreen");
s1.setDept("CSE");
s1.setAadhar_number(76543234);
System.out.println("college_name:"+s1.getCollege_name());
System.out.println("college_address:"+s1.getCollege_address());
System.out.println("ayr_start:"+s1.getAyr_start());
System.out.println("ayr_end:"+s1.getAyr_end());
System.out.println("id:"+s1.getId());
System.out.println("name:"+s1.getName());
System.out.println("dept:"+s1.getDept());
System.out.println("aadhar_number:"+s1.getAadhar_number());
}
}