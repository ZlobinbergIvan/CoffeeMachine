import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var moneyAmount = 180;
        var cappucinoPrice = 180;
        var lattePrice = 120;
        var espressoPrice = 80;
        var waterPrice = 20;

        boolean canBuyAnything = false;
        boolean isMilkEnough = true;

        if (moneyAmount >= cappucinoPrice && isMilkEnough == true) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }
        if (moneyAmount >= lattePrice && isMilkEnough == true) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }
        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }
        if (canBuyAnything == false)
        {
            System.out.println("Недостаточно средств!");
        }
    }
}