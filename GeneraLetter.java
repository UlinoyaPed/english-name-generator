public class GeneraLetter {
    public static void main(String[] args) {
        char[] one = { 'a' };
        char[] all = new char[26];

        char[] lettervowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] capitallettervowels = new char[5];

        char[] letterconsonants = new char[21];
        char[] capitalletterconsonants = new char[21];
        for (int i = 0; i <= 4; i++) {
            capitallettervowels[i] = (char) (lettervowels[i] - 32);
            System.out.printf("'%c'", capitallettervowels[i]);
            if (i == 4) {
                System.out.printf("\n");
                break;
            }

            System.out.printf(",");
        }

        for (int i = 0; 1 <= 25; i++) {
            all[i] = (char) (one[0] + i);
            System.out.printf("'%c'", all[i]);

            // if (all[i] != lettervowels[0])

            if (i == 25) {
                System.out.printf("\n");
                break;
            }

            System.out.printf(",");
        }
    }
}
