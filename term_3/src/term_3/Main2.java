package term_3;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	static void maxmin(int[] v, int a, int b) {
		int max = v[a];
		int min = v[a];
		for(int i = a ; i <= b ; i++) {
			if(v[i] > max) max = v[i];
			if(v[i] < min) min = v[i];
		}
		//System.out.println("구간의 최댓값 : " +max);
		//System.out.println("구간의 최솟값 : " +min);
	}
	
	static void sum_base(int[] v, long[] sum) {
		sum[0] = v[0];
		for(int i = 1 ; i < v.length ; i++) {
			sum[i] = sum[i-1] + v[i];
		}
	}
	
	static void sum_print(long[] sum, int a, int b) {
		long rsum;
		if(a==0) rsum = sum[b];
		else rsum = sum[b] - sum[a-1];
		//System.out.println("구간의 합계 :" +rsum);
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int a,b;
		int[] v = new int[N];
		long[] sum = new long[N]; 
		
		for(int j = 0 ; j < N ; j++) {
			v[j] = rand.nextInt(N)+1;
			//System.out.println(j+"번쨰 원소 : "+v[j]);
		}
		long t1 = System.currentTimeMillis();
		
		sum_base(v,sum);
		
		for(int i = 0 ; i < K ; i++) {
			a = rand.nextInt(N);
			b = rand.nextInt(N-a)+a;
			//System.out.println("구간 <"+a+" , "+b+">");
			maxmin(v,a,b);
			sum_print(sum,a,b);
		}
		
		long t2 = System.currentTimeMillis();	
		System.out.println("Elasped time is "+(t2-t1)+"ms");
	}
			
}



