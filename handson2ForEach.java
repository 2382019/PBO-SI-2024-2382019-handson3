public class handson2ForEach {
    //tampilkan angka bilangan genap dari 1-20
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                System.out.println(nilai);
            }
        }
    }
}
