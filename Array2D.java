public class Array2D {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi array 2D (3 baris x 4 kolom)
        int[][] matrix = {
            {1, 2, 3, 4},    // Baris 0
            {5, 6, 7, 8},    // Baris 1
            {9, 10, 11, 12}  // Baris 2
        };
        
        // print isi array 2D
        System.out.println("Isi array 2D:");
        for(int i = 0; i < matrix.length; i++) {         // Loop baris
            for(int j = 0; j < matrix[i].length; j++) {  // Loop kolom
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Pindah baris setelah setiap baris selesai
        }
        
        // print jumlah baris dan kolom
        System.out.println("\nJumlah baris: " + matrix.length);
        System.out.println("Jumlah kolom pada baris pertama: " + matrix[0].length);
    }
}