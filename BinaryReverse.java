import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;


public class BinaryReverse {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	static int sum = 0;
	static String stringReversed,  binaryOneReversed,binaryOne, binaryTwo,  one = "1", zero = "0";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String number;
		int numint;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		number = r.readLine();
		numint = Integer.parseInt(number);
		
		binaryOne = reverseString(getBinaryOneReversed(numint));
		System.out.println("That number in binary is: " + binaryOne + '\n');
		binaryTwo = getBinaryTwo(binaryOne);
		System.out.println("That binary number in reverse is: " + binaryTwo + '\n');
		System.out.println("The decimal of the reversed number is : " + getNumber(binaryTwo));
		

		
	}
	
	public static String getBinaryOneReversed(int n){
		if(n %2 != 0){
			binaryOneReversed+= one;
			n/=2;
		}
		else{
			binaryOneReversed+= zero;
			n/=2;
		}
		if(n == 0)
			return binaryOneReversed.substring(4, binaryOneReversed.length());
		else
			return getBinaryOneReversed(n);
			
		
	}
	
	
	
	public static String reverseString(String m){
		for(int i = m.length()-1; i != -1; i--)
			stringReversed+= m.charAt(i);
	
		return stringReversed.substring(4, stringReversed.length());
	}
	
	public static String getBinaryTwo(String l){
		for(int i = l.length()-1; i != -1; i--)
			binaryTwo+= l.charAt(i);
		return binaryTwo.substring(4, binaryTwo.length());
	}
	
	public static int getNumber(String m){
		
		for(int k = 0; k <= m.length()-1; k++){
			if(m.charAt(k)== '1')
				sum+= Math.pow(2, (m.length()-1) - k);
			else
				continue;
		}
		
		return sum;
	

}
}
