import java.util.Scanner;

public class boj_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next().toLowerCase();
		char[] array = a.toCharArray();
		int[] alpha = new int[26];
		int count = 0;
		int count1 = 0;
		int k = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (array[i] == (char) (97 + j))
					alpha[j] += 1;
			}
		}
		int max = 0;
		for (int j = 0; j < 26; j++) {
			if (max < alpha[j])
				max = alpha[j];
		}
		for (int j = 0; j < 26; j++)
			if (max == alpha[j]) {
				k = j;
				count1 += 1;
			}
		if (count1 > 1)
			System.out.println("?");
		else
			System.out.println((char)(65+k));
	}

}
