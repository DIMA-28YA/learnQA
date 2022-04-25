package YouTube;

public class HomeWork {
    public static void main(String[] args) {
        String  rating = "2";
        switch (rating){
            case "1": System.out.print("Очень плохо!");
                break;
            case "2": System.out.print("Плохо");
                break;
            case "3": System.out.print("Удовлетворительно");
                break;
            case "4": System.out.print("Отлично");
                break;
            case "5": System.out.print("Хорошо");
                break;
            default: System.out.print("Нет такой оценки");
        }
    }
}
