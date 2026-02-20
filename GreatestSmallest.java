import java.util.Scanner;

public class GreatestSmallest {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static MinMax findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new MinMax(min, max);
    }

    static class MinMax {
        int min;
        int max;

        MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {

       
        if (args.length > 0) {

            int[] numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Using Command Line Arguments:");
            System.out.println("Minimum: " + findMin(numbers));
            System.out.println("Maximum: " + findMax(numbers));

            MinMax result = findMinMax(numbers);
            System.out.println("Both (One Method) -> Min: " + result.min + 
                               ", Max: " + result.max);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nHow many numbers? ");
        int n = input.nextInt();

        int[] numbers2 = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numbers2[i] = input.nextInt();
        }

        System.out.println("\nUsing Scanner Input:");
        System.out.println("Minimum: " + findMin(numbers2));
        System.out.println("Maximum: " + findMax(numbers2));

        MinMax result2 = findMinMax(numbers2);
        System.out.println("Both (One Method) -> Min: " + result2.min + 
                           ", Max: " + result2.max);

        input.close();
    }
}

