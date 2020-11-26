package term_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(100);
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] v = new int[N];
		
		long t1 =System.currentTimeMillis();
		
		for(int j = 0 ; j < N ; j++) {
			v[j] = rand.nextInt();	
		}
		
		
		for(int i = 0 ; i < K ; i++) {
			int a = rand.nextInt(N)+1;
			int b = rand.nextInt(N)+1;
			int min,max;
			
			
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.print(a + "," + b);
			System.out.println("");
				
			
			min = v[a-1];
			max = v[a-1];
			
			
			for(int j = a-1 ; j < b ; j++) {
			    if(min > v[j]) min = v[j];
				if(max < v[j]) max = v[j];
			}
			
				
			System.out.println((i+1) + "번째 구간 최솟값 : "+min);
			System.out.println((i+1) + "번째 구간 최댓값 : "+max);
				
			int sum = min + max;
				
			System.out.println((i+1) + "번째 구간 최솟값과 최댓값 합계 : "+ sum);
			
		}
		long t2 = System.currentTimeMillis();	
		System.out.println("Elasped time is "+(t2-t1)+"ms");
		
	}
		
}
