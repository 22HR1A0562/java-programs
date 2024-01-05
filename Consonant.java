import java.util.Scanner;
class Consonant
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c>='a')&&(c<='z'))
    {
          if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
        {
          System.out.println("IS A VOWEL");
        }
          else 
        {
           System.out.println("YES!!CONSONANT");
         }
     }
else
{
System.out.println("NOT AN ALPHABET");
}
}
}



