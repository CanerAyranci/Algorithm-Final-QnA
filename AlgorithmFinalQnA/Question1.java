package AlgorithmFinalQnA;

class Question1{

    // TR
    // 10 elemanlı tam sayı dizisindeki en büyük tek sayıyı
    // bulan java programını yazınız.

    // EN
    // Write a java porgram which finds the greatest odd number
    // in a ten 10 element array.
    
    public static void main(String[] args) {
        
        // Dizi tanımı
        // Declaring array
        int[] array = {9,2,5,4,6,8,7,1,16};

        // Method çağırılıp çıktı bir değişkene atanıyor ve ekrana yansıtılıyor
        // Declaring a varaible to hold to result of method then print it
        int result = greatestValue(array);
        System.out.println(result);
    }

    // Method tanımı
    // Declaring method
    public static int greatestValue(int[] array){
      
        // TR
        // Tanımlanan "greatest" değişkeni kod içerisinde kullanıldığından boş bırakılamıyor.
        // Sorunu gidermek için dizideki ilk eleman çift/tek olduğu bilinmeden değişkene atanıyor.
        // EN
        // Cause of declared "greatest" varaible is used in code while not holding any value
        // there's an error existing. Just to solve this error we are holding the first
        // element in array without know if its odd or even.
        int greatest = array[0];

        // TR
        // Burada oluşturulan anahtar bu atanan değişkenin çift veya tek olup olmamasına göre
        // true/false değeri alarak sıradaki kısımda bir atama yapılıp yapılmayacağına karar veriyor.
        // EN
        // The "key" boolean declared here is helping us to decide if we are going to hold the element 1
        // as "greatest" at next part.
        boolean key;
        
        if(array[0] %2 != 0){

            // Atanan değer tek ise tekrar atama yapılmasın diye anahtar false
            // If the value is odd key is getting value of false
            key = false;

        }else{

            // Atanan değer çift ise tekrar atama yapılsın diye anahtar true
            // If the value is even key is getting value of true
            key = true;

        }
        
        // Döngü içerisinde atanan değerden sonraki elemanlar kontrol ediliyor.
        // Controlling the next elements in array in the loop.
        for(int i=1; i<array.length; i++){

            // Anahtar kontrolü
            // Key control
            if(key){

                // True durumunda dizideki ilk elemanın tek olduğunda atama yapılıyor.
                // While key is true we are checking if the element is odd to hold it in "greatest".
                if(array[i] % 2 != 0){
       
                    greatest = array[i];

                    // TR
                    // Atama sonrası anahtar kapatılıyor ki sıradaki döngüde sıradaki tek sayının
                    // daha büyük ya da küçük olup olmadığı kontrol edilmeden en büyüğe atanmasın.
                    // EN
                    // After giving value of element 1 to "greatest" turning the key off with value of false.
                    key = false;

                }

            // Anahtar kapalı
            // During key is false
            }else{

                // Sayının tek ve greatest değişkeninden büyük olup olmadığının kontrolü.
                // Checking if the element is odd and greater than "greaters" varaible.
                if(array[i] %2 != 0 && array[i]>greatest){

                    // Eğer greatest değişkeninden büyük bir tek sayı ise atama yapılıyor.
                    // If it is we are holding the value inside the "greatest" varaible.
                    greatest = array[i];

                }

            }

        }
        
        // En büyük tek sayı değişkeni return alıyor.
        // Returning the greatest odd number in array.
        return greatest;

    }
}
