package pat;
import java.util.Scanner;
public class Test0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		int m=0;
		for(long c=a;c<=b;c++) {
			int n=0;
			for(long i =2;i<c;i++) {
				if(c%i==0)
					n++;
			}
			if(n==0) {
				System.out.print(c);
				m++;
				if(m%10==0)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

}
