public class handson2While {
    public static void main(String[] args) {
        // tampilkan angka bilangan genap dari 1-20

        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
