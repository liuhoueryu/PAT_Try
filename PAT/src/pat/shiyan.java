package pat;
import java.util.Scanner;
public class shiyan {
    static int number=10;                        
    static int[] t1 = new int[number];            
    static int[] t2 = new int[number];                
    static void input()                        
    {
        System.out.println("������T1���У�");
        Scanner in_t1 = new Scanner(System.in);//ѭ������T1����
        for(int i=0;i<number;i++){
            t1[i]=in_t1.nextInt();}
        System.out.println("������T2���У�");
        Scanner in_t2 = new Scanner(System.in);//ѭ������T2����
        for(int i=0;i<number;i++){
            t2[i]=in_t2.nextInt();}
        System.out.println("T1���飺");
        for(int i=0;i<number;i++){              //�����������  
            System.out.print("["+t1[i]+"]"); }
        System.out.println("\nT2���飺");
        for(int i=0;i<number;i++){              
            System.out.print("["+t2[i]+"]"); }

    }
     public static void main(String[] args){
         input();
     }
}