import java.util.*;

public class Ramjee {

	public static void main(String[] args) {
		System.out.println("---Ramjee # Test---");
		System.out.print("# ->");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((isRamjeeNumber(n) ? "Ramjee Number" : "Not Ramjee Number"));
	}
	
	static int sumOfSquareOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			sum = sum + (int)(Math.pow((n % 10) , 2));
			n = n / 10;
		}
		return sum;
	}
	
	static boolean isRamjeeNumber(int n) {
		int sum = n;
		while(sum > 10) {
			sum = sumOfSquareOfDigits(sum);
		}
		if(sum == 1) {
			return true;
		}
		return false;
	}

}
