package com.application;

import java.util.ArrayList;
import java.util.List;

import com.functions.Functions;

public class App 
{
    public static void main( String[] args )
    {
    	Functions functions = new Functions();
    	List<Integer> elements=new ArrayList<Integer>();
    	elements.add(86);
    	elements.add(120);
    	elements.add(100);
    	elements.add(56);
    	elements.add(97);
    	elements.add(124);
    	System.out.println("The average :"+ functions.calculateAvgOfIntegers(elements));
    	
    	List<String> stringElements=new ArrayList<String>();
    	stringElements.add("mynt");
    	stringElements.add("abc");
    	stringElements.add("bints");
    	stringElements.add("aab");
    	stringElements.add("aac");
    	System.out.println("The list of string that start with letter a of length 3 :" + functions.searchString(stringElements));
    	
    	List<String> palindromeElements=new ArrayList<String>();
    	palindromeElements.add("abba");
    	palindromeElements.add("motor");
    	palindromeElements.add("aaacacaaa");
    	palindromeElements.add("abc");
    	palindromeElements.add("madam");
    	System.out.println("list of all the palindrome strings:" + functions.checkPalindrome(palindromeElements));
    }
}
