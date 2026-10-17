import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите всю сумму:");
        int money = sc.nextInt();
        System.out.println("Введите цену за 1 шоколадку:");
        int price = sc.nextInt();
        System.out.println("Введите количество обёрток, нужное, чтобы получить ещё одну шоколадку:");
        int wrap = sc.nextInt();
        int count = money / price; // всего шоколадок (начальное значение - количество шоколадок за деньги)
        int wrappers = money / price; // количество обёрток
        while (wrappers >= wrap) {
            int free = wrappers / wrap; // количество бесплатных шоколадок
            count += free; // добавляем в общее число всех шоколадок бесплатные
            wrappers = wrappers % wrap + free; /* количество обёрток от бесплатных шоколадок + обёртки,
             которые не вошли в акцию на бесплатные шоколадки*/
        }
        System.out.println("Всего шоколадок: " + count);
    }
}
