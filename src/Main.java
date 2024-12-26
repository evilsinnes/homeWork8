import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] orr = {1.57, 7.654, 9.986};
        int[] salary = {10000, 20000, 30000, 40000, 50000};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < orr.length; i++) {
            if (i == orr.length - 1) {
                System.out.println(orr[i]);
                break;
            }
            System.out.print(orr[i] + ", ");
        }
        for (int i = 0; i < salary.length; i++) {
            if (i == salary.length - 1) {
                System.out.println(salary[i]);
                break;
            }
            System.out.print(salary[i] + ", ");
        }


        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = orr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(orr[i]);
                break;
            }
            System.out.print(orr[i] + ", ");
        }

        for (int i = salary.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(salary[i]);
                break;
            }
            System.out.print(salary[i] + ", ");
        }

        System.out.println("задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}