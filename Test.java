//no argument no return value function
class Demo
{
public void displayMenu()
{
System.out.println("+ :Addition");
System.out.println("- :Subtraction\n* :Multiplication");
System.out.println("/ :Division");
}
}
class Test
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
}
}
