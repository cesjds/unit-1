
//Yoav Amit
//Period 1
//October 8, 2021

public class unit1Test 
{
	public static void main(String[] args)
	{
		String str = "0123456789";
		//Print str
		System.out.println(str);
		//Print Length of str
		System.out.println(str.length());
		//Print Character #4
		System.out.println(str.charAt(3));
		//Substring first 3 chars
		System.out.println(str.substring(0,3));
		//Substring #4 & #5
		System.out.println(str.substring(3,5));
		//Substring last 3 chars
		System.out.println(str.substring(str.length()-3));	
	}
}
		