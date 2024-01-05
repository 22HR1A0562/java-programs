//USING THIS KEYWORD 
class ThisKey
{
int rollno;
String name;
float fee;
ThisKey(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
class Afreen
{
public static void main(String args[])
{
ThisKey t1=new ThisKey(501,"Afreen",50000f);
ThisKey t2=new ThisKey(502,"Taj",45363f);
t1.display();
t2.display();
}
}
}