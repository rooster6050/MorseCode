package morsepackage;

public class MorseMain {
	
	static MorseMap morseMap = new MorseMap();
	static MorseScanner morseScanner = new MorseScanner();

	public static void main(String[] args) 
	{
		
		while(true)
		{
			String next = morseScanner.getNextMorse();
			{
				if(next.equals("/"))
				{
					System.out.println();
					System.out.print(morseMap.translateMorse(morseScanner.getNextMorse()));
				}
				else
				{
					System.out.print(morseMap.translateMorse(next));
				}
			}

		}
		
	}

}
