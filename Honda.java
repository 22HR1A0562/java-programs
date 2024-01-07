class Bike
{
final void run()
{
System.out.println("Running");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("Running safely with 100kmph");
}
public static void main(String args[])
{
Honda h1=new Honda();
h1.run();
}
}