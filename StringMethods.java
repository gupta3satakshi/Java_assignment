package Assignment5;

import java.util.Arrays;

public class StringMethods {
	//a
	public static void anagramString(String s1, String s2) {
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		 if(s1.length() == s2.length()) {
			 char[] str1 = s1.toCharArray();
			 char[] str2 = s2.toCharArray();
			 Arrays.sort(str1);
			 Arrays.sort(str2);
			 if(Arrays.equals(str1, str2)) {
				 System.out.println("Strings are anagram");
			 }
		 }else {
			 System.out.println("Strings are not anagram");
		 }
	}
	//b
	public static void countCharacter(String s1){
		int lower_count = 0, upper_count = 0, spc_count = 0;
		char[] str = s1.toCharArray();
		for(int i: str) {
			if(i >= 65 && i <= 90 ) {
				upper_count++;
			}else if (i >= 97 && i <= 122) {
				lower_count++;
			}else {
				spc_count++;
			}
		}
		System.out.println("Upper case letters are: " +upper_count + ",\nLower case letters are: "+lower_count +",\nSpecial case letters are: "+ spc_count );
	}
	//c
	public static void checkUpperCase(String s1) {
		char[] str = s1.toCharArray();
		boolean flag = false;
		for(char c: str) {
			if(c >= 'A' && c <= 'Z') {
				flag= true;
			}else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("The string is in upper case.");
		}else {
			System.out.println("The string is not in upper case");
		}
	}
	//d
	public static void leftShiftString(String s1) {
	    
	        int n = 2; 
	        n = n % s1.length(); 
	        String shifted = s1.substring(n).concat(s1.substring(0, n));

	        System.out.println("Original: " + s1);
	        System.out.println("Left Shift by " + n + ": " + shifted);
	    }
	
	//e  
	
	public static boolean myEquals(String s1, String s2) {
       if (s1.length() != s2.length()) {
            return false;
        }

        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
//f
    public static boolean myEqualsIgnoreCase(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();
	        for (int i = 0; i < s1.length(); i++) {
	            char c1 = s1.charAt(i);
	            char c2 = s2.charAt(i);

	            if (c1 != c2) {
	                return false;
	            }
	        }
	        return true;
	    }

	    	       
	public static void main(String[] args) {
		anagramString("Listen", "Silent");
		anagramString("Listen", "kitchen");
		countCharacter("Java programming @module1 #batch2025");
		checkUpperCase("HelLo");
		checkUpperCase("HELLOJAVA");
		leftShiftString("Greeting");
		System.out.println(myEqualsIgnoreCase("Hello","hello"));
		System.out.println(myEqualsIgnoreCase("WORLD", "world"));
		System.out.println(myEqualsIgnoreCase("Java", "Python"));
		System.out.println(myEquals("hello", "hello"));
        System.out.println(myEquals("Hello", "hello"));
	}

}
