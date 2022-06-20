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

    public String generatName(int length) {
        String name = "";
        char[] lettervowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] letterconsonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'g', 'k', 'l', 'm', 'n' };

        char[] capitallettervowels = { 'A', 'E', 'I', 'O', 'U' };

        return name;

    }
}