import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] stack = new int[n];
		int top1 = -1;
		int top2 = 0;
		int up = 1;
		int[] seq = new int[n];  
		char[] pp = new char[2*n];
		int j = 0;
		boolean yes = true;

		for(int i = 0 ; i < n ; i++) {
			seq[i] = scan.nextInt();
		}
		
		
		for(int i = 0 ; i < 2*n ; i++) {
			if(top1 == -1) {
				pp[j++] = '+';
				stack[++top1] = up++;
			}else if(stack[top1] == seq[top2]) {
				pp[j++] = '-';
				top1--;
				top2++;
			}else {
				pp[j++] = '+';
				stack[++top1] = up++;
			}
			for(int k = 0 ; k < top1 ; k++) {
				if(seq[top2] == stack[k]) yes = false;
			}
		}
		
		
		if(yes) {
			for(int i = 0 ; i < 2*n ; i++) {
				System.out.println(pp[i]);
			}
		}else {
			System.out.println("NO");
		}
		
		

	}

}
