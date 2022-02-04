package Selenium.week1.day2;

public class Prime {
	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			// condition for nonprime number
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (isPrime=true)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}

