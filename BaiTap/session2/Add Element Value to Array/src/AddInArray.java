import java.util.Scanner;

public class AddInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[20];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.println("Enter value need add to array: ");
        int value = scanner.nextInt();
        System.out.println("Enter Index: ");
        int index = scanner.nextInt();

        for (int k = size; k > index; k--){
            array[k] = array[k-1];
        }
        array[index] = value;

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
