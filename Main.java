import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu daxil edin:");
        int count = sc.nextInt();
        int array[] = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+".ci elementi daxil edin:");
            array[i] = sc.nextInt();
        }
        findTotal(array);
    }

    public static int findTotal(int[] array) {
        int total = 0;
        for (int j = 0; j < array.length; j++) {
            total += array[j];
        }
        System.out.println("Cemi=" +total);
        return total;

    }


}