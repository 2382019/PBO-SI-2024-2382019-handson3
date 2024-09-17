public class handson1DoWhile {
    public static void main(String[] args) {
        // diberikan sebuah array buah = {"Apel", "Pisang", "Mangga", "Jeruk"}, cetaklah semua elemen dalam array tsb.

        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int i = 0;

        do {
            System.out.println(buah[i]);
            i++;
        } while (i < buah.length);
    }
}
