public class handson3ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0 && i <= 15) {
                System.out.println(i);
                } else if (i > 15) {
                    break;
            }
        }
    }
}
