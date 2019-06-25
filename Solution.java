import java.util.Scanner;

class MyCalculator {
	public long power(int p, int q) throws Exception {
		if (p < 0 || q < 0)
			throw new Exception("n or p should not be negative.");
		if (p == 0 && q == 0)
			throw new Exception("n and p should not be zero.");

		return (long) Math.pow(p, q);

	}

}

public class Solution {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}