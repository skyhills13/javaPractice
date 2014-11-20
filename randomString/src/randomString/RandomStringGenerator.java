package randomString;

import java.util.Random;

public class RandomStringGenerator {

	public static void main(String[] args) {

		Random rng = new Random();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int length = 7;
		
		String generatedString = generateString(rng, characters, length);
		System.out.println(generatedString);
	}

	public static String generateString(Random rng, String characters, int length) {
		
		char[] text = new char[length];
		for (int i = 0; i < length; i++)
		{
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}
}
