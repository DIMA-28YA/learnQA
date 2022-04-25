package Method_String_YouTube;

public class Method_IndexOf1_String {
    public static void main(String[] args) {

        //"morni" - это часть строки "Good morning". Первый символ найденной подстроки "morni" имеет индекс 5. Поэтому,
        // в консоли получаем 5.
        //"Vertex" в строке не встречается. Получаем -1;
        //"Good morning" мы ищем три раза.
        //Первый раз мы задавали отрицательный индекс (-2). Метод indexOf интерпретирует его как ноль
        // (т.е. "искать с начала строки"). Поэтому, в консоли получаем индекс ноль - начало подстроки совпадает с
        // началом основной строки.
        //Во второй раз мы задаем значение 2. Фактически, теперь метод проверяет, встречается ли в строке "od morning"
        //подстрока"Good morning". Нет, не встречается. Получаем (-1) в консоли.
        //В третий раз мы задаем значение, которое явно больше длины строки 888. Это как если бы мы искали что-то в пустой строке.
        // Получаем (-1).

        String gm = "Good morning";

        int index1 = gm.indexOf("morni");
        int index2 = gm.indexOf("Vertex");
        int index3 = gm.indexOf("Good morning", -2);
        int index4 = gm.indexOf("Good morning", 2);
        int index5 = gm.indexOf("Good morning", 999);
        System.out.println("Мы ищем 'morni' в строке "+gm+". Индекс "+index1 );
        System.out.println("Мы ищем 'Vertex' в строке "+gm+". Индекс "+index2 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса -2. Результат: "+index3 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 2. Результат: "+index4 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 888. Результат: "+index5 );
    }
}
