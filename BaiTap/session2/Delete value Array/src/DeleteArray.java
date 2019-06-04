import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter value to delete: ");
        int value = scanner.nextInt();

        int count = 0;
        boolean isValueExist = false;

        for (int x : array) {
            if (x == value){
                isValueExist = true;
                count++;
            }
        }

        if (!isValueExist)
            System.out.println("Value not Exist");
        else {
            for (int m = 0; m < count; m++){
                for (i = 0; i <= size; i++) {
                    if (value == array[i]){
                        for (int j = i; j < size; j++){
                            array[j] = array[j + 1];
                        }
                        array[size - 1] = 0;
                        size--;
                    }
                }
            }
        }

        System.out.print("Array: ");
        i = 0;
        while (i < size) {
            System.out.print(array[i] + "\t");
            i++;
        }
        
        System.out.println(size);
    }
}
