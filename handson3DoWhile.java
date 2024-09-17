public class handson3DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 != 0 && i <= 15) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20 && i <= 15);
    }
}
