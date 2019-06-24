public class SuShu {
    public static void main(String args[]) {
        System.out.println("3--150 sushu");
        int n = 0;
        outer:
        for (int i = 3; i <= 150; i += 2) {
            for (int j = 3; j < i / 2; j += 2) {
                if (i % j == 0)
                    continue outer;
            }
            System.out.print(i + " ");
            n++;
            if (n <= 10)
                continue;
            System.out.println();
            n = 0;
        }
        System.out.println("");
    }
}