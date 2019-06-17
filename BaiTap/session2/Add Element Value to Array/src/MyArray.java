import java.util.Scanner;

public class MyArray {
    private static final int MAX_SIZE = 20;

    private static int enterValueInputSize(Scanner scanner) {
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > MAX_SIZE)
                System.out.println("Size should not exceed 20");
        } while (size > MAX_SIZE);
        return size;
    }

    private static void enterValueMyArray(Scanner scanner, int size, int[] myArray) {
        int index = 0;
        while (index < size) {
            System.out.print("Enter element" + (index + 1) + " : ");
            myArray[index] = scanner.nextInt();
            index++;
        }
    }

    private static void showMyArray(int[] myArray) {
        System.out.print("Property list: ");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
    }

    private static void addMyArray(int size, int[] myArray, int value, int inputIndex) {
        for (int k = size; k > inputIndex; k--) {
            myArray[k] = myArray[k - 1];
        }

        myArray[inputIndex] = value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] myArray;

        size = enterValueInputSize(scanner);

        myArray = new int[MAX_SIZE];
        enterValueMyArray(scanner, size, myArray);

        showMyArray(myArray);

        System.out.println("\n Enter value need add to array: ");
        int value = scanner.nextInt();

        System.out.println("Enter Index: ");
        int inputIndex = scanner.nextInt();

        addMyArray(size, myArray, value, inputIndex);

        showMyArray(myArray);
    }
}
