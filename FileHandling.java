package com.aurionprohw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws FileNotFoundException {

		int lineCount = 0, wordCount = 0, charCount = 0;

		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\danisha.ansari\\Aurionpro File\\text.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) {
				lineCount++;
				charCount += line.length();

				String[] words = line.split("\\s+");
				wordCount += words.length;
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		System.out.println("Number of Lines: " + lineCount);
		System.out.println("Number of Words: " + wordCount);
		System.out.println("Number of Characters: " + charCount);
	}
}
