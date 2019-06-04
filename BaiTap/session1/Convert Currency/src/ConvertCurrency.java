import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number money: ");
        int vnd = scanner.nextInt();
        int usd = vnd*23000;

        System.out.println(vnd + " VND = " + usd + " USD");
    }
}
