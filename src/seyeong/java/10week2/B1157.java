import java.util.*;
import java.io.*;

//알파벳 대소문자로 된 단어가 주어지면, 
//이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
//단, 대문자와 소문자를 구분하지 않는다.
public class B1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array = br.readLine().toUpperCase();

		int[] letterCheck = new int["abcdefghijklmnopqrstuvwxyz".length()];

		for (int i = 0; i < array.length(); i++) {
			int index = array.charAt(i) - 'A';
			letterCheck[index]++;
		}

		int max = -1;
		char result = 0;
		for (int j = 0; j < letterCheck.length; j++) {
			if (letterCheck[j] > max) {
				max = letterCheck[j];
				result = (char) (j + 'A');
			} else if (letterCheck[j] == max) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
