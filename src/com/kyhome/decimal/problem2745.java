import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class problem2745 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bf.readLine().split(" ");
		String s1 = "0";
		String s2 = "A";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int j=0; j<36;j++ ){
			if(j<10){
				map.put(s1, j);
				int i = (s1.charAt(0)+1);
				char a = (char)i;
				s1 = String.valueOf(a);
			}
			else{
				map.put(s2, j);
				int k = (s2.charAt(0)+1);
				char c = (char)k;
				s2 = String.valueOf(c);
			}
		}
		
		String number[] = s[0].split("");
		int ten = 0;
		int pow =1;
		for(int i=0; i<number.length; i++){
			for(int j=(number.length-i)-2 ; j>=0; j--){
				pow *=Integer.parseInt(s[1]);
				//System.out.println("j: "+j);
				
			}
			if(pow!=1){
				//System.out.println("°ª : "+ map.get(number[i]) + "Á¦°ö°ª:" + pow);
				ten += (map.get(number[i])*pow);
				//System.out.println(ten);
			}
			else{
				ten +=  (map.get(number[i])*1);;
				//System.out.println("°ª"+ ten);
			}
			pow=1;
		}
		int result = ten;
		System.out.println(result);
	}
}
