//USING THIS KEYWORD 
class T
{
int rollno;
String name;
float fee;
T(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
public static void main(String args[])
{
T t1=new T(501,"Afreen",50000f);
t1.display();
}
}
