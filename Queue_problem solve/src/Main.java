import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] queue = new int[10000];
		int[] stack = new int[10000];
		int qhead = 0;
		int qtail = n;
		int shead = 0;
		int qout;
		
		for(int i = 0 ; i < n ; i++) {
			queue[i] = random.nextInt(10000);
		}
	
		while(qhead != qtail) {
			qout = queue[qhead];
			qhead = (qhead+1) % 10000;
			while(shead != 0 && stack[shead-1] < qout) {
				queue[qtail] = stack[shead-1];
				qtail = (qtail+1) % 10000;
				shead--;
			}
			if(shead == 0 || stack[shead-1] > qout) {
				stack[shead++] = qout;
			}
		}
		
		for(int i = 0 ; i < shead ; i++) {
			System.out.println(stack[i]);
		}
		
	}

	

}
