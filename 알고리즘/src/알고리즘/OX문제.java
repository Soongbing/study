package 알고리즘;

import java.util.*;

class OX문제 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] a = new String [n];
		for(int i=0;i<n;i++) {
			int sum = 0;
			int point = 0;
			a[i] = sc.next();
		for(int j=0;j<a[i].length();j++) {
			if(a[i].charAt(j)=='O') {
				point++;
				sum += point;
			}else if(a[i].charAt(j)=='X') {
				point = 0;
			}
		}
		System.out.printf("%d\n",sum);
		}
	}
}
