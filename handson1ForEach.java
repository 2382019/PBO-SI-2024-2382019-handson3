public class handson1ForEach {
    public static void main(String[] args) {
        // diberikan sebuah array buah = {"Apel", "Pisang", "Mangga", "Jeruk"}, cetaklah semua elemen dalam array tsb.

        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        for (String nilai : buah) {
            System.out.println(nilai);
        }
    }
}
