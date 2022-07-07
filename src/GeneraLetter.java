public class GeneraLetter {
	public static void main(String[] args) {
		char[] one = { 'a' };
		char[] all = new char[26];

		char[] lettervowels = { 'a', 'e', 'i', 'o', 'u' };

//		  char[] letterconsonants = new char[21]; for (int i = 0; i <= 4; i++) {
//		  capitallettervowels[i] = (char) (lettervowels[i] - 32);
//		  System.out.printf("'%c'", capitallettervowels[i]); if (i == 4) {
//		  System.out.printf("\n"); break; }
//		  
//		  System.out.printf(","); }

		System.out.printf("switch (charname[i]) {");
		for (int i = 0; 1 <= 25; i++) {
			all[i] = (char) (one[0] + i);
			// System.out.printf("'%c'", all[i]);
			switch (all[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default:
				System.out.printf("\ncase '%c':", all[i]);
			}
			if (i == 25)
				break;
		}
		System.out.printf("\nbreak;\ndefault:\n}");

	}
}
