import java.util.Scanner;

public class p10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] queue = new int[10000];
		int qhead = 0;
		int qtail = 0;
		int cnt = scan.nextInt();
		for(int i = 0 ; i < cnt ; i++) {
			String command = scan.next();
			
			switch(command) {
			case "push":
				int n = scan.nextInt();
				queue[qtail] = n;
				qtail = (qtail+1) % 10000;
				break;
			case "pop":
				if(qhead == qtail) System.out.println(-1);
				else System.out.println(queue[qhead]);
				qhead = (qhead+1) % 10000;
				break;
			case "size":
				if(qhead >= qtail) System.out.println(qhead-qtail);
				else System.out.println(qtail - qhead);
				break;
			case "empty":
				if(qhead == qtail) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(qhead == qtail) System.out.println(-1);
				else System.out.println(queue[qhead]);
				break;
			case "back":
				if(qhead == qtail) System.out.println(-1);
				else System.out.println(queue[qtail-1]);
				break;
			}
		}
		

	}

}
