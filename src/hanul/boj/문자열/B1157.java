package beakjoon;

import java.util.Scanner;

public class p1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chs = sc.next().toCharArray();
		
		int[] asc = new int[26];
		for(int i=0; i<chs.length; i++) {
			int index = Character.toUpperCase(chs[i]) - 'A';
			asc[index]++;
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0; i<asc.length; i++) {
			if(max < asc[i]) {
				max = asc[i];
				ch = (char)( i + 'A');
			}
			else if (max == asc[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
