package pat;

/**
 * 
 * ��Ŀ����  
��������[-2��31�η�, 2��31�η�]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��

��������:
�����1�и���������T(<=10)���ǲ��������ĸ�����������T�����������ÿ��ռһ�У�˳�����A��B��C���������Կո�ָ���


�������:  
��ÿ�������������һ���������Case #X: true�����A+B>C�����������Case #X: false��������X�ǲ��������ı�ţ���1��ʼ����

��������:
4
1 2 3
2 3 4
2147483647 0 2147483646
0 -2147483648 -2147483647

�������:
Case #1: false
Case #2: true
Case #3: true
Case #4: false
 * **/
import java.util.Scanner;

public class Test0001 {
	private static Scanner sc = new Scanner(System.in);
	private static int n = sc.nextInt();
	private static long[] a = new long[n];
	private static long[] b = new long[n];
	private static long[] c = new long[n];

	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			c[i] = sc.nextLong();
		}
		for (int j = 1; j < n + 1; j++) {
			if (a[j - 1] + b[j - 1] > c[j - 1])
				System.out.println("Case #" + j + ": True");
			else
				System.out.println("Case #" + j + ": False");
		}
	}

}
