import java.io.*;
class TypeCastingC1
{
public static void main(String[] args)
{
double i=100.562;
short j=(short)i;
int k=(int)i;
System.out.println("Original value before casting"+i);
System.out.println("After Type casting to short"+j);
System.out.println("After Type casting to int"+k);
}
}