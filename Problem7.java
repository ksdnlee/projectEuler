import java.util.ArrayList;


public class Problem7 {

	public static void main(String args[]) {
		ArrayList<Integer> primes = new ArrayList();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);
		int num = 14;
		while (primes.size() != 10001) {
			int j = 0;
			while(num%primes.get(j) != 0) {
				j++;
				if (j == primes.size()) {
					primes.add(num);
					break;
				}
			}
			num++;
		}
		System.out.println(primes.get(10000));
	}
}
