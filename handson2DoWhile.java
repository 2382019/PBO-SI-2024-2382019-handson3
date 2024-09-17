public class handson2DoWhile {
    public static void main(String[] args) {
        // tampilkan angka bilangan genap dari 1-20

        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}
