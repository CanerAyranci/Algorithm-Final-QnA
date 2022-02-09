package AlgorithmFinalQnA;

public class Question2 {

    // TR
    // Kendisine parametre olarak gelen tek boyutlu sayısal
    // içindeki negatif sayıların toplamını döndüren rekürsif
    // metodu yazınız
    // EN
    // Write main and recursive method code which calculates the summation of
    // negative elements in a one divisional array
    
    public static void main(String[] args) {
        // Array tanımı
        // Declaring array
        int[] array = {-5,5,2,-3,-2,4};

        // Method çağırılıp çıktı bir değişkene atanıyor ve ekrana yansıtılıyor
        // Declaring a varaible to hold the result value of method and print it
        int result = addNeg(array, array.length - 1);
        System.err.println(result);

    }
    
    // Method tanımı
    // Declaration of method
    public static int addNeg(int[] array, int pointer){

        // Bitirme kondisyonu kontrol ediliyor
        // Ending condition
        if(pointer == 0){

            // Eğer sayı negatif ise son eleman olarak return alıyor
            // If the element is negative returns to end method
            if(array[pointer] < 0){

                return array[pointer];
            
            // Eger sayı pozitif ise 0 eleman olarak return alıyor
            // If the element is positive  returns zero to end method
            }else{

                return 0;

            }

        // Bitirme kondisyonu gerçekleşmediği için rekürsif kısma giriliyor
        // Cause of ending condition is not happening getting into recursive part
        }else{

            // Sayı negatif mi kontrol ediliyor
            // Checking if the element is negative
            if(array[pointer] < 0){

                // Sayı negatif olduğu için sayı ile pointer değeri bir düşürülmüş method toplamı return alıyor
                // Cause of the element is negative returning "element+method" by lowering the value of pointer by one
                return array[pointer] + addNeg(array, --pointer);

            }else{

                // Sayı pozitif olduğu için sadece pointer değeri bir düşürülmüş method return alıyor
                // Cause of the element is positive theres nothing to sum so we are returning only the method by lowering the value of pointer by one
                return addNeg(array, --pointer);

            }

        }

    }

}
