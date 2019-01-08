package pat;

import java.util.Scanner;

public class Test0003Ultimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1;
		int b=1000;
		int t=sc.nextInt();
		int s=sc.nextInt();
		int temp=s-t+1;
		int [] g=new int[temp];
		int m=0;
		int h=0;
		for(int c=a;c<=b;c++) {
			int n=0;
			for(long i =2;i<c;i++) {
				if(c%i==0)
					n++;
			}
			if(n==0) {
				g[h]=c;
				h++;
			}
		}
		for(int v=0;v<temp;v++) {
			System.out.print(g[v]);
			m++;
			if(m%10==0)
				System.out.println();
			else
				System.out.print(" ");
		}
	}

}