package AlgorithmFinalQnA;

public class Question4 {

    // 2 boyutlu String dizisi içindeki herbir String içinde rakam
    // olmayanları ekrana yazan method yazınız.

    public static void main(String[] args) {
        
        // Matrix tanımı.
        String[][] matrix = { {"Caner", "345"} , {"4564" , "Taner"} };

        noNumber(matrix);

    }
    
    // Method tanımı.
    public static void noNumber(String[][] matrix){

        //Matrixteki kelimelerin kontrolü için atanacağı değişken.
        String word;

        // Kontrol anahtarı.
        Boolean key = true;

        // Satır döngüsü.
        for(int i=0; i<matrix.length; i++){

            // Sütun döngüsü.
            for(int j=0; j<matrix[0].length; j++){

                // Kelime değişkene atanıyor.
                word = matrix[i][j];

                // Kelime ekrana yazılacak varsayılarak anahtar çalışıyor.
                key = true;

                // Kelime içinde rakam olup olmadığını kontrol etmek için uzunluğuna kadar giden döngü
                for(int x=0; x<word.length(); x++){

                    // ASCİİ tablosunda rakamlar 47-58 aralığındadır.
                    // Kelimedeki karakterlerin rakam olup olmadığı kontrol ediliyor.
                    if( 47 < word.charAt(x) && word.charAt(x) < 58){

                        // Eğer karakter rakam ise anahtar kapatılıyor ve döngüden çıkılıyor.
                        key = false;
                        break;

                    }

                }

                // Anahtar durumuna göre kelime ekrana yazılıyor.
                if(key){

                    System.out.println(matrix[i][j]);

                }

            }
            
        }

    }

}
