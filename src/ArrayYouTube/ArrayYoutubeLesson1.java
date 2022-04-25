package ArrayYouTube;

public class ArrayYoutubeLesson1 {
    public static void main(String[] args) {

        int mas [] = new int [6]; // если массив большой то можно восмользоваться циклом

        for (int i = 0; i < mas.length; i++) {// length - возвращает длинну массива (6)
            mas [i] =(int) (Math.random()*10); // random идет только с переменной double, преобразовем в int. double присваивает значения
                                // от 0,1 до 0,9. ]поэтому мы умножаем на 10

            System.out.println(mas[i]);
        }

    }
}
