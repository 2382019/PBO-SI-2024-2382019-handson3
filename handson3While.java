public class handson3While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 3 != 0 && i <= 15) {
                System.out.println(i);
            }
            i++;
            if (i > 15) {
                break;
            }
        }
    }
}
