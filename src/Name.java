import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Name {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字字母位数(>=3):");
		int length = sc.nextInt();
		if (length < 3) {
			System.out.println("长度不合规");
			System.exit(0);
		}
		System.out.println("你输入的长度是：" + length + "\n[y]确定 [n]退出");
		String confirm = sc.next();
		switch (confirm) {
		case "y":
			System.out.println("确定");
			break;
		default:
			System.out.println("退出");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
		Name name = new Name();
		System.out.println("生成的名字：" + name.generatName(length));
	}

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