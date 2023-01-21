/*
aynı işi yapan fakat farklı turdeki parametreler alan sınıf veya metotlarda
generics metodu kullanılır.

 */

package xxx;


public class GenericsKavrami {
    public static void main(String[] args) {
        String[] isimler = {"emre", "ayse", "ali"};
        Integer[] sayilar = {1,5,7};
        Character[] karakterler = {'a', 'b', 'k'};


        //generic sınıfını kullanarak yazdıralım:
        GenericDiziYazdir<String> stringGenericDiziYazdir = new GenericDiziYazdir<String>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGenericDiziYazdir = new GenericDiziYazdir<>();
        integerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> characterGenericDiziYazdir= new GenericDiziYazdir<>();
        characterGenericDiziYazdir.yazdir(karakterler);




    }
}
