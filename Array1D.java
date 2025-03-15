public class Array1D {
    public static void main(String[] args) {
        // deklarasi 
        int[] numbers = {10, 20, 30, 40, 50};
        
        // print isi array
        System.out.println("Isi array:");
        for(int num : numbers) {
            System.out.println(num);
        }
        
        // print panjang array
        System.out.println("Panjang array: " + numbers.length);
    }
}