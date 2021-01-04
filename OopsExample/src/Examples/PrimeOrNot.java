package Examples;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		int temp, num;
		Boolean isPrime = true;
		System.out.println("enter the number");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("number is prime true:" + num);
		else
			System.out.println("number is not prime false :3" + num);

	}

}
