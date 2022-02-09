package AlgorithmFinalQnA;

public class Question4 {

    // TR
    // 2 boyutlu String dizisi içindeki herbir String içinde rakam
    // olmayanları ekrana yazan method yazınız.
    // EN
    // Printing the elements in two dimensional array which is not including any numbers in it.
    
    public static void main(String[] args) {
        
        // Matrix tanımı.
        // Declaring matrix.
        String[][] matrix = { {"Caner", "345"} , {"4564" , "Taner"} };

        noNumber(matrix);

    }
    
    // Method tanımı.
    // Declaring method.
    public static void noNumber(String[][] matrix){

        //Matrixteki kelimelerin kontrolü için atanacağı değişken.
        //Varaible which is going to hold the elements to check if they're including numbers in them.
        String word;

        // Kontrol anahtarı.
        // Control key.
        Boolean key = true;

        // Satır döngüsü.
        // Row loop.
        for(int i=0; i<matrix.length; i++){

            // Sütun döngüsü.
            // Column loop.
            for(int j=0; j<matrix[0].length; j++){

                // Kelime değişkene atanıyor.
                // Holding the element in varaible.
                word = matrix[i][j];

                // Kelime ekrana yazılacak varsayılarak anahtar çalışıyor.
                // By thinking we are going to print the element by default key is true.
                key = true;

                // Kelime içinde rakam olup olmadığını kontrol etmek için uzunluğuna kadar giden döngü
                // The loop which is long as word to check every each char in element.
                for(int x=0; x<word.length(); x++){

                    // TR
                    // ASCİİ tablosunda rakamlar 47-58 aralığındadır.
                    // Kelimedeki karakterlerin rakam olup olmadığı kontrol ediliyor.
                    // EN
                    // In ASCİİ table numbers are between 48-58
                    // by their ASCİİ values we are checking if the char is a number or not.
                    if( 47 < word.charAt(x) && word.charAt(x) < 58){

                        // Eğer karakter rakam ise anahtar kapatılıyor ve döngüden çıkılıyor.
                        // If the char is a number we are turning key off and breaking loop.
                        key = false;
                        break;

                    }

                }

                // Anahtar durumuna göre kelime ekrana yazılıyor.
                // By the value of key we are printing the element.
                if(key){

                    System.out.println(matrix[i][j]);

                }

            }
            
        }

    }

}
