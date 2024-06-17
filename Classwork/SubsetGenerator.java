import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class SubsetGenerator {
    // Generate Subset Method / Function
    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        backtrack(subsets, stack, nums, 0);
            
        return subsets;
    }
    private static void backtrack(List<List<Integer>> subsets, Stack<Integer> stack, int[] nums, int start_point) {
        subsets.add(new ArrayList<>(stack));
        
        for (int i = start_point; i < nums.length; i++) {
            stack.push(nums[i]);
            backtrack(subsets, stack, nums, i + 1);
            stack.pop(); // Backtrack
        }
    }
    public static void main(String[] args) { 
        int[] nums = {1, 2, 3};
        
        List<List<Integer>> subsets = generateSubsets(nums);
        
        System.out.println("All subsets");
        for (List<Integer> subset : subsets) {
            System.out.println(subset); 
        }
    }
}
