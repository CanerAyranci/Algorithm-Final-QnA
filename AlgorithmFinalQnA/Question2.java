package AlgorithmFinalQnA;

public class Question2 {

    // Kendisine parametre olarak gelen tek boyutlu sayısal
    // içindeki negatif sayıların toplamını döndüren rekürsif
    // metodu yazınız

    public static void main(String[] args) {
        // Array tanımı
        int[] array = {-5,5,2,-3,-2,4};

        // Method çağırılıp çıktı bir değişkene atanıyor ve ekrana yansıtılıyor
        int result = addNeg(array, array.length - 1);
        System.err.println(result);

    }
    
    // Method tanımı
    public static int addNeg(int[] array, int pointer){

        // Bitirme kondisyonu kontrol ediliyor
        if(pointer == 0){

            // Eğer sayı negatif ise son eleman olarak return alıyor
            if(array[pointer] < 0){

                return array[pointer];
            
            // Eger sayı pozitif ise 0 eleman olarak return alıyor
            }else{

                return 0;

            }

        // Bitirme kondisyonu gerçekleşmediği için rekürsif kısma giriliyor
        }else{

            // Bitirme kondisyonu kontrol ediliyor
            if(array[pointer] < 0){

                // Sayı negatif olduğu için sayı ile pointer değeri bir düşürülmüş method toplamı return alıyor
                return array[pointer] + addNeg(array, --pointer);

            }else{

                // Sayı pozitif olduğu için sadece pointer değeri bir düşürülmüş method return alıyor
                return addNeg(array, --pointer);

            }

        }

    }

}