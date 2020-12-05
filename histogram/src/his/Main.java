package his;

import java.util.Scanner;
public class Main {

public static int histo(int[] v, int a, int b) {
	if(a == b) return v[a];
	int c = (a+b)/2;
	int max;
	max = Math.max(histo(v,a,c), histo(v,c+1,b));
	int h = v[c], left=c, right=c, w=1;
	while(left > a || right < b) {
		int hl,hr;
		if(left>a) hl = Math.min(h, v[left-1]); else hl = -1;
		if(right<b) hr = Math.min(h, v[right+1]); else hr = -1;
		if(hl>hr) {
			h = hl; 
			left--;
		}else {
			h = hr; 
			right++;
		}
		max = Math.max(max, ++w * h);
		}	
	return max;

}

static int histo(int[] v, int n) {
	return histo(v, 0, n-1);
}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	int[] v = new int[n];
	
	for(int i = 0; i < n; i++) {
		v[i] = scan.nextInt();
	}
	
	int r = histo(v, n);
	
	System.out.println(r);
}
}