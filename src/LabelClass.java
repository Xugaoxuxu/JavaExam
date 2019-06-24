/**
 * 不是很熟悉label
 */
public class LabelClass {
    public static void main(String[] args) {
        int i = 0;
        outer:
        // Can't have statements here
        for (; true; ) { // infinite loop
            inner:
            // Can't have statements here
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue2");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break3");
                    i++; // Otherwise i never gets incremented.
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer7");
                    i++; // Otherwise i never gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer8");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner3");
                        continue inner;
                    }
                }
            }
        }// Can't break or continue to labels here
    }
}
