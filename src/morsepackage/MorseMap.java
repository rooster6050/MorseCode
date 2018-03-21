package morsepackage;

import java.util.HashMap;

public class MorseMap 
{
	
	private HashMap<String, Character> mrsMap = new HashMap<>();
	
	public MorseMap()
	{
		mrsMap.put(".-", 'A');
		mrsMap.put("-...", 'B');
		mrsMap.put("-.-.", 'C');
        mrsMap.put("-..", 'D');
        mrsMap.put(".", 'E');
        mrsMap.put("..-.", 'F');
        mrsMap.put("--.", 'G');
        mrsMap.put("....", 'H');
        mrsMap.put("..", 'I');
        mrsMap.put(".---", 'J');
        mrsMap.put("-.-", 'K');
        mrsMap.put(".-..", 'L');
        mrsMap.put("--", 'M');
        mrsMap.put("-.", 'N');
        mrsMap.put("---", 'O');
        mrsMap.put(".--.", 'P');
        mrsMap.put("--.-", 'Q');
        mrsMap.put(".-.", 'R');
        mrsMap.put("...", 'S');
        mrsMap.put("-", 'T');
        mrsMap.put("..-", 'U');
        mrsMap.put("...-", 'V');
        mrsMap.put(".--", 'W');
        mrsMap.put("-..-", 'X');
        mrsMap.put("-.--", 'Y');
        mrsMap.put("--..", 'Z');
	}
	
	public char translateMorse(String morse)
	{
		return mrsMap.get(morse);
	}
	
	

}
