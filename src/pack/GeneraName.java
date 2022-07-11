package pack;

import java.util.Random;

public class GeneraName {
	char[] letter_vowels = { 'a', 'e', 'i', 'o', 'u' };
	char[] all_letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public String generatName(int length) {
		String name = "";
		char[] charname = new char[length];
		Random rand = new Random();
		// char capital = all_letter[rand.nextInt(26)];
		// name += (char) (capital - 32);

		if (length > 50) {
			name = "输入位数过长";
		} else {
			for (int i = 0; i < length; i++) {

				charname[i] = all_letter[rand.nextInt(26)];
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
						charname[i] = letter_vowels[rand.nextInt(5)];// 若出现辅音字母，则下一个从元音字母中生成
						name += charname[i];// 使名字中没有两个相连的辅音字母
						break;
					default:
						break;
					}
					// if
				}
				// for
			}
			// else
			name = titleCase(name);
		}

		return name;

	}
	// generaName

	private static String titleCase(String findName) {// 首字母大写
		byte[] items = findName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}
}
