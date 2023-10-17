package TASK_2.Task8;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = new String[10];

        System.out.println("Default array: ");
        for (int i = 0; i < 10; i++){
            arr[i] = "Word " + i;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nInversed array: ");
        for (int i = 0; i < 5; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;


        }
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
