package AlgorithmFinalQnA;

class Question1{

    // 10 elemanlı tam sayı dizisindeki en büyük tek sayıyı
    // bulan java programını yazınız.

    public static void main(String[] args) {
        
        // Dizi tanımı
        int[] array = {9,2,5,4,6,8,7,1,16};

        // Method çağırılığ çıktı bir değişkene atanıyor ve ekrana yansıtılıyor
        int result = greatestValue(array);
        System.out.println(result);
    }

    // Method tanımı
    public static int greatestValue(int[] array){
      
        // Tanımlanan "greatest" değişkeni kod içerisinde kullanıldığından boş bırakılamıyor.
        // Sorunu gidermek için dizideki ilk eleman çift/tek olduğu bilinmeden değişkene atanıyor.
        int greatest = array[0];

        // Burada oluşturulan anahtar bu atanan değişkenin çift veya tek olup olmamasına göre
        // true/false değeri alarak sıradaki kısımda bir atama yapılıp yapılmayacağına karar veriyor.
        boolean key;
        
        if(array[0] %2 != 0){

            // Atanan değer çift ise tekrar atama yapılmasın diye anahtar false
            key = false;

        }else{

            // Atanan değer tek ise tekrar atama yapılsın diye anahtar true
            key = true;

        }
        
        // Döngü içerisinde atanan değerden sonraki elemanlar kontrol ediliyor.
        for(int i=1; i<array.length; i++){

            // Anahtar kontrolü
            if(key){

                // True durumunda dizideki ilk elemanın çift olduğunda atama yapılıyor.
                if(array[i] % 2 != 0){
       
                    greatest = array[i];

                    // Atama sonrası anahtar kapatılıyor ki sıradaki döngüde sıradaki çift sayının
                    // daha büyük ya da küçük olup olmadığı kontrol edilmeden en büyüğe atanmasın.
                    key = false;

                }

            // Anahtar kapalı
            }else{

                // Sayının çift ve greatest değişkeninden büyük olup olmadığının kontrolü.
                if(array[i] %2 != 0 && array[i]>greatest){

                    // Eğer greatest değişkeninden büyük bir çift sayı ise atama yapılıyor.
                    greatest = array[i];

                }

            }

        }
        
        // En büyük çift sayı değişkeni return alıyor.
        return greatest;

    }
}