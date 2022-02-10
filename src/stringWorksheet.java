//Yoav Amit
//Period 1
//September 23 2021


public class stringWorksheet {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		//System.out.println(s.charAt(5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(4));		
		System.out.println(s.substring(5));	
		//System.out.println(s.substring(6));	
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(3,5));	
		//System.out.println(s.substring(0,6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("d"));
		//Below are the 2 additional methods i did
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("O"));

	}

}
