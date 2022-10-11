package algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;///dd

public class baek1157 {
	static String s;//
    static String r_s;
    static int count[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         s=br.readLine();
         r_s=s.toUpperCase(); // ?�문자 변??
         count=new int[26];
         
         for(int i=0;i<s.length();i++) {
        	 
        	 char a=r_s.charAt(i);
        	 int n=a-65;
        	 count[n]++;
                     
          }
         int max=0;
         char ans=' ';
         for(int i=0;i<26;i++) {
        	 if(max<count[i]) {
        		 max=count[i];
        		 ans=(char) (i+65);
        	 }else if(max==count[i]) {
        		 ans='?';
        	 }
        	 
        	 
        	 
         }
         
         System.out.println(ans);
	}
}

