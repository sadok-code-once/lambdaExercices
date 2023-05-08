package com.example.lambda.serviceTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lambda.service.Service;

public class ServiceTest {
	@Test
	void testConcat() {
		List<String> l1 = Arrays.asList("sadok", "sbaa");
		List<Integer> l2 = Arrays.asList(25);
		List<String> result = Service.concat(l1, l2);
		assertEquals(Arrays.asList("sadok", "sbaa", "25"), result);
	}

	@Test
	public void testPalindrome() {
		String str = "romaamor";
		boolean result = Service.isPalindrome(str);
		assertEquals(true, result);
	}

	@Test
	public void testOccurence() {
		String str = "sadok";
		String text = "sadok is proud of sadok";
		int result = Service.occurence(str, text);
		assertEquals(2, result);
	}

	@Test

	public void testFirstOccurence() {
		String str = "sadoksbaa";
		Character result = Service.firstSingleOccurence(str);
		assertEquals((Character) 'd', result);
	}

	@Test

	public void testFirstOccurenceWithNullInput() {
		String str = "ddd";
		Character result = Service.firstSingleOccurence(str);
		assertEquals(null, result);
	}

}
