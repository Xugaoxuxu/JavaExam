public class Fib {
    public static void main(String args[]) {
        System.out.println("Fib数列：");
        int[] f = new int[15];
        f[0] = f[1] = 1;
        for (int i = 2; i <= 14; i++)
            f[i] = f[i - 1] + f[i - 2];
        for (int i = 1; i <= 15; i++)
            System.out.println("f[" + i + "]=" + f[i - 1]);
    }
}	