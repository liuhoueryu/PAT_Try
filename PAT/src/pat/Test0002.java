package pat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test0002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] temp= new int[5];
		int s=-1;
		int m=1;
		double t=0.0;
		double d=0.0;
		int f=0;
		int c=0;
		double l=0.0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int j=0;j<n;j++) {
			if(a[j]%5==0&&a[j]%2==0)
				temp[0]+=a[j];
			else if(a[j]%5==1) {
				s*=-1;
				temp[1]+=s*a[j];
				}
			else if(a[j]%5==2) {
				temp[2]+=m;
				m++;
			}
			else if(a[j]%5==3) {
				t++;
				d+=a[j];
				l=d/t;
			}
			else if (a[j]%5==4) {
				f=a[j];
				if (c<f)
					c=f;
				temp[4]=c;
			}
		}
		for(int k =0;k<3;k++)
			System.out.print(temp[k]+" ");
		System.out.print(df.format(l)+" ");
		System.out.print(temp[4]);
	}

}
