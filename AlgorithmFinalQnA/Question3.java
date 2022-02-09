package AlgorithmFinalQnA;

import java.util.Arrays;

public class Question3 {
    
    // TR
    // Kendisine parametre olarak gelen iki boyutlu String dizisinin
    // sütunlarındaki Stringleri birleştirip tek boyutlu String dizisi
    // haline getiren method yazınız.
    // EN
    // Collecting the columns of a two dimensional String arrays in elements of one dimensional String array
    
    public static void main(String[] args) {
        
        // Marix tanımı.
        // Declaring matrix.
        String[][] matrix = { {"Eren", "Veren"} , {"Caner", "Taner"} };

        System.out.println(Arrays.toString(conventer(matrix)));

    }

    // Method tanımı.
    // Declaring method.
    public static String[] conventer(String[][] matrix){
    
        // Sütünlar birleştirileceği için sadece satır sayısı kadar geniş.
        // Cause of we are adding columns together size of array is equal to row number.
        int size = matrix.length;
        int pointer=0;

        // Dönüştürülen matrixin doldurulacağı dizi tanımlanıyor.
        // Declaring the one dimensional array.
        String[] array = new String[size];

        // TR
        // Eğer direkt += ile döngüde ekleme yaparsak dizi elemanlarının başında
        // 'null' değeri görünür. Bu nedenle dizi elemanlarına boş atama yapıyoruz.
        // EN
        // If you add the columns directly by using += in the next part you'll see 
        // at the start of every element there will be 'null' as value. Just to avoid that
        // we are filling the array with blank Strings.
        for(int x=0; x<size; x++){

            array[x] = "";

        }

        // Sütun dögüsü
        // Colunm loop
        for(int i=0; i<matrix[0].length; i++){

            // Satır döngüsü
            // Row loop
            for(int j=0; j<matrix.length; j++){

                // Matrix sütunundaki satır değerleri dizinin ilk elemanında toplanıyor.
                // Adding row values in one column together in first element of one dimensional array.
                array[pointer] += matrix[i][j];  

            }

            // Sıradaki sütun için dizi indisi arttırılıyor.
            // Just to get add next column values we are highering pointers value to fill them in to next element of array.
            pointer++;

        }

        // Dizi döndürülüyor.
        // Returning array.
        return array;
    }

}
