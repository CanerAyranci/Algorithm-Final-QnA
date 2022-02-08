package AlgorithmFinalQnA;

import java.util.Arrays;

public class Question3 {
    
    // KEndisine parametre olarak gelen iki boyutlu String dizisinin
    // sütunlarındaki Stringleri birleştirip tek boyutlu String dizisi
    // haline getiren method yazınız.

    public static void main(String[] args) {
        
        // Marix tanımı.
        String[][] matrix = { {"Eren", "Veren"} , {"Caner", "Taner"} };

        System.out.println(Arrays.toString(conventer(matrix)));

    }

    // Method tanımı.
    public static String[] conventer(String[][] matrix){
    
        // Sütünlar birleştirileceği için sadece satır sayısı kadar geniş.
        int size = matrix.length;
        int pointer=0;

        // Dönüştürülen matrixin doldurulacağı dizi tanımlanıyor.
        String[] array = new String[size];

        // Eğer direkt += ile döngüde ekleme yaparsak dizi elemanlarının başında
        // 'null' değeri görünür. Bu nedenle dizi elemanlarına boş atama yapıyoruz.
        for(int x=0; x<size; x++){

            array[x] = "";

        }

        // Sütun dögüsü
        for(int i=0; i<matrix[0].length; i++){

            // Satır döngüsü
            for(int j=0; j<matrix.length; j++){

                // Matrix sütunundaki satır değerleri dizinin ilk elemanında
                // toplanıyor.
                array[pointer] += matrix[i][j];  

            }

            // Sıradaki sütun için dizi indisi arttırılıyor.
            pointer++;

        }

        // Dizi döndürülüyor.
        return array;
    }

}
