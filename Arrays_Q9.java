package java_fundamentals;
import java.util.*;
public class Arrays_Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] nums = new int[n];

       
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 10) {
                result[index] = nums[i];
                index++;
            }
        }

       
        System.out.print("Result: [");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}