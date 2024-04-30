//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Количество миль: " + miles);

        price = 5_000;
        miles = service.calculate(price); // должно получиться 250
        System.out.println("Количество миль: " + miles);

        price = 1_000;
        miles = service.calculate(price); // должно получиться 50
        System.out.println("Количество миль: " + miles);
    }
}