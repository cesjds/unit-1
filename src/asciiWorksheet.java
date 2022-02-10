//Yoav Amit
//Period 1
//Sep 23 21
public class asciiWorksheet 
{
	public static void main(String[] args)
	{
		//List of ASCII values
		int num1 = 33;
		int num2 = 61;
		int num3 = 62;
		int num4 = 126;
		int num5 = 255;
		//Conversion of ASCII values into their Characters
		System.out.println("The ASCII Output for the value of " + num1 + " is " + (char)num1);
		System.out.println("The ASCII Output for the value of " + num2 + " is " + (char)num2);
		System.out.println("The ASCII Output for the value of " + num3 + " is " + (char)num3);
		System.out.println("The ASCII Output for the value of " + num4 + " is " + (char)num4);
		System.out.println("The ASCII Output for the value of " + num5 + " is " + (char)num5 + "\n");
		//List of ASCII characters
		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = 'Z';
		char ch4 = 'z';
		char ch5 = '=';
		//Chars to ASCII values
		System.out.println("The ASCII value of the Character " + ch1 + " is " + (int)ch1);
		System.out.println("The ASCII value of the Character " + ch2 + " is " + (int)ch2);
		System.out.println("The ASCII value of the Character " + ch3 + " is " + (int)ch3);
		System.out.println("The ASCII value of the Character " + ch4 + " is " + (int)ch4);
		System.out.println("The ASCII value of the Character " + ch5 + " is " + (int)ch5);
		
	}
}