import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Question__28 {
    public static void main(String[] args) {
        long start=System.nanoTime();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Size and Array Elements: ");
        int[] array = new int[Input.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Input.nextInt();
        }
        System.out.println("Enter the Triplet Sum: ");

        System.out.println(Triplet(array,(Input.nextInt())));
        long END=System.nanoTime();
        System.out.println(END-start);
        System.out.println("Trying Github");
        System.out.println("Trying Git");
    }

    public static boolean Triplet(int[] array,int k) {
        HashSet<Integer> Map = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
           Map.add(array[i]);
        }

        for(int i=0;i< array.length-1;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                Iterator<Integer> iterate=Map.iterator();
               while(iterate.hasNext())
               {
                   if(array[i]+array[j]+iterate.next()==k)
                   {
                       return true;
                   }
               }
            }

        }
        return false;
    }
}
