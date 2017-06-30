import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class problem2745 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bf.readLine().split(" ");
		String s1 = "A";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int j=10; j<36;j++ ){
			map.put(s1, j);
			int i = (s1.charAt(0)+1);
			char a = (char)i;
			s1 = String.valueOf(a);
		}
		
		String number[] = s[0].split("");
		int ten = 0;
		int len = number.length;
		int pow =1;
		for(int i=0; i<number.length; i++){
			for(int j=(number.length-2) ; j>=0; j--){
				pow *=Integer.parseInt(s[1]);
			}
			if(pow!=0)
				ten += (map.get(number[i])*pow);
			else
				ten += 1;
			pow=1;
		}
		int result = ten;
		System.out.println(result);
	}
}
