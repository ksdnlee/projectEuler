
public class Problem6 {
	public static void main (String args[]) {
		int sumOfSquares = 0;
		int squareOfSums = 0;
		//sumOfSquares
		for (int i = 1; i < 101; i++) {
			sumOfSquares += (i*i);
		}
		//squareOfSums
		for (int i = 1; i< 101; i++) {
			squareOfSums += i;
		}
		squareOfSums = squareOfSums* squareOfSums;
		
		//difference
		System.out.println(squareOfSums - sumOfSquares);
	}
}
