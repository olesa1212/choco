import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите всю сумму:");
        int money = a.nextInt();
        System.out.println("Введите цену за 1 шоколадку:");
        int price = a.nextInt();
        System.out.println("Введите количество обёрток, чтобы получить ещё одну шоколадку в подарок:");
        int wr = a.nextInt();
        int c= money / price; // всего шоколадок
        int wrs = money / price; // количество обёрток
        while (wrs >= wr) {
            int free = wrs / wr; // бесплатные шоколадки 
            c+= free; // все шооколадки+бесплатные
            wrs = wrs % wr + free;
        }
        System.out.println("Всего шоколадок: " + c);
    }
}
