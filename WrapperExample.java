public class WrapperExample
{
public static void main(String args[])
{
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;
System.out.println("=====BOXING=====");
System.out.println("___Printing object values___ ");
System.out.println("Byte Object:"+byteobj);
System.out.println("Short Object:"+shortobj);
System.out.println("Integer Object:"+intobj);
System.out.println("Long Object:"+longobj);
System.out.println("Float Object:"+floatobj);
System.out.println("Double Object:"+doubleobj);
System.out.println("Character Object:"+charobj);
System.out.println("Boolean Object:"+boolobj);
System.out.println("=====UNBOXING=====");
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean boolvalue=boolobj;
System.out.println("___Printing object values___ ");
System.out.println("Byte value:"+bytevalue);
System.out.println("Short value:"+shortvalue);
System.out.println("Integer value:"+intvalue);
System.out.println("Long value:"+longvalue);
System.out.println("Float value:"+floatvalue);
System.out.println("Double value:"+doublevalue);
System.out.println("Character value:"+charvalue);
System.out.println("Boolean value:"+boolvalue);
}
}

