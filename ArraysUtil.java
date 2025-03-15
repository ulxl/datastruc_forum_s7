import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        // Deklarasi array
        int[] numbers = {4, 1, 3, 2};
        
        // Tampilkan array awal
        System.out.println("Awal: " + Arrays.toString(numbers));
        
        // Urutkan array
        Arrays.sort(numbers);
        System.out.println("Terurut: " + Arrays.toString(numbers));
        
        // Isi array baru
        int[] newArray = new int[3];
        Arrays.fill(newArray, 5);
        System.out.println("Diisi 5: " + Arrays.toString(newArray));
    }
}