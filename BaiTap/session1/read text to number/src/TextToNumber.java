import java.util.Scanner;

public class TextToNumber {
    public static String ones(int number) {
        String value;
        value = "";
        switch (number) {
            case 1:
                value = "one";
                break;
            case 2:
                value = "two";
                break;
            case 3:
                value = "three";
                break;
            case 4:
                value = "four";
                break;
            case 5:
                value = "five";
                break;
            case 6:
                value = "six";
                break;
            case 7:
                value = "sevent";
                break;
            case 8:
                value = "eight";
                break;
            case 9:
                value = "nine";
                break;
        }
        return value;
    }

    public static String tens(int number){
        String value;
        value = "";
        int tens = number/10;
        int unit = number % 10;
        switch (number){
            case 20:
                value = "twenty";
                break;
            case 30:
                value = "thirty";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                value = "twenty - " + ones(unit);
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                value = "thirty - " + ones(unit);
                break;
            default:
                value = ones(tens) + "ty - " + ones(unit);
        }
        return value;
    }

    public static String hundred(int number){
        String value;
        value = "";
        int hundred = number/100;
        int tens = number - hundred*100;
        System.out.println(ones(hundred) + " hundred - " + tens(tens));
        return value;
    }
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0 && number <10){
            System.out.println(ones(number));

        } else if (number >= 10 && number < 20) {
            switch (number){
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelfth");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100){
            System.out.println(tens(number));
        } else if (number >= 100 && number < 1000){
            System.out.println(hundred(number));
        }
    }
}
