import java.util.Random;

public class GeneraName {
	char[] lettervowels = { 'a', 'e', 'i', 'o', 'u' };
	char[] allletter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public String generatName(int length) {
		String name = "";
		char[] charname = new char[length];
		Random rand = new Random();
		// char capital = allletter[rand.nextInt(26)];
		// name += (char) (capital - 32);
		for (int i = 0; i < length; i++) {
			charname[i] = allletter[rand.nextInt(26)];
			name += charname[i];
			if (i != length - 1) {
				switch (charname[i]) {
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					i++;
					charname[i] = lettervowels[rand.nextInt(5)];
					name += charname[i];
					break;
				default:
					break;
				}
				// System.out.println(charname[i]);}

			}

		}
		return name;

	}
}
