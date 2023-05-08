package com.example.lambda.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Service {

	public static Character firstSingleOccurence(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("empty string or null");
		} else {
			List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			return list.stream().filter(c -> Collections.frequency(list, c) == 1).findFirst().orElse(null);
		}
	}

	public static List<String> concat(List<String> l1, List<Integer> l2) {
		return Stream.concat(l1.stream(), l2.stream().map(String::valueOf)).collect(Collectors.toList());
	}

	public static boolean isPalindrome(String str) {
		return IntStream.range(0, str.length() / 2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
	}

	public static int occurence(String str, String text) {
		List<String> words = Arrays.asList(text.split(" "));
		return (int) words.stream().filter(s -> s.equals(str)).count();
	}

}
