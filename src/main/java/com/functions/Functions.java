package com.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functions {
	public double calculateAvgOfIntegers(List<Integer> elements)
	{
		return elements.stream().mapToInt(a->a).average().getAsDouble();
	}
	
	public List<String> searchString(List<String> elements) {
	return elements.stream()
			  .filter(s -> s.startsWith("a"))
			  .filter(s -> s.length() == 3)
			  .collect(Collectors.toList());
	}
	public List<String> checkPalindrome(List<String>  elements)
	{
		List<String> palindrome=new ArrayList<String>();
		for(String x:elements)
		{
			StringBuilder stringBuilder1=new StringBuilder(x);
			StringBuilder stringBuilder2=new StringBuilder(x);
			stringBuilder2.reverse();
			if(String.valueOf(stringBuilder1).equals(String.valueOf(stringBuilder2)))
			{
				palindrome.add(String.valueOf(stringBuilder1));
			}
			else
			{
				continue;
			}
		}
		return palindrome;
	}
}
