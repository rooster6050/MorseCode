package morsepackage;

import java.util.Scanner;

public class MorseScanner 
{
	
	private Scanner sc = new Scanner(System.in);
	
	public String getNextMorse()
	{
		return sc.next();
	}

}
