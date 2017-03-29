package faz;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		try {
			// arrange data in sorted manner
			Set<String> set = new TreeSet<>();
			set.add("fazeela");
			set.add("payal");
			set.add("renu");
			set.add("ankit");

			for (String s : set) {
				System.out.println(s);
			}

			System.out.println("--------------------");
			Set<Integer> setint = new TreeSet<>();
			setint.add(10);
			setint.add(1);
			setint.add(3);

			for (Integer num : setint) {
				System.out.println(num);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
