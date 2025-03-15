import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        // deklarasi array
        int[] numbers = {4, 1, 3, 2};
        
        // print array awal
        System.out.println("Awal: " + Arrays.toString(numbers));
        
        // urutkan array
        Arrays.sort(numbers);
        System.out.println("Terurut: " + Arrays.toString(numbers));
        
        // isi array baru
        int[] newArray = new int[3];
        Arrays.fill(newArray, 5);
        System.out.println("Diisi 5: " + Arrays.toString(newArray));
    }
}