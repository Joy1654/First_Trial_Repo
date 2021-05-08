import java.util.Scanner;

// Saving the left are right highest before traversing through each blocks to avoid nested for loop//
// Here O(n)+O(n)+O(n) = O(n) Time Complexity//

public class Question__29b {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the no and heights of the blocks: ");
        int[] array = new int[Input.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Input.nextInt();
        }
        System.out.println(Trap_Water(array));
    }

    public static int Trap_Water(int[] array) {
        int Water_Trapped = 0;
        int[] Left_Highest = new int[array.length];
        int[] Right_Highest = new int[array.length];

        Left_Highest[0] = array[0];
        Right_Highest[Right_Highest.length - 1] = array[Right_Highest.length - 1];

        for (int i = 1; i < Left_Highest.length; i++) {
            Left_Highest[i] = Math.max(Left_Highest[i - 1], array[i]);
        }
        for (int j = Right_Highest.length - 2; j >= 0; j--) {
            Right_Highest[j] = Math.max(Right_Highest[j + 1], array[j]);
        }

        for (int i = 0; i < array.length; i++) {
            Water_Trapped += Math.min(Left_Highest[i], Right_Highest[i]) - array[i];
        }
        return Water_Trapped;
    }
}
