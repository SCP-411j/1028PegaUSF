package com.example.testcode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Testing {

	public static void main(String[] args) throws IOException {
		File file = new File("\\Users\\larso\\OneDrive\\Desktop\\file.txt");
		PrintWriter printWriter = new PrintWriter(file);
		HashMap<String, String> userPass = new HashMap<String, String>();

		userPass.put("Hello", "Love");
		userPass.put("Bye", "Love");
		userPass.put("Hate", "YOu");
		userPass.put("orange", "Love");

		printWriter.println(userPass);

		printWriter.close();
		PrintWriter printWriter2 = new PrintWriter(file);
		userPass.put("YOu", "YOu");
		userPass.put("Kate", "Love");
		printWriter.print(userPass);
//		printWriter.append((CharSequence) userPass); // did not work
//		printWriter2.println(userPass);
	printWriter2.close();
	}

}
