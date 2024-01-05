import java.util.Scanner;

public class Cont {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
				int i=0;
		while(i<25) {
i++;

if(i%5==0)continue;
System.out.print(i+",");
}
}
}