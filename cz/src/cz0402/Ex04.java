package cz0402;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int x = 0; x < 10; x++) {
			System.out.println(r.nextInt(100));
		}
	}
}
