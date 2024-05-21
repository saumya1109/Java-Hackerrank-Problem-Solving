package com.test.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		while (n-- > 0) {
			Set<String> set = new LinkedHashSet<>();
			List<String> list = new ArrayList<>();
			String in = sc.nextLine();
			String[] sl = in.split(" ");

			for (String s : sl) {
				if (!list.contains(s.toLowerCase())) {
					set.add(s);
					list.add(s.toLowerCase());
				}
			}

			String output = "";

			for (String o : set) {
				output += o + " ";
			}

			System.out.println(output);
		}

	}

}
