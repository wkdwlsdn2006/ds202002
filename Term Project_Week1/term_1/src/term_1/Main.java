package term_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(100);
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min,max;
		int[] v = new int[size];
		
		if(a > b || b > size) System.out.println("�߸��� �����Դϴ�.");
		else {
			for(int i = 0 ; i < size ; i++) {
				v[i] = rand.nextInt();
				}
		
			min = v[a-1];
			max = v[a-1];
		
		
			for(int i = a-1 ; i < b ; i++) {
		        if(min > v[i]) min = v[i];
				if(max < v[i]) max = v[i];
			}
		
			System.out.println("�ּڰ� : "+min);
			System.out.println("�ִ� : "+max);
		
			int sum = min + max;
		
			System.out.println("�ּڰ��� �ִ� �հ� : "+ sum);
		}
		
	}

}
