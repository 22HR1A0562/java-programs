import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
System.out.println("YES!!IT IS A VOWEL");
}
else
{
System.out.println("NO!!IT IS NOT A VOWEL");
}
}
}