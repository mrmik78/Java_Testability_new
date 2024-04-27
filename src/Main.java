//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        BonusMilesService  service = new BonusMilesService();

        System.out.println();
        System.out.println("Количество миль: ");
        System.out.println(service.calculate(10000));

        System.out.println();
        System.out.println("Количество миль: ");
        System.out.println(service.calculate(20000));

        System.out.println();
        System.out.println("Количество миль: ");
        System.out.println(service.calculate(1020));
    }
}
