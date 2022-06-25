package src.main.java.tutorials.misc;

public class FirstNonRepeatingLetter {
	static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
	static void getCharCountArray(String str){
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
	static int firstNonRepeatingIndex(String str){
        getCharCountArray(str);
        int index = -1, i; 
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
 
        return index;
    }
	public static String firstNonRepeatingLetter( String str ) {
		int index = firstNonRepeatingIndex(str);
		return index == -1 ? "" : Character.toString(str.charAt(index));
	}
	public static void main(String[] args) {
        System.out.println("First non-repeating character is "
                      + firstNonRepeatingLetter("aaabcdb"));
	}

}
